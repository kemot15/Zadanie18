package pl.javastart.tax.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TaxServiceTest {
    TaxService taxService;

    @BeforeEach
    void setUp() {
        taxService = new TaxService();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void noTax() {
        double target = taxService.FREE_TAX;
        double expected = 0.0;

        double result = taxService.taxCalculator(target);

        assertThat(result).isEqualTo(expected);

    }

    @Test
    void lowTaxCheck() {
        double target = taxService.TAX_TRESHOLD;
        double expected = 14839.0;

        double result = taxService.taxCalculator(target);

        assertThat(result).isEqualTo(expected);

    }

    @Test
    void maxTaxCheck() {
        double target = 85530;
        double expected = 14839.0;

        double result = taxService.taxCalculator(target);

        assertThat(result).isGreaterThan(expected);

    }
}