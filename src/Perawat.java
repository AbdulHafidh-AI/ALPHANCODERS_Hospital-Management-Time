import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
/**
 * Sebuah class yang bertujuan untuk bisa login di class utama yang kerjaanya sebagai perawat
 * @author Alphancoders
 * @version 2021.18.11
 */
public class Perawat extends Pekerja
{

    /**
     * Atrribute from Perawat class
     */
    private String nama;
    private String id;
    private AkunPerawat perawat;
    
    
    /**
     * Perawat constructor
     * @throws IOException
     */
    public Perawat()throws IOException
    {
        // Composition Method
     perawat = new AkunPerawat();

    }

    /**
     * Sebuah method constructor pada kelas ini
     * @param id
     * @throws IOException
     */
    public Perawat(String id) throws IOException{
     
     this.id = id;
     // Composition Method
     perawat = new AkunPerawat(id);

    }

    /**
     * Sebuah method getter untuk mendaptkan id
     */
    public String getId(){

        return this.id;

    }

    /**
     * setPin method yang ditimpa dari class pekerja untuk mengeset pin
     * @param pin
     * @throws IOException
     */
    @Override
    public void setPin(int pin) throws IOException 
    {

        perawat.setPin(pin);
    }

    /**
     * Sebuah method untuk mendaptkan pin yang ditimpa dari class Pekerja
     * @throws IOException
     */
    @Override
    public int getPin() throws IOException
    {
        
        return perawat.getPin(id);

    }

    /**
     * Sebuah method getter untuk mendapatkan nama dari si pendaftar
     * @throws IOException
     */
    @Override
    public String getNama() throws IOException
    {
        
        FileReader fileReader = new FileReader("DatabasePerawat.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String data = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(data,",");
    
        while(data != null){
        
            stringTokenizer = new StringTokenizer(data,",");
            
            if(id.equals(stringTokenizer.nextToken())){

                stringTokenizer.nextToken();
                this.nama = stringTokenizer.nextToken();
                break;

            }else{

                data = bufferedReader.readLine();

            }
        }
        
        bufferedReader.close();

        return this.nama;

    }

}
