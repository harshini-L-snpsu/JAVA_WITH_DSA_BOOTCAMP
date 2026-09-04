package DAY5.SESSION3;

import java.io.FileReader;
import java.io.IOException;

public class CheckewdExceptionUsingThrows {
    public static void openFile() throws IOException{
        FileReader file = new FileReader("data.text");
    }
    public static void main(String[] args) {
        try{
            openFile();
        }catch(IOException e) {
            System.out.println("Unabble to open File");
        }
        }
    }

