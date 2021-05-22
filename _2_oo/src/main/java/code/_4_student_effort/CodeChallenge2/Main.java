package code._4_student_effort.CodeChallenge2;

public class Main {

    static Premiu oscar1990 = new Premiu("oscar", 1990);
    static Premiu oscar2000 = new Premiu("oscar", 2000);
    static Premiu oscar2010 = new Premiu("oscar", 2010);
    static Premiu oscar2018 = new Premiu("oscar", 2018);

    static Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
    static Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
    static Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
    static Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
    static Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
    static Actor actorFaraPremii03 = new Actor("actor fara oscar 02", 20, new Premiu[]{});

    static Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
    static Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
    static Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
    static Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
    static Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

    static Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
    static Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

    static Studio[] studioDatabase = new Studio[]{studio1, studio2};

    public static void printAllStudioNamesThatHavePublishedMoreThen2Movies() {
        for (Studio studio : studioDatabase) {
            if (studio.getFilme().length > 2)
                System.out.println(studio.getNume());
        }
    }

    public static void printStudioNamesInWitchPlaysTheActorWithNameActorCu2Oscaruri() {
        for (Studio studio : studioDatabase) {
            for (Film film : studio.getFilme()) {
                for (Actor actor : film.getActori())
                    if (actor.getNume().equals("actor cu 2 oscaruri")) {
                        System.out.println(studio.getNume());
                    }

            }
        }
    }

    public static void printMovieNamesInWitchPlaysAtLeastAnActorWithAgeAbove50() {
        for (Studio studio : studioDatabase) {
            for (Film film : studio.getFilme()) {
                for (Actor actor : film.getActori()) {
                    if (actor.getVarsta() > 50) {
                        System.out.println(film.getNume());
                        break;

                    }
                }
            }
        }
    }


    public static void main(String[] args) {

        printAllStudioNamesThatHavePublishedMoreThen2Movies();
        printStudioNamesInWitchPlaysTheActorWithNameActorCu2Oscaruri();
        printMovieNamesInWitchPlaysAtLeastAnActorWithAgeAbove50();

    }

}