/**
 * Sebuah class untuk mendapatkan informasi dari pekerja rumah sakit (dokter, perawat, dan pegawai)
 * @author Alphancoders
 * @version 2021.16.11
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Pekerja {
    // Fields
    private String nama;
    private String id;
    private Akun workers;


    /**
     * Sebuah method constructor tanpa adanya paramaeter
     */
    public Pekerja()
    {

    }

    /**
     * Sebuah Method constructor dengan parameter 
     * @param id
     * @throws Exception
     */
    public Pekerja(String id) throws Exception
    {
        this.id = id;

        // Using composition technique
        workers = new Akun(id);
    }
    // get id workers;
    public String getId()
    {
        return this.id;
    }

    // Mengubah pin workers, dan juga merubahnya pada class Akun
    public void setPin(int pin) throws IOException
    {
        // Mengubah pin
        workers.setPin(pin);
    }

    // Mendapatkan pin
    public int getPin() throws IOException
    {
        return workers.getPin(id);
    }

    // Mendapatkan nama workers
    public String getNama() throws IOException
    {
        FileReader fileReader = new FileReader("Database.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        // Membaca untuk satu baris
        String data = bufferedReader.readLine();
        // Mengambil data yang dipisahkan dengan koma dengan memakai fungsi delimiter
        StringTokenizer stringTokenizer = new StringTokenizer(data,",");
        // Membaca keseluruhan file
        while (data != null){
            stringTokenizer = new StringTokenizer(data, ",");
            // Move to ID
            if(id.equals(stringTokenizer.nextToken())){
                // Pindah pin
                stringTokenizer.nextToken();
                // Setelah dipindah didapatkan nama
                this.nama = stringTokenizer.nextToken();
                break;
            }else{
                // Membaca baris selanjutnya jika baris pertama tidak ada yg memenuhi syarat yang diminta
                data = bufferedReader.readLine();
            }
        }
        bufferedReader.close();
        return this.nama;
    }

}
