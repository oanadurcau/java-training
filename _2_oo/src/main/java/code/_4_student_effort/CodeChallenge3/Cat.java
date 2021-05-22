package code._4_student_effort.CodeChallenge3;

public class Cat extends Animal implements Pet {
    String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
    }

    protected Cat(int legs) {
        super(legs);
    }

    @Override
    void eat() {
        System.out.println("The cat eats");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public void play() {
        System.out.println("The cat plays");

    }

    void walk() {
        System.out.println("The cat walks with " + legs + " legs");
    }
}
