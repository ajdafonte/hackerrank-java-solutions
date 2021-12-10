package pt.caires.hackerrank.datastructures;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class JavaBitSet {

    private final Map<Integer, BitSet> bitSets;

    public JavaBitSet(Map<Integer, BitSet> bitSets) {
        this.bitSets = bitSets;
    }

    public static void main(final String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            int bitSetSize = sc.nextInt();
            Map<Integer, BitSet> bitSets = new HashMap<>();
            bitSets.put(1, new BitSet(bitSetSize));
            bitSets.put(2, new BitSet(bitSetSize));
            JavaBitSet javaBitSet = new JavaBitSet(bitSets);
            int numOperations = sc.nextInt();
            for (int i = 0; i < numOperations; i++) {
                String operation = sc.next();
                int input1 = sc.nextInt();
                int input2 = sc.nextInt();
                javaBitSet.executeOperation(operation, input1, input2);
                System.out.println(javaBitSet.getTextWithNumberOfAllSetBits());
            }
        }
    }

    public void executeOperation(String operation, int input1, int input2) {
        if ("AND".equals(operation)) {
            executeAndOperation(input1, input2);
        } else if ("OR".equals(operation)) {
            executeOrOperation(input1, input2);
        } else if ("XOR".equals(operation)) {
            executeXorOperation(input1, input2);
        } else if ("FLIP".equals(operation)) {
            executeFlipOperation(input1, input2);
        } else if ("SET".equals(operation)) {
            executeSetOperation(input1, input2);
        }
    }

    public String getTextWithNumberOfAllSetBits() {
        return bitSets.values().stream()
                .map(BitSet::cardinality)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
    }

    protected BitSet getBitSetBy(int id) {
        return bitSets.get(id);
    }

    private void executeAndOperation(int id1, int id2) {
        getBitSetBy(id1).and(getBitSetBy(id2));
    }

    private void executeOrOperation(int id1, int id2) {
        getBitSetBy(id1).or(getBitSetBy(id2));
    }

    private void executeXorOperation(int id1, int id2) {
        getBitSetBy(id1).xor(getBitSetBy(id2));
    }

    private void executeFlipOperation(int id, int index) {
        getBitSetBy(id).flip(index);
    }

    private void executeSetOperation(int id, int index) {
        getBitSetBy(id).set(index);
    }

}
