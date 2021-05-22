package code._4_student_effort.CodeChallenge3;

public class TestAnimals {
    public static void main(String[] args) {

        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();


        d.eat();
        d.walk();

        c.getName();
        c.walk();
        c.play();

    }
}
