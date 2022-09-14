package service;

import beans.FileWriter;
import beans.NumberModel;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import testConfig.TestBeanConfiguration;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class PrintStringsTest {
    @Test
    public void test_print_strings_x_times() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestBeanConfiguration.class);
        NumberModel number = applicationContext.getBean("number", NumberModel.class);
        FileWriter fileWriter = applicationContext.getBean("fileWriter", FileWriter.class);

        PrintStrings printStrings = new PrintStrings(number, fileWriter);

        //x is 100
        when(number.getX()).thenReturn(100);
        printStrings.setNumber(100);

        //Printing strings
        printStrings.printStrings();

        //Verify if everything goes right
        verify(fileWriter, times(1)).open(anyString());
        verify(fileWriter, times(100)).printLine(anyString());
        verify(fileWriter, times(1)).close();
    }

}
