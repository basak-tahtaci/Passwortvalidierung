import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void hasMinLength_whenPasswordIsTooShort_returnsFalse() {

        //Given -> VORBEREITUNG was weiss/ brauche ich alles?
        String testPw = "kuka";
        int mindestLaenge = 8;
        boolean expected = false;

        //WHEN -> METHodenaufruf -> reality check
        boolean actual = main.hasMinLength(testPw, mindestLaenge);

        //THEN -> Vergleich -> Erwartung vs Realität
        assertEquals(expected, actual);
    }

    @Test
    void hasMinLength_whenPasswordIsTooShort_returnsTrue() {

        //Given -> VORBEREITUNG was weiss/ brauche ich alles?
        String testPw = "beispiel";
        int mindestLaenge = 8;
        boolean expected = true;

        //WHEN -> METHodenaufruf -> reality check
        boolean actual = main.hasMinLength(testPw, mindestLaenge);

        //THEN -> Vergleich -> Erwartung vs Realität
        assertEquals(expected, actual);
    }

    @Test
    void containsDigit_whenDigit_returnsTrue() {

        //Given -> VORBEREITUNG was weiss/ brauche ich alles?
        String testPw = "kuka1234";
        boolean expected = true;

        //WHEN -> METHodenaufruf -> reality check
        boolean actual = main.containsDigit(testPw);

        //THEN -> Vergleich -> Erwartung vs Realität
        assertEquals(expected, actual);
    }

    @Test
    void containsDigit_whenNoDigit_returnsFalse() {

        //Given -> VORBEREITUNG was weiss/ brauche ich alles?
        String testPw = "beispiel";
        boolean expected = false;

        //WHEN -> METHodenaufruf -> reality check
        boolean actual = main.containsDigit(testPw);

        //THEN -> Vergleich -> Erwartung vs Realität
        assertEquals(expected, actual);
    }

    @Test
    void containsUpperAndLower_whenNoUpperOrLower_returnsFalse() {

        //Given -> VORBEREITUNG was weiss/ brauche ich alles?
        String testPw = "beispiel";
        boolean expected = false;

        //WHEN -> METHodenaufruf -> reality check
        boolean actual = main.containsUpperAndLower(testPw);

        //THEN -> Vergleich -> Erwartung vs Realität
        assertEquals(expected, actual);
    }

    @Test
    void containsUpperAndLower_whenUpperAndLower_returnsTrue() {

        //Given -> VORBEREITUNG was weiss/ brauche ich alles?
        String testPw = "Beispiel";
        boolean expected = true;

        //WHEN -> METHodenaufruf -> reality check
        boolean actual = main.containsUpperAndLower(testPw);

        //THEN -> Vergleich -> Erwartung vs Realität
        assertEquals(expected, actual);
    }

    @Test
    void containsUpperAndLower_whenOnlyUpper_returnsFalse() {

        //Given -> VORBEREITUNG was weiss/ brauche ich alles?
        String testPw = "BEISPIEL";
        boolean expected = false;

        //WHEN -> METHodenaufruf -> reality check
        boolean actual = main.containsUpperAndLower(testPw);

        //THEN -> Vergleich -> Erwartung vs Realität
        assertEquals(expected, actual);
    }

    @Test
    void isCommonPassword_whenCommonPw_returnsTrue() {

        //Given -> VORBEREITUNG was weiss/ brauche ich alles?
        String testPw = "password";
        boolean expected = true;

        //WHEN -> METHodenaufruf -> reality check
        boolean actual = main.isCommonPassword(testPw);

        //THEN -> Vergleich -> Erwartung vs Realität
        assertEquals(expected, actual);
    }

    @Test
    void isCommonPassword_whenCommonPw_returnsTrue2() {

        //Given -> VORBEREITUNG was weiss/ brauche ich alles?
        String testPw = "PASSWORD ";
        boolean expected = true;

        //WHEN -> METHodenaufruf -> reality check
        boolean actual = main.isCommonPassword(testPw);

        //THEN -> Vergleich -> Erwartung vs Realität
        assertEquals(expected, actual);
    }

    @Test
    void isCommonPassword_whenNotCommonPw_returnsFalse() {

        //Given -> VORBEREITUNG was weiss/ brauche ich alles?
        String testPw = "Beispiel28";
        boolean expected = false;

        //WHEN -> METHodenaufruf -> reality check
        boolean actual = main.isCommonPassword(testPw);

        //THEN -> Vergleich -> Erwartung vs Realität
        assertEquals(expected, actual);
    }
}