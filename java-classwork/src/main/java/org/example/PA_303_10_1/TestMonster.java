package org.example.PA_303_10_1;

abstract class Monster {
    abstract String attack();
}

class FireMonster extends Monster {
    String attack() {
        return "Attack with fire!";
    }
}

class WaterMonster extends Monster {
    String attack() {
        return "Attack with water!";
    }
}

class StoneMonster extends Monster {
    String attack() {
        return "Attack with stones!";
    }
}

public class TestMonster {
    public static void main(String[] args) {
        // Program at the "interface" defined in the superclass.
        // Declare instances of the superclass, substituted by subclasses.
        Monster m1 = new FireMonster();   // upcast
        Monster m2 = new WaterMonster();  // upcast
        Monster m3 = new StoneMonster();  // upcast

        // Invoke the actual implementation
        System.out.println(m1.attack());  // Run FireMonster's attack()
        System.out.println(m2.attack());  // Run WaterMonster's attack()
        System.out.println(m3.attack());  // Run StoneMonster's attack()

        // m1 dies, generates a new instance and re-assign to m1.
        m1 = new StoneMonster();  // upcast
        System.out.println(m1.attack());  // Run StoneMonster's attack()

        // Demonstrate handling of superclass instance
        Monster m4 = new Monster() { // Anonymous subclass
            String attack() {
                return "!^_&^$@+%$* I don't know how to attack!";
            }
        };
        System.out.println(m4.attack()); // Run custom attack for unknown monster
    }
}