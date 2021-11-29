package pt.caires.hackerrank.advanced;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.security.NoSuchAlgorithmException;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


class SHA256Test {

    private static Stream<Arguments> validSha256Hashes() {
        return Stream.of(
                Arguments.of("HelloWorld", "872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4"),
                Arguments.of("Javarmi123", "f1d5f8d75bb55c777207c251d07d9091dc10fe7d6682db869106aacb4b7df678"),
                Arguments.of("zepassarinho", "65379e13682aa4b6b96e586dd893560b30ec43b9a407becde7c1a71f0d45bd6b"),
                Arguments.of("K1t4fo0V", "0a979e43f4874eb24b740c0157994e34636eed0425688161cc58e8b26b1dcf4e"),
                Arguments.of("yxPX0fbIKHvjHo180", "074690988f8d3e8e45840f7502efd2edde63a88c299a88e0923e7ed4abec1835"));
    }

    private static Stream<Arguments> invalidSha256Hashes() {
        return Stream.of(
                Arguments.of(" ", "Constraint Violated"),
                Arguments.of("qwertyuioplkjhgfdsazxc", "Constraint Violated"),
                Arguments.of("cr7@goal.com", "Constraint Violated"));
    }

    @ParameterizedTest
    @MethodSource("validSha256Hashes")
    void should_generate_sha256_hash(String input, String expected) throws NoSuchAlgorithmException {
        String result = SHA256.handleSha256Hash(input);

        assertThat(result)
                .isNotBlank()
                .isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("invalidSha256Hashes")
    void should_not_generate_sha256_hash(String input) throws NoSuchAlgorithmException {
        String result = SHA256.handleSha256Hash(input);

        assertThat(result)
                .isNotBlank()
                .isEqualTo("Constraint Violated");
    }

}
