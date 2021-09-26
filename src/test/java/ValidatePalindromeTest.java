import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatePalindromeTest {
    private IValidatePalindrome validatePalindrome;

    @BeforeEach
    void setUp() {
        validatePalindrome = new ValidatePalindrome();
    }

    @Test
    @DisplayName("Should Return True With 'Rotator'")
    void shouldReturnTrueWithRotator() {
        //Arrange
        String text = "Rotator";

        //Act
        boolean result = validatePalindrome.validate(text);

        //Assert
        assertTrue(result);
    }

    @Test
    @DisplayName("Should Return True With 'bob'")
    void shouldReturnTrueWithbob() {
        //Arrange
        String text = "bob";

        //Act
        boolean result = validatePalindrome.validate(text);

        //Assert
        assertTrue(result);
    }

    @Test
    @DisplayName("Should Return True With 'madam'")
    void shouldReturnTrueWithmadam() {
        //Arrange
        String text = "madam";

        //Act
        boolean result = validatePalindrome.validate(text);

        //Assert
        assertTrue(result);
    }

    @Test
    @DisplayName("Should Return True With 'mAlAyAlam'")
    void shouldReturnTrueWithmAlAyAlam() {
        //Arrange
        String text = "mAlAyAlam";

        //Act
        boolean result = validatePalindrome.validate(text);

        //Assert
        assertTrue(result);
    }

    @Test
    @DisplayName("Should Return True With '1'")
    void shouldReturnTrueWith1() {
        //Arrange
        String text = "1";

        //Act
        boolean result = validatePalindrome.validate(text);

        //Assert
        assertTrue(result);
    }

    @Test
    @DisplayName("Should Return True With 'Able was I, ere I saw Elba'")
    void shouldReturnTrueWithAblewasIereIsawElba() {
        //Arrange
        String text = "Able was I, ere I saw Elba";

        //Act
        boolean result = validatePalindrome.validate(text);

        //Assert
        assertTrue(result);
    }

    @Test
    @DisplayName("Should Return True With 'Madam I’m Adam'")
    void shouldReturnTrueWithMadamImAdam() {
        //Arrange
        String text = "Madam I'm Adam";

        //Act
        boolean result = validatePalindrome.validate(text);

        //Assert
        assertTrue(result);
    }

    @Test
    @DisplayName("Should Return True With 'Step on no pets.'")
    void shouldReturnTrueWithSteponnopets() {
        //Arrange
        String text = "Step on no pets.";

        //Act
        boolean result = validatePalindrome.validate(text);

        //Assert
        assertTrue(result);
    }

    @Test
    @DisplayName("Should Return True With 'Top spot!'")
    void shouldReturnTrueWithTopspot() {
        //Arrange
        String text = "Top spot!";

        //Act
        boolean result = validatePalindrome.validate(text);

        //Assert
        assertTrue(result);
    }

    @Test
    @DisplayName("Should Return True With '02/02/2020'")
    void shouldReturnTrueWith02022020() {
        //Arrange
        String text = "02/02/2020";

        //Act
        boolean result = validatePalindrome.validate(text);

        //Assert
        assertTrue(result);
    }

    @Test
    @DisplayName("Should Return False With 'xyz'")
    void shouldReturnFalseWithxyz() {
        //Arrange
        String text = "xyz";

        //Act
        boolean result = validatePalindrome.validate(text);

        //Assert
        assertFalse(result);
    }

    @Test
    @DisplayName("Should Return False With 'elephant'")
    void shouldReturnFalseWithelephant() {
        //Arrange
        String text = "elephant";

        //Act
        boolean result = validatePalindrome.validate(text);

        //Assert
        assertFalse(result);
    }

    @Test
    @DisplayName("Should Return False With 'Country'")
    void shouldReturnFalseWithCountry() {
        //Arrange
        String text = "Country";

        //Act
        boolean result = validatePalindrome.validate(text);

        //Assert
        assertFalse(result);
    }

    @Test
    @DisplayName("Should Return False With 'Top . post!'")
    void shouldReturnFalseWithToppost() {
        //Arrange
        String text = "Top . post!";

        //Act
        boolean result = validatePalindrome.validate(text);

        //Assert
        assertFalse(result);
    }

    @Test
    @DisplayName("Should Return False With 'Wonderful-fool'")
    void shouldReturnFalseWithWonderfulfool() {
        //Arrange
        String text = "Wonderful-fool";

        //Act
        boolean result = validatePalindrome.validate(text);

        //Assert
        assertFalse(result);
    }

    @Test
    @DisplayName("Should Return False With 'Wild imagination!'")
    void shouldReturnFalseWithWildimagination() {
        //Arrange
        String text = "Wild imagination!";

        //Act
        boolean result = validatePalindrome.validate(text);

        //Assert
        assertFalse(result);
    }
}