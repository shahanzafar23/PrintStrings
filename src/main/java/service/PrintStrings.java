package service;

import beans.FileWriter;
import beans.NumberModel;

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
            fileWriter.printLine("Hi I'm a demo string printed x number of times with index appended in it in order to make it unique" + index);
        }
        fileWriter.close();
    }
}
