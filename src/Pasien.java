/**
 * 
 * @author Alphancoders
 */
public class Pasien 
{
    private int jumlahPasien;
    private int jamKerjaMinimal;

    public Pasien(){

    }

    /**
     * Untuk menentukan jumlah pasien agar mudah mengatur jadwal
     * @param jumlahPasien dari hasil random
     */
    public void setJumlahPasien(int jumlahPasien){
        this.jumlahPasien = jumlahPasien;
    }

    /**
     * Untuk menentukan jumlah jam kerja minimal perhari berdasarkan jumlah pasien
     */
    public void setJamKerjaMinimal(){


        if (this.jumlahPasien > 0 && this.jumlahPasien < 30) {
            this.jamKerjaMinimal = 3;
        }
        else if (this.jumlahPasien >= 30 && this.jumlahPasien < 50) {
            this.jamKerjaMinimal = 5;
        }
        else if (this.jumlahPasien >= 50 && this.jumlahPasien < 80) {
            this.jamKerjaMinimal = 8;
        }
        else if (this.jumlahPasien >= 50 && this.jumlahPasien <= 100) {
            this.jamKerjaMinimal = 12;
        }
        else {
        
        }
    }

    /**
     * 
     * @return jumlah jam kerja minimal
     */
    public int getJamKerjaMinimal(){
        return this.jamKerjaMinimal;
    }
}
