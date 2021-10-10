package ua.zhekon;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("ua.zhekon")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
//    @Bean
//    public ClassicalMusic classicalMusic(){
//        return new ClassicalMusic();
//    }

}
