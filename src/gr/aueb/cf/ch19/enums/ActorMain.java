package gr.aueb.cf.ch19.enums;

public class ActorMain {

    public static void main(String[] args) {
        Actor actor = Actor.STUDENT;
        System.out.println(actor.toRole()); // ROLE_STUDENT
        System.out.println(actor.name());   // STUDENT
    }
}
