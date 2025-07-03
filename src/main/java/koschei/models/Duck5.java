package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {
    /*
       Связь: Duck5 → Egg6 через field injection
       Spring автоматически подтянет бин Egg6, который создаётся через @Bean метод в AppConfig
     */
    @Autowired  // Field injection для Egg6
    private Egg6 egg;

    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }
}
