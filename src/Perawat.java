/**
 * 
 * @author Alphancoders
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Perawat extends Pekerja{

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
    public Perawat()throws IOException{

     perawat = new AkunPerawat();

    }

    /**
     * Perawat constructor
     * @param id
     * @throws IOException
     */
    public Perawat(String id) throws IOException{
     
     this.id = id;
     perawat = new AkunPerawat(id);

    }

    /**
     * getId method
     */
    public String getId(){

        return this.id;

    }

    /**
     * setPin method
     * @param pin
     * @throws IOException
     */
    @Override
    public void setPin(int pin) throws IOException {

        perawat.setPin(pin);

    }

    /**
     * getPin method
     * @throws IOException
     */
    @Override
    public int getPin() throws IOException {
        
        return perawat.getPin(id);

    }

    /**
     * getNama method
     * @throws IOException
     */
    @Override
    public String getNama() throws IOException {
        
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
