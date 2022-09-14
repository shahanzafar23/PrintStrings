package beans;

public interface FileWriter {
    void open(String fileName);

    void printLine(String s);

    void close();
}
