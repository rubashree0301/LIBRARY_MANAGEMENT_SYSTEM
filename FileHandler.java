package libpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
	public static void writeFile(int bookId,String entryDetails){
        String fileName="src/libpackage/"+bookId+"entry.txt";
        File file = new File(fileName); 
        try {
        	System.out.println(file.getAbsolutePath()+" "+fileName+" "+entryDetails);
            FileWriter writer=new  FileWriter(file,true);
            writer.write(entryDetails+"\n");
            writer.close();
            System.out.println("write success");
        }
        catch(IOException e){
            System.out.println("error writing to file");

        }
         catch (Exception e) {
            System.out.println("error occured"+e.getMessage());
        }
    }

   
    public static void readFile(int accNo) {
        String fileName="entry.txt";
        try {
            BufferedReader reader=new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("file reading Started");
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }


        }catch(IOException e){
            System.out.println("error readinggg file");
        }
         catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }
    
}