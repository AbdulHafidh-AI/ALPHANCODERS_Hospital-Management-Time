package Classes;

/**
 * Sebuah class pada pasien yang bertujuan untuk menentukan jadwal kerja pada dokter dan perawat berdasarkan jumlah pasien
 * @author Alphancoders
 * @version 2021.11.17
 */
public class Pasien 
{
    private int jumlahPasien;
    private int jamKerjaMinimal;
    private int jadwal;

    /**
     * Sebuah method constructor pada class Pasien dengan mengeset nilai pada jumlahPasien secara random
     */
    public Pasien(){
        // Mendapatkan nilai dari jumlah pasien secara random
        this.jumlahPasien = (int) (1 + Math.random() * (100 - 1));
    }

    /**
     * Sebuah method accessor untuk mendapatkan jadwal kerja sesuai jumlah pasien
     * @return this.jamKerjaMinimal
     */
    public int getJamKerjaMinimal()
    {
        if (this.jumlahPasien > 0 && this.jumlahPasien < 30){
            this.jamKerjaMinimal = 3;
        }
        else if (this.jumlahPasien >= 30 && this.jumlahPasien < 50){
            this.jamKerjaMinimal = 5;
        }
        else if (this.jumlahPasien >= 50 && this.jumlahPasien < 80){
            this.jamKerjaMinimal = 8;
        }
        else{
            this.jamKerjaMinimal = 12;
        }
        return this.jamKerjaMinimal;
    }

    /**
     * Sebuah method untuk memilih jadwal sesuai yang diinginkan
     * @param jadwal
     */
    public void setJadwal(int jadwal)
    {
        this.jadwal = jadwal;
    }

    /**
     * Sebuah method untuk mendapatkan variabel dari nilai jadwal
     * @return this.jadwal
     */
    public int getJadwal()
    {
        return this.jadwal;
    }
    /**
     * Sebuah method toString yang bertujuan untuk memberikan informasi terkait jam kerja
     * @return pernyataan
     */
    public String toString()
    {
        String pernyataan = "Null";
        if(this.jamKerjaMinimal == 3){
            pernyataan = "JAM KERJA ANDA MINIMAL 3 JAM";
        }else if(this.jamKerjaMinimal == 5){
            pernyataan = "JAM KERJA ANDA MINIMAL 5 JAM";
        }else if(this.jamKerjaMinimal == 8){
            pernyataan = "JAM KERJA ANDA MINIMAL 8 JAM";
        }else{
            pernyataan = "JAM KERJA ANDA MINIMAL 12 JAM";
        }
        return pernyataan;
    }
}
