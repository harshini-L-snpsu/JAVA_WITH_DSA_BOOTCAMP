package DAY5.SESSION3;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionUsingTryCatch {
    public static void main(String[] args) {
        try{
            FileReader file= new FileReader("data.txt");
        }catch(IOException e){
System.out.println("File Not Found");
        }
    }
}
