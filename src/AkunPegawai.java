import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
/**
 * Sebuah class yang merupakan anak dari class Akun
 * 
 * @author Alphancoders
 * @version 2021.11.18
 */
public class AkunPegawai extends Akun
{

    // Fields 
    private int pin;
    private String id;


    /**
    * Sebuah method constructor
    */
    public AkunPegawai()
    {

    }
    /**
     * Membuat Method Constructor dengan parameter
     * 
     * @param id
     * @throws IOException
     */
    public AkunPegawai(String id) throws IOException
    {
        this.id = id;
        // Mendapatkan pin dari database
        this.pin = getPin(id);
    }

    /**
     * Sebuah method getter yang bertujuan untuk mendapatkan nilai Pin
     * 
     * @param id
     * @throws IOException
     */
    @Override
    public int getPin(String id) throws IOException
    {
        FileReader fileReader = new FileReader("DatabasePegawai.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        // Membaca satu baris saja
        String data = bufferedReader.readLine();
        // Mengambil data dengan fungsi delimiter koma(,)
        StringTokenizer stringTokenizer = new StringTokenizer(data,",");
        // Membaca sampai akhir dari file database
        while (data != null){
            stringTokenizer = new StringTokenizer(data, ",");
            // Menemukan pin berdasarkan id yang ditentukan
            if(id.equals(stringTokenizer.nextToken())){
                // Mendapatkan pin
                this.pin = Integer.parseInt(stringTokenizer.nextToken());
                break;
            }else{
                // Membaca baris setelahnya karena bisa jadi yang sebelumnya tidak ditemukan
                data = bufferedReader.readLine();
            }
        }
        // wajib ditutup
        bufferedReader.close();

        return this.pin;
    }

    /**
     * Sebuah method setter untuk mengset Pin ke file database
     * 
     * @param newPin
     * @throws IOException
     */
    @Override
    public void setPin(int newPin) throws IOException
    {
        // Membuka file database 
        File file = new File("DatabasePegawai.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Membuat file DatabaseTemp
        File temp = new File("TempDatabasePegawai.txt");
        FileWriter fileWriter = new FileWriter(temp);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // Read data
        String data = bufferedReader.readLine();
        // Membaca file dan memisahkanya dengan fungsi delimiter yang ditandai dengan koma
        StringTokenizer stringTokenizer = new StringTokenizer(data, ",");
        // Membaca keseluruhan file
        while(data != null)
        {
            stringTokenizer = new StringTokenizer(data, ",");
            // Move to id
            if(id.equals(stringTokenizer.nextToken())){
                // Go to old pin
                stringTokenizer.nextToken();
                // receive name
                String nama = stringTokenizer.nextToken();
                // receive gender
                String jk = stringTokenizer.nextToken();
                // receive address
                String alamat = stringTokenizer.nextToken();
                // copy ke databaseTemp
                bufferedWriter.write(id + "," + Integer.toString(newPin) + "," + nama + "," + jk + "," + alamat);
            }else{
                // Copy ke databaseTemp
                bufferedWriter.write(data);
                bufferedWriter.newLine();
            }
            data = bufferedReader.readLine();
        }
        // Menulis data ke file database
        bufferedWriter.flush();

        // wajib tutup!!!
        bufferedReader.close();
        bufferedWriter.close();

        // Delete database yang lama
        file.delete();
        // Karena database yang lama itu sudah di delete maka kita harus merenamenya seperti yang sebelum di delete tadi untuk database temp ini
        temp.renameTo(file);
    }
}
