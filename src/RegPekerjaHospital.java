import javax.swing.*;
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
 * Sebuah class yang bertujuan untuk melakukan registrasi sehingga data-data pekerja rumah sakit dapat disimpan di database
 * @author Alphancoders
 * @version 2021.19.11
 */
public class RegPekerjaHospital
{
    // Fields / Variabel global dan memanggi method global
    static Scanner name = new Scanner(System.in);
    static Scanner address = new Scanner(System.in);
    static Scanner in = new Scanner(System.in);
    // Khusus untuk reg pertama akan didapatkan Id secara acak
    static int random = (int) (Math.random() * (1000000 - 100000)) + 100000;
    // convert dia ke string karena data bilangan ini akan di simpan di file database beresktensi .txt
    static String id = Integer.toString(random);
    private JPanel Registrasi;
    private JButton dokterButton;
    private JButton perawatButton;
    private JButton pegawaiButton;

    private static void tambahAkunDokter(ArrayList<String> data) throws IOException
    {
        // Memanggil method constructor tanpa disertai parameter
        Akun akun = new AkunDokter();

        FileWriter fileWriter = new FileWriter("DatabaseDokter.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(id + "," + akun.getPin() + "," + data.get(0) + "," + data.get(2) + "," + data.get(1));
        bufferedWriter.newLine();
        bufferedWriter.flush();
        // Wajib tutup
        bufferedWriter.close();
    }

    private static void hapusAkunDokter(String id) throws IOException
    {
        // Open database original terlebih dahulu
        File file = new File("DatabaseDokter.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Membuat database sementara
        File temp = new File("TempDatabaseDokter.txt");
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

    // Method untuk mengecek id
    private static boolean checkIDDokter(String id) throws IOException
    {
        boolean dataWujud = true;
        // Membuak file database
        FileReader fileReader = new FileReader("DatabaseDokter.txt");
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
    private static void tambahAkunPerawat(ArrayList<String> data) throws IOException
    {
        // Memanggil method constructor tanpa disertai parameter
        Akun akun = new AkunPerawat();

        FileWriter fileWriter = new FileWriter("DatabasePerawat.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(id + "," + akun.getPin() + "," + data.get(0) + "," + data.get(2) + "," + data.get(1));
        bufferedWriter.newLine();
        bufferedWriter.flush();
        // Wajib tutup
        bufferedWriter.close();
    }

    private static void hapusAkunPerawat(String id) throws IOException
    {
        // Open database original terlebih dahulu
        File file = new File("DatabasePerawat.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Membuat database sementara
        File temp = new File("TempDatabasePerawat.txt");
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

    // Method untuk mengecek id
    private static boolean checkIDPerawat(String id) throws IOException
    {
        boolean dataWujud = true;
        // Membuak file database
        FileReader fileReader = new FileReader("DatabasePerawat.txt");
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
    private static void tambahAkunPegawai(ArrayList<String> data) throws IOException
    {
        // Memanggil method constructor tanpa disertai parameter
        Akun akun = new AkunPegawai();

        FileWriter fileWriter = new FileWriter("DatabasePegawai.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(id + "," + akun.getPin() + "," + data.get(0) + "," + data.get(2) + "," + data.get(1));
        bufferedWriter.newLine();
        bufferedWriter.flush();
        // Wajib tutup
        bufferedWriter.close();
    }

    private static void hapusAkunPegawai(String id) throws IOException
    {
        // Open database original terlebih dahulu
        File file = new File("DatabasePegawai.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Membuat database sementara
        File temp = new File("TempDatabasePegawai.txt");
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

    // Method untuk mengecek id
    private static boolean checkIDPegawai(String id) throws IOException
    {
        boolean dataWujud = true;
        // Membuak file database
        FileReader fileReader = new FileReader("DatabasePerawat.txt");
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
}
