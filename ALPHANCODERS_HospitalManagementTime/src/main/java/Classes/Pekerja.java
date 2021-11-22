package Classes;
import java.io.IOException;
/**
 *  Sebuah class abstract untuk membantu menjadikan method yang ditimpanya olehnya menjadi tipe data (composition)
 * @author Alphancoders
 * @version 2021.11.17
 */
public abstract class Pekerja
{
    // Fields
    private String id;
    /**
     * Sebuah method constructor tanpa adanya parameter
     * @throws IOException
     */
    public Pekerja() throws IOException
    {
    
    }
    /**
     * Sebuah method constructor dengan adanya parameter
     * @param id
     * @throws Exception
     */
    public Pekerja(String id) throws Exception
    {
        this.id = id;
    }
    /**
     * Sebuah method untuk mendapatkan ID
     * @return this.id
     */
    public String getId()
    {
        return this.id;
    }

    /**
     * Sebuah method abstract untuk mengeset nilai pin
     * @param pin
     * @throws IOException
     */
    public abstract void setPin(int pin) throws IOException;
    
    /**
     * Sebuah method abstract untuk mendapatkan nilai pin
     * @return
     * @throws IOException
     */
    public abstract int getPin() throws IOException;
   
    /**
     * Sebuah method abstract untuk mendapatkan nilai dari nama
     * @return
     * @throws IOException
     */
    public abstract String getNama() throws IOException;
   
    
}
