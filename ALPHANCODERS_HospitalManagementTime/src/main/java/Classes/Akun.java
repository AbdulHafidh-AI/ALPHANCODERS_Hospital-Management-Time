package Classes;

import java.io.IOException;
/**
 * Sebuah class abstract untuk membantu menjadikan method yang ditimpanya menjadi tipe data (composition)
 * @author Alphancoders
 * @version 2021.11.17
 */
public abstract class Akun
{

    // Fields
    private int pin;

    /**
     * Sebuah method constructor dengan pin bawaan
     */
    public Akun()
    {
        this.pin = 5555;
    }

    /**
     * Sebuah method constructor dengan adanya parameter
     * @param id
     * @throws IOException
     */
    public Akun(String id) throws IOException
    {
        // Mendapatkan pin dari database
        this.pin = getPin(id);
    
    }

    /**
     * Sebuah method getter untuk mendapatkan pin
     * @return
     */
    public int getPin()
    {
        return this.pin;
    }

    /**
     * Sebuah method abstract yang bertujuan untuk ditimpa dengan method lain yang bertujuan untuk mendapatkan pin
     * @param id
     * @return
     * @throws IOException
     */
    public abstract int getPin(String id) throws IOException;

    /**
     * Sebuah method abstract yang bertujuan untuk ditimpa dengan method lain yang bertujuan untuk mengeset pin
     * @param id
     * @return
     * @throws IOException
     */
    public abstract void setPin(int newPin) throws IOException;
    

}
