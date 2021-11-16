import java.io.IOException;
/**
 *  Sebuah class abstract untuk membantu menjadikan method yang ditimpanya olehnya menjadi tipe data (composition)
 * @author Alphancoders
 * @version 2021.11.17
 */
abstract class Pekerja
{
    // Fields
    private String id;
    private Akun workers;

    public Pekerja() throws IOException
    {
    
    }

    // Method constructor
    public Pekerja(String id) throws Exception
    {
        this.id = id;

        // Using composition technique
       
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
    public abstract String getNama() throws IOException;
   
    
}
