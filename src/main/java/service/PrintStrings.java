package service;

import beans.FileWriter;
import beans.NumberModel;
import org.apache.commons.lang3.RandomStringUtils;

public class PrintStrings {
    private NumberModel number;

    private FileWriter fileWriter;

    private static final String FILE_NAME = "file.txt";

    public PrintStrings(NumberModel numberModel, FileWriter fileWriter) {
        this.number = numberModel;
        this.fileWriter = fileWriter;
    }

    public void setNumber(int x)
    {
        number.setX(x);
    }

    public void printStrings()
    {
        fileWriter.open(FILE_NAME);
        for(int index = 0 ; index < number.getX(); index++)
        {
            fileWriter.printLine(RandomStringUtils.random(100, true, true));
        }
        fileWriter.close();
    }
}
