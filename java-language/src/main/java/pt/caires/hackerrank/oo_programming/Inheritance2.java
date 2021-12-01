package pt.caires.hackerrank.oo_programming;

class Arithmetic {

    int add(final int value1, final int value2) {
        return value1 + value2;
    }

}

class Adder extends Arithmetic {

}

public class Inheritance2 {

    public static void main(final String[] args) {
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
    }

}
