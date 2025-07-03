package koschei.models;

/*
   Этот класс НЕ является @Component,
   потому что его бин создаётся вручную в AppConfig через @Bean метод.
   Получает зависимость Wood3 через конструктор там же.
   Wood3 — компонент с аннотацией @Component, бин создаётся автоматически.
 */
public class Island2 {

    private final Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
