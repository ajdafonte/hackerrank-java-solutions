package pt.caires.hackerrank.datastructures;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class JavaBitSetTest {

    private JavaBitSet javaBitSet;

    private static Stream<Arguments> andOperationValues() {
        return Stream.of(
                Arguments.of(BitSet.valueOf(new byte[]{0}), BitSet.valueOf(new byte[]{0}),
                             BitSet.valueOf(new byte[]{0})),
                Arguments.of(BitSet.valueOf(new byte[]{0}), BitSet.valueOf(new byte[]{1}),
                             BitSet.valueOf(new byte[]{0})),
                Arguments.of(BitSet.valueOf(new byte[]{1}), BitSet.valueOf(new byte[]{0}),
                             BitSet.valueOf(new byte[]{0})),
                Arguments.of(BitSet.valueOf(new byte[]{1}), BitSet.valueOf(new byte[]{1}),
                             BitSet.valueOf(new byte[]{1})));
    }

    private static Stream<Arguments> orOperationValues() {
        return Stream.of(
                Arguments.of(BitSet.valueOf(new byte[]{0}), BitSet.valueOf(new byte[]{0}),
                             BitSet.valueOf(new byte[]{0})),
                Arguments.of(BitSet.valueOf(new byte[]{0}), BitSet.valueOf(new byte[]{1}),
                             BitSet.valueOf(new byte[]{1})),
                Arguments.of(BitSet.valueOf(new byte[]{1}), BitSet.valueOf(new byte[]{0}),
                             BitSet.valueOf(new byte[]{1})),
                Arguments.of(BitSet.valueOf(new byte[]{1}), BitSet.valueOf(new byte[]{1}),
                             BitSet.valueOf(new byte[]{1})));
    }

    private static Stream<Arguments> xorOperationValues() {
        return Stream.of(
                Arguments.of(BitSet.valueOf(new byte[]{0}), BitSet.valueOf(new byte[]{0}),
                             BitSet.valueOf(new byte[]{0})),
                Arguments.of(BitSet.valueOf(new byte[]{0}), BitSet.valueOf(new byte[]{1}),
                             BitSet.valueOf(new byte[]{1})),
                Arguments.of(BitSet.valueOf(new byte[]{1}), BitSet.valueOf(new byte[]{0}),
                             BitSet.valueOf(new byte[]{1})),
                Arguments.of(BitSet.valueOf(new byte[]{1}), BitSet.valueOf(new byte[]{1}),
                             BitSet.valueOf(new byte[]{0})));
    }

    private static Stream<Arguments> flipOperationValues() {
        return Stream.of(
                Arguments.of(BitSet.valueOf(new byte[]{0}), BitSet.valueOf(new byte[]{1})),
                Arguments.of(BitSet.valueOf(new byte[]{1}), BitSet.valueOf(new byte[]{0})));
    }

    private static Stream<Arguments> setOperationValues() {
        return Stream.of(
                Arguments.of(BitSet.valueOf(new byte[]{0})),
                Arguments.of(BitSet.valueOf(new byte[]{1})));
    }

    @Test
    void should_retrieve_bit_set_by_id() {
        Map<Integer, BitSet> bitSets = new HashMap<Integer, BitSet>() {{
            put(1, new BitSet(1));
            put(2, new BitSet(1));
        }};
        this.javaBitSet = new JavaBitSet(bitSets);

        BitSet result = javaBitSet.getBitSetBy(1);

        assertThat(result)
                .isNotNull()
                .isEqualTo(new BitSet(1));
    }

    @ParameterizedTest
    @MethodSource("andOperationValues")
    void should_execute_and_operation(BitSet input1, BitSet input2, BitSet expected) {
        Map<Integer, BitSet> bitSets = new HashMap<Integer, BitSet>() {{
            put(1, input1);
            put(2, input2);
        }};
        this.javaBitSet = new JavaBitSet(bitSets);

        javaBitSet.executeOperation("AND", 1, 2);

        assertThat(javaBitSet.getBitSetBy(1))
                .isNotNull()
                .isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("orOperationValues")
    void should_execute_or_operation(BitSet input1, BitSet input2, BitSet expected) {
        Map<Integer, BitSet> bitSets = new HashMap<Integer, BitSet>() {{
            put(1, input1);
            put(2, input2);
        }};
        this.javaBitSet = new JavaBitSet(bitSets);

        javaBitSet.executeOperation("OR", 1, 2);

        assertThat(javaBitSet.getBitSetBy(1))
                .isNotNull()
                .isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("xorOperationValues")
    void should_execute_xor_operation(BitSet input1, BitSet input2, BitSet expected) {
        Map<Integer, BitSet> bitSets = new HashMap<Integer, BitSet>() {{
            put(1, input1);
            put(2, input2);
        }};
        this.javaBitSet = new JavaBitSet(bitSets);

        javaBitSet.executeOperation("XOR", 1, 2);

        assertThat(javaBitSet.getBitSetBy(1))
                .isNotNull()
                .isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("flipOperationValues")
    void should_execute_flip_operation(BitSet input, BitSet expected) {
        Map<Integer, BitSet> bitSets = new HashMap<Integer, BitSet>() {{
            put(1, input);
        }};
        this.javaBitSet = new JavaBitSet(bitSets);

        javaBitSet.executeOperation("FLIP", 1, 0);

        assertThat(javaBitSet.getBitSetBy(1))
                .isNotNull()
                .isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("setOperationValues")
    void should_execute_set_operation(BitSet input) {
        Map<Integer, BitSet> bitSets = new HashMap<Integer, BitSet>() {{
            put(1, input);
        }};
        this.javaBitSet = new JavaBitSet(bitSets);

        javaBitSet.executeOperation("SET", 1, 0);

        assertThat(javaBitSet.getBitSetBy(1))
                .isNotNull()
                .isEqualTo(BitSet.valueOf(new byte[]{1}));
    }

    @Test
    void should_return_text_with_number_of_set_bits_in_all_sets() {
        Map<Integer, BitSet> bitSets = new HashMap<Integer, BitSet>() {{
            put(1, BitSet.valueOf(new byte[]{0, 1}));
            put(2, BitSet.valueOf(new byte[]{1, 1}));
        }};
        this.javaBitSet = new JavaBitSet(bitSets);

        String result = javaBitSet.getTextWithNumberOfAllSetBits();

        assertThat(result)
                .isNotBlank()
                .isEqualTo("1 2");
    }

}