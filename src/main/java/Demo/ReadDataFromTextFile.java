package Demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadDataFromTextFile {

    FileReader fr = new FileReader("\"C:\\Users\\hiwant.sunil\\Web Development Projects\\Useful Commands-Notes\\Infosys Certifications.txt\"");
    BufferedReader br = new BufferedReader(fr);
    

    public ReadDataFromTextFile() throws FileNotFoundException {
    }
}
