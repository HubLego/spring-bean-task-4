package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

/*
   Этот класс НЕ является @Component,
   потому что его бин создаётся вручную в AppConfig через @Bean метод.
   Получает Needle7 через setter injection.
 */
public class Egg6 {

    private Needle7 needle;

    @Autowired  // Setter injection для Needle7
    public void setNeedle(Needle7 needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
