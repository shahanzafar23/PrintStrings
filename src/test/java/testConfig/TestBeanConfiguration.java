package testConfig;

import beans.FileWriter;
import beans.FileWriterImpl;
import beans.NumberModel;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doNothing;

@Configuration
public class TestBeanConfiguration {
    @Bean
    public NumberModel number() {
        NumberModel mockNumber = Mockito.mock(NumberModel.class);
        return mockNumber;
    }

    @Bean
    public FileWriter fileWriter() {
        FileWriterImpl mockFileWriter = Mockito.mock(FileWriterImpl.class);
        doNothing().when(mockFileWriter).open(anyString());
        doNothing().when(mockFileWriter).printLine(anyString());
        doNothing().when(mockFileWriter).close();
        return mockFileWriter;
    }
}
