package pt.caires.hackerrank.advanced;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.security.NoSuchAlgorithmException;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MD5Test {

    private static Stream<Arguments> invalidMd5Hashes() {
        return Stream.of(
                Arguments.of(" "),
                Arguments.of("qwertyuioplkjhgfdsazxc"),
                Arguments.of("cr7@goal.com"));
    }

    private static Stream<Arguments> validMd5Hashes() {
        return Stream.of(
                Arguments.of("HelloWorld", "68e109f0f40ca72a15e05cc22786f8e6"),
                Arguments.of("Javarmi123", "2da2d1e0ce7b4951a858ed2d547ef485"),
                Arguments.of("zepassarinho", "2cd1be5eef5313196d4a5450d10cab39"));
    }

    @ParameterizedTest
    @MethodSource("validMd5Hashes")
    void should_generate_md5_hash(String input, String expected) throws NoSuchAlgorithmException {
        String result = MD5.handleMd5Hash(input);

        assertThat(result)
                .isNotBlank()
                .isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("invalidMd5Hashes")
    void should_not_generate_md5_hash(String input) throws NoSuchAlgorithmException {
        String result = MD5.handleMd5Hash(input);

        assertThat(result)
                .isNotBlank()
                .isEqualTo("Constraint Violated");
    }

}
