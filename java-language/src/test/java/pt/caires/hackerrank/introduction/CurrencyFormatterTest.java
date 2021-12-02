package pt.caires.hackerrank.introduction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

class CurrencyFormatterTest {

    private CurrencyFormatter currencyFormatter;

    @BeforeEach
    void setUp() {
        this.currencyFormatter = new CurrencyFormatter();
    }

    @Test
    void should_return_payment_formatted_in_us_currency() {
        String result = currencyFormatter.getPaymentFormattedIn(12324.13, Locale.US);

        assertThat(result)
                .isNotBlank()
                .isEqualTo("$12,324.13");
    }

    @Test
    void should_return_payment_formatted_in_indian_currency() {
        Locale indiaLocale = new Locale("en", "IN");
        String result = currencyFormatter.getPaymentFormattedIn(12324.13, indiaLocale);

        assertThat(result)
                .isNotBlank()
                .isEqualTo("Rs.12,324.13");
    }

    @Test
    void should_return_payment_formatted_in_chinese_currency() {
        String result = currencyFormatter.getPaymentFormattedIn(12324.13, Locale.CHINA);

        assertThat(result)
                .isNotBlank()
                .isEqualTo("￥12,324.13");
    }

    @Test
    void should_return_payment_formatted_in_french_currency() {
        String result = currencyFormatter.getPaymentFormattedIn(12324.13, Locale.FRANCE);

        assertThat(result)
                .isNotBlank()
                .isEqualTo("12 324,13 €");
    }

}