import java.util.Arrays;

public class Lesson7 {
    public static void main(String[] args) {

        Magic magic=new Magic();
        magic.applySuperAbility();
        Medic medic=new Medic();
        medic.applySuperAbility();
        Warrior warrior=new Warrior();
        warrior.applySuperAbility();
        warrior.health=100;
        magic.health=100;
        medic.health=100;
        Hero[] hero1={magic,medic,warrior};
        for (int i = 0; i < hero1.length; i++) {
            System.out.println(medic.increaseExperience() +" "+i);
        }
    }
}
