package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {
    /*
       Ocean1 — компонент, бин создаётся автоматически (@Component).
       Island2 — бин создаётся вручную через метод @Bean в AppConfig.
       Связь: Ocean1 → Island2 через field injection
       В AppConfig есть метод с аннотацией @Bean, который создает бин Island2

       Ocean1, через поле island получает бин Island2
     */

    @Autowired
    private Island2 island;

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
