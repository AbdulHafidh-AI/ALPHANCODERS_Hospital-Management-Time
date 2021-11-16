import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Sebuah class untuk melakukan registrasi sebelum login ke aplikasi utama
 */
public class RegAcc
{
    static Scanner name = new Scanner(System.in);
    static Scanner address = new Scanner(System.in);
    static Scanner in = new Scanner(System.in);
    // Khusus untuk reg pertama akan didapatkan Id secara acak
    static int random = (int) (Math.random() * (1000000 - 100000)) + 100000;
    // convert dia ke string karena data bilangan ini akan di simpan di file database beresktensi .txt
    static String id = Integer.toString(random);
    /**
     * Sebuah method yang bertujuan untuk menambahkan akun
     * @param data
     * @throws IOException
     */
    private static void tambahAkun(ArrayList<String> data) throws IOException
    {
        // Memanggil method constructor tanpa disertai parameter
        Akun akun = new Akun();

        FileWriter fileWriter = new FileWriter("Database.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(id + "," + akun.getPin() + "," + data.get(0) + "," + data.get(2) + "," + data.get(1));
        bufferedWriter.newLine();
        bufferedWriter.flush();
        // Wajib tutup
        bufferedWriter.close();
    }
    /**
     * Sebuah method yang bertujuan untuk menghapus akun 
     * @param id
     * @throws IOException
     */
    private static void hapusAkun(String id) throws IOException
    {
        // Open database original terlebih dahulu
        File file = new File("Database.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Membuat database sementara
        File temp = new File("DatabaseTemp.txt");
        FileWriter fileWriter = new FileWriter(temp);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // Read data
        String data = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(data,",");
        // Membaca keseluruhan file
        while(data != null){
            stringTokenizer = new StringTokenizer(data, ",");
            // Move to Id
            if(id.equals(stringTokenizer.nextToken())){
                // Lewati saja
            }else{
                // Menyalin ke database sementara
                bufferedWriter.write(data);
                bufferedWriter.newLine();
            }
            data = bufferedReader.readLine();
        }
        // Menulis data ke file tersebut
        bufferedWriter.flush();
        // Ingat setelah ditulis atau dibaca jangan lupa tutup
        bufferedReader.close();
        bufferedWriter.close();
        // Menghapus database yang lama
        file.delete();
        // Mengubah nama DatabaseTemp ke nama sebelumnya
        temp.renameTo(file);
    }

    /**
     * Sebuah method yang bertujuan untuk mengecek apakah id itu wujud atau tidak wujud
     * @param id
     * @return
     * @throws IOException
     */
    private static boolean checkID(String id) throws IOException
    {
        boolean dataWujud = true;
        // Membuak file database
        FileReader fileReader = new FileReader("Database.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        // Mencari id di file database tersebut
        String data = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(data,",");
        // Membaca keseluruhan file
        while(data != null){
            stringTokenizer = new StringTokenizer(data,",");
            // Kondisi jika ditemukan id pekerja
            if(id.equals(stringTokenizer.nextToken())){
                dataWujud = true;
                break;
            }else{
                dataWujud = false;
            }
            // Membaca baris setelahnya
            data = bufferedReader.readLine();
        }
        // wajib tutup!!!
        bufferedReader.close();
        return dataWujud;
    }
    /**
     * Sebuah method yang akan mengeluarkan output
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception
    {
        String pilihan;
        String konfirmasi;

        System.out.println("=== REGISTRASI PEKERJA RUMAH SAKIT ===");
        System.out.println("1. Membuat akun");
        System.out.println("2. Menghapus akun");
        System.out.println("Pilih: ");
        pilihan = in.nextLine();

        switch (pilihan) {
            case "1":
                // Inisialisasi varibel dalam kasus membuat akun pekerja rumah sakit
                String nama, alamat, jk;
                // DATA COLLECTION
                ArrayList<String> data = new ArrayList<>();

                System.out.println("Silahkan isi formulir berikut ini!!");
                System.out.print("Nama lengkap: ");
                nama = in.nextLine();
                data.add(nama);
                System.out.print("Alamat: ");
                alamat = in.nextLine();
                data.add(alamat);
                System.out.print("Jenis kelamin: (L/P) ");
                jk = in.nextLine();
                data.add(jk);

                // Menambah akun
                tambahAkun(data);
                System.out.println("ID anda adalah " + id + "dengan pin akun 5555");
                break;
            case "2":
                System.out.println("Masukkan id untuk akun yang ingin anda hapus");
                System.out.println("ID : ");
                id = in.nextLine();
                System.out.println("Apakah anda yakin untuk menghapus akun anda?");
                System.out.println("Jawab (y/n): ");
                konfirmasi = in.nextLine();

                if(konfirmasi.equals("y")){
                    // Cek Id apakah ada atau tidak ada
                    if(checkID(id)){
                        hapusAkun(id);
                    }else{
                        System.out.println("Anda tidak bisa menghapus akun dikarenakan id anda belum terdaftar");
                        System.exit(0);
                    }
                }else{
                    System.out.println("Terima kasih");
                }
                break;
            default:
                System.err.println("Maaf pilihan yang anda masukkan tidak tersedia");
                break;
        }
    }
}
