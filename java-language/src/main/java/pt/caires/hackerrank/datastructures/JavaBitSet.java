package pt.caires.hackerrank.datastructures;

import java.util.BitSet;
import java.util.Scanner;


// TODO: 02/12/2021 Refactor this approach
public class JavaBitSet {

    private static BitSet set1;
    private static BitSet set2;

    private static boolean checkSetInput(final int setId) {
        return setId == 1 || setId == 2;
    }

    private static BitSet getOperand(final int setId) {
        BitSet result = null;
        if (checkSetInput(setId)) {
            result = setId == 1 ? set1 : set2;
        } else {
            System.out.println(setId + " is an invalid set id");
        }
        return result;
    }

    private static void printSets(final BitSet set1, final BitSet set2) {
        System.out.println(set1.cardinality() + " " + set2.cardinality());
    }

    private static void executeOperation(final String op, final int arg1, final int arg2) {
        switch (op) {
            case "AND": {
                getOperand(arg1).and(getOperand(arg2));
                break;
            }
            case "OR": {
                getOperand(arg1).or(getOperand(arg2));
                break;
            }
            case "XOR": {
                getOperand(arg1).xor(getOperand(arg2));
                break;
            }
            case "FLIP": {
                getOperand(arg1).flip(arg2);
                break;
            }
            case "SET": {
                getOperand(arg1).set(arg2);
                break;
            }
            default: {
                System.out.println(op + " is an invalid operation!");
                break;
            }
        }
    }

    public static void main(final String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            final int bitSetLength = sc.nextInt();
            set1 = new BitSet(bitSetLength);
            set2 = new BitSet(bitSetLength);
            final int numOps = sc.nextInt();
            for (int i = 0; i < numOps; i++) {
                final String op = sc.next();
                final int arg1 = sc.nextInt();
                final int arg2 = sc.nextInt();
                executeOperation(op, arg1, arg2);
                printSets(set1, set2);
            }
        }
    }

}
