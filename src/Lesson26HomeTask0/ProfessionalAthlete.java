package Lesson26HomeTask0;

public class ProfessionalAthlete extends AmateurAthlete {
    @Override
    public void run() {
        System.out.println("Профессионал бежит со скоростью 25 км.");
        rest(5);
    }
}
