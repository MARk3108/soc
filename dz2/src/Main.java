import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animals> farm= new ArrayList<Animals>();
        farm.add(new Cat("Barsic","black"));
        farm.add(new Cat("Farsik","orange"));
        farm.add(new Cow("murka","white"));
        farm.add(new Dog("Sharik","Black"));
        farm.add(new Dolphin("Swimer","blue"));
        for (int i = 0; i < farm.size(); i++) {
            farm.get(i).sound();
            farm.get(i).info();
        }
    }
}
