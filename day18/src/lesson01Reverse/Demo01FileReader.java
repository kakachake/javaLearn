package lesson01Reverse;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* */
public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("fileReader.txt");
        char[] ch = new char[1024];
        fr.read(ch);
        System.out.println(new String(ch));
        fr.close();
    }
}
