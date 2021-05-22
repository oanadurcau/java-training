package code._4_student_effort.CodeChallenge1;


public class BoxMatch {
    private Fighter fighter1, fighter2;

    public BoxMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public Fighter getFighter1() {
        return fighter1;
    }

    public void setFighter1(Fighter fighter1) {
        this.fighter1 = fighter1;
    }

    public Fighter getFighter2() {
        return fighter2;
    }

    public void setFighter2(Fighter fighter2) {
        this.fighter2 = fighter2;
    }

    public String fight(Fighter fighter1, Fighter fighter2) {
        while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
        }
        if (fighter1.getHealth() <= 0) {
            return fighter1.getName();
        } else {
            return fighter2.getName();
        }
    }

    public static void main(String[] args) {
        Fighter f1 = new Fighter("F1", 100, 10);
        Fighter f2 = new Fighter("F2", 100, 10);
        BoxMatch boxingMatch = new BoxMatch(f1, f2);
        String winner = boxingMatch.fight(f1, f2);
        System.out.println(winner);
    }
}
