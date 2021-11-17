/**
 * 
 * @author Alphancoders
 */
public class RumahSakit 
{
     //Field
     private String nama;
     private String kota;
     /**
      * method constructor di class RumahSakit
      */
     public RumahSakit()
     {
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
}