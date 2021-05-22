package code._4_student_effort.CodeChallenge3;

public class Fish extends Animal {

    protected Fish() {
        super(0);
    }

    @Override
    void eat() {
        System.out.println("The fish eats");
    }

    @Override
    void walk() {
        System.out.println("The fish can't walk");
    }

}
