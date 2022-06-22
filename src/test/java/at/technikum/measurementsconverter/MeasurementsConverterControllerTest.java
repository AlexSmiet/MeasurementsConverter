package at.technikum.measurementsconverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementsConverterControllerTest {
    MeasurementsConverterController MCC = new MeasurementsConverterController();

    @Test
    void ounce_to_gram_test1(){
        // Arrange
        double a = 1;

        double expected = 28.35;

        // Act
        double result = MCC.ounce_to_gram(a);

        // Assert
        assertEquals(expected, result);
    }
    @Test
    void ounce_to_gram_test2(){
        // Arrange
        double a = 0;

        double expected = 0;

        // Act
        double result = MCC.ounce_to_gram(a);

        // Assert
        assertEquals(expected, result);
    }
    @Test
    void ounce_to_gram_test3(){
        // Arrange
        double a = -1;

        double expected = -28.35;

        // Act
        double result = MCC.ounce_to_gram(a);

        // Assert
        assertEquals(expected, result);
    }
    @Test
    void stone_to_kilogram_test1(){
        // Arrange
        double a = 1;

        double expected = 6.35;

        // Act
        double result = MCC.stone_to_kilogram(a);

        // Assert
        assertEquals(expected, result);
    }
    @Test
    void stone_to_kilogram_test2(){
        // Arrange
        double a = 0;

        double expected = 0;

        // Act
        double result = MCC.stone_to_kilogram(a);

        // Assert
        assertEquals(expected, result);
    }
    @Test
    void stone_to_kilogram_test3(){
        // Arrange
        double a = -1;

        double expected = -6.35;

        // Act
        double result = MCC.stone_to_kilogram(a);

        // Assert
        assertEquals(expected, result);
    }
}