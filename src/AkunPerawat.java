/**
 * 
 * @author Alphancoders
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class AkunPerawat extends Akun {

    /**
     * Attribute from AkunPerawat class
     */
    private int pin;
    private String id;

    /**
     * AkunPerawat constructor
     */
    public AkunPerawat(){

    }

    /**
     * AkunPerawat constructor
     * @param id
     * @throws IOException
     */
    @Override
    public AkunPerawat(String id) throws IOException{
        
        this.id = id;
        this.pin = getPin(id);

    }

    /**
     * getPin method
     * @param id
     * @throws IOException
     */
    @Override
    public int getPin(String id) throws IOException {

        FileReader fileReader = new FileReader("DatabasePerawat.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String data = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(data,",");
       
        while(data != null){
           
            stringTokenizer = new StringTokenizer(data,",");
            
            if(id.equals(stringTokenizer.nextToken())){

                this.pin = Integer.parseInt(stringTokenizer.nextToken());
                break;

            }else{

                data = bufferedReader.readLine();

            }
        }
        
        bufferedReader.close();

        return this.pin;
        
    }

    /**
     * setPin method
     * @param newPin
     * @throws IOException
     */
    public void setPin(int newPin) throws IOException{

        File file = new File("DatabasePerawat.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        File temp = new File("TempDatabasePerawat.txt");
        FileWriter fileWriter = new FileWriter(temp);
        BufferedWriter bufferedWriter = new bufferedWriter(fileWriter);

        String data = bufferedReader.readLine();
        StringTokenizer = new StringTokenizer(data, ",");
        
        while(data != null){

            StringTokenizer = new StringTokenizer(data, ",");

            if(id.equals(stringTokenizer.nextToken())){

                stringTokenizer.nextToken();
                String nama = stringTokenizer.nextToken();
                String jk = stringTokenizer.nextToken();
                String alamat = stringTokenizer.nextToken();
                bufferedWriter.write(id + "," + Integer.toString(newPin) + "," + alamat);

            }else {

                bufferedWriter.write(data);
                bufferedWriter.newLine();

            }

            data = bufferedReader.readLine();

        }

        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();

        file.delete();
        temp.renameTo(file);

    }
  
}
