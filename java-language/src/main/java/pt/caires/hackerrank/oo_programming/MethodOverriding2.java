package pt.caires.hackerrank.oo_programming;

class BiCycle {

    String define_me() {
        return "a vehicle with pedals.";
    }

}

class MotorCycle extends BiCycle {

    MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());

        final String temp = super.define_me(); //Fix this line

        System.out.println("My ancestor is a cycle who is " + temp);
    }

    @Override
    String define_me() {
        return "a cycle with an engine.";
    }

}

public class MethodOverriding2 {

    public static void main(final String[] args) {
        final MotorCycle M = new MotorCycle();
    }

}
