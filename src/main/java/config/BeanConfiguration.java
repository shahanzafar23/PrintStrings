package config;

import beans.FileWriter;
import beans.FileWriterImpl;
import beans.NumberModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public NumberModel number(){
        return new NumberModel();
    }

    @Bean
    public FileWriter fileWriter() {
        return new FileWriterImpl();
    }
}
