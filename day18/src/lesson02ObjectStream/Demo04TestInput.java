package lesson02ObjectStream;

import java.io.*;

public class Demo04TestInput {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day18\\b.txt"));
        Object arr = ois.readObject();
        System.out.println(arr.toString());
    }
}
