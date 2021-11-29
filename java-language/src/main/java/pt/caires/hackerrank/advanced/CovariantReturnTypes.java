package pt.caires.hackerrank.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Flower {

    String whatsYourName() {
        return "I have many names and types.";
    }

}

class Jasmine extends Flower {

    @Override
    String whatsYourName() {
        return "Jasmine";
    }

}

class Lotus extends Flower {

    @Override
    String whatsYourName() {
        return "Lotus";
    }

}

class Lily extends Flower {

    @Override
    String whatsYourName() {
        return "Lily";
    }

}

class Region {

    Flower yourNationalFlower() {
        return new Flower();
    }

}

class WestBengal extends Region {

    @Override
    Flower yourNationalFlower() {
        return new Jasmine();
    }

}

class AndhraPradesh extends Region {

    @Override
    Lily yourNationalFlower() {
        return new Lily();
    }

}


public class CovariantReturnTypes {

    public static void main(final String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final String s = reader.readLine().trim();
        final Region region = null;

        final Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }

}
