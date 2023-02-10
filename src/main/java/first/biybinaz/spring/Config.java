package first.biybinaz.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("first.biybinaz.spring")
@PropertySource("classpath:musicPlayer.properties")
public class Config {

}
