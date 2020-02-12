package library;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLibraryAutoConfig {
    @Bean
    @ConditionalOnProperty(value = "my.property", havingValue = "default")
    MyLibraryClass myLibraryClass() {
        return new MyLibraryClass("default");
    }

    @Bean
    @ConditionalOnProperty(value = "my.property", havingValue = "custom")
    MyLibraryClass myLibraryClassCustom() {
        return new MyLibraryClass("custom");
    }

    @Bean
    @ConditionalOnExpression("2+2 == 4")
    @ConditionalOnProperty(value = "my.property", havingValue = "multipleChecks")
    MyLibraryClass myLibraryClassCustomTwo() {
        return new MyLibraryClass("custom with expression");
    }
}
