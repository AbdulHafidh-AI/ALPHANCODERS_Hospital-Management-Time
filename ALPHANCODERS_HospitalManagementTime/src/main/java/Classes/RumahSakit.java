package Classes;

/**
 * sebuah class untuk mendapatkan informasi dari rumah sakit
 * @author Alphancoders
 * @version 2021.11.17
 */
public class RumahSakit 
{
     //Field
     private String nama;
     private String kota;
     private String namaPemilik;
     private String namaNegara;
     /**
      * method constructor di class RumahSakit
      */
     public RumahSakit()
     {
          this.namaPemilik = "Alphan";
          this.namaNegara = "Indonesia";
          this.nama = "Alphan Hospital";
     }
     /**
      * Method Setter untuk mengset Kota yang di inginkan
      * @param kota
      */
     public void setKota(String kota)
     {
          this.kota = kota;
     }
     /**
      * sebuat Method getter untuk mendapatkan nilai dari variable kota
      * @return this.kota
      */
     public String getKota()
     {
          return this.kota;
     }
     /**
      * sebuah method accessor untuk mendapatkan nilai nama
      * @return this.nama
      */
     public String getnama()
     {
          return this.nama;
     }
     /**
      * sebuah method accessor untuk mendapatkan nilai nama negara
      * @return this.namaNegara
      */
     public String getNamaNegara()
     {
          return this.namaNegara;
     }
     /**
      * sebuah method accessor untuk mendapatkan nilai nama pemilik
      * @return this.namaPemilik
      */
     public String getNamaPemilik()
     {
          return this.namaPemilik;
     }
}