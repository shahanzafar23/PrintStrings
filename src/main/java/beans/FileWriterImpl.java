package beans;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriterImpl implements FileWriter {
    private PrintWriter printWriter;

    @Override
    public void open(String fileName) {
        try{
            printWriter = new PrintWriter(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void printLine(String s) {
        try {
            printWriter.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        try{
            printWriter.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
