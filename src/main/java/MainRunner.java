import beans.FileWriter;
import beans.NumberModel;
import config.BeanConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.PrintStrings;

public class MainRunner {
    public static void main(String [] args)
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        NumberModel number = applicationContext.getBean("number", NumberModel.class);
        FileWriter fileWriter = applicationContext.getBean("fileWriter", FileWriter.class);
        PrintStrings printStrings = new PrintStrings(number, fileWriter);
        printStrings.setNumber(100);
        printStrings.printStrings();
    }
}
