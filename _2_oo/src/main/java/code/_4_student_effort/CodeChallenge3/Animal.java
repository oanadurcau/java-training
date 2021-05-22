package code._4_student_effort.CodeChallenge3;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    abstract void eat();

    void walk() {
        System.out.println("The animal walks with " + legs + " legs");
    }
}
