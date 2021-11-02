package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "200,300,3",
                    "10,99,0",
                    "500,700,4",
                    "1000,1300,5"
            },
            delimiter = ','
    )
    void findNumbers(int rangeStart, int rangeEnd, int expected) {

        SQRService service = new SQRService();
        long actual = service.findNumbers(rangeStart, rangeEnd);

        assertEquals(expected, actual);
    }
}
