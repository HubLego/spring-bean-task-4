package koschei.config;

import koschei.models.Egg6;
import koschei.models.Island2;
import koschei.models.Needle7;
import koschei.models.Wood3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    /*
       Ручное создание бина Island2 с зависимостью Wood3
       Wood3 будет автоматически подтянут из контекста Spring
     */
    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    /*
       Ручное создание бина Egg6 с зависимостью Needle7
       Needle7 будет автоматически подтянут из контекста Spring
     */
    @Bean
    public static Egg6 getEgg(Needle7 needle) {
        Egg6 egg = new Egg6();
        egg.setNeedle(needle);  // Устанавливаем зависимость через setter
        return egg;
    }
}
