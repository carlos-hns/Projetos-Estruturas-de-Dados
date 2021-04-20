package lab.ordenacaocovid.testes;

import lab.ordenacaocovid.utils.Vector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VectorTest {

    @Test
    public void shouldThrowExceptionAtCreateVector() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Vector(0);
        });
    }

    @Test
    public void shouldCreateVector() {
        Vector<Integer> vector = new Vector<Integer>(1);
        Assertions.assertNotEquals(vector, null);
    }

    @Test
    public void shouldAddElementInVector() {
        Vector<Integer> vector = new Vector<Integer>(1);
        vector.add(1);
        vector.add(2);
        int sizeExpected = 2;
        int sizeFound = vector.size();
        Assertions.assertEquals(sizeExpected, sizeFound);
    }

    @Test
    public void shouldReturnExceptionAtSearchElementLowerThan0() {
        Vector<Integer> vector = new Vector<Integer>(1);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            vector.findWithIndex(-1);
        });
    }

    @Test
    public void shouldReturnExceptionAtSearchElementHigherThanCapacity() {
        Vector<Integer> vector = new Vector<Integer>(1);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            vector.findWithIndex(2);
        });
    }

    @Test
    public void shouldFindElementInVector() {
        Vector<Integer> vector = new Vector<Integer>(1);
        vector.add(1);
        int intExpected = 1;
        int intFound = vector.findWithIndex(0);
        Assertions.assertEquals(intExpected, intFound);
    }

    @Test
    public void shouldReturnExceptionAtAddElementInInvalidPositionLowerThan0() {
        Vector<Integer> vector = new Vector<Integer>(1);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            vector.add(1, -1);
        });
    }

    @Test
    public void shouldReturnExceptionAtAddElementInInvalidPositionHigherThanCapacity() {
        Vector<Integer> vector = new Vector<Integer>(1);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            vector.add(1, 2);
        });
    }

    @Test
    public void shouldAddElementInThePositionInitial() {
        Vector<Integer> vector = new Vector<Integer>(3);
        vector.add(1);
        vector.add(2);
        vector.add(3, 0);
        int intExpected = 3;
        int intFound = vector.findWithIndex(0);
        Assertions.assertEquals(intExpected, intFound);
    }

    @Test
    public void shouldAddElementInThePositionMiddle() {
        Vector<Integer> vector = new Vector<Integer>(3);
        vector.add(1);
        vector.add(2);
        vector.add(1, 1);
        int intExpected = 1;
        int intFound = vector.findWithIndex(1);
        Assertions.assertEquals(intExpected, intFound);
    }

    @Test
    public void shouldAddElementInThePositionFinal() {
        Vector<Integer> vector = new Vector<Integer>(3);
        vector.add(1);
        vector.add(2);
        vector.add(1, 2);
        int intExpected = 1;
        int intFound = vector.findWithIndex(2);
        Assertions.assertEquals(intExpected, intFound);
    }

    @Test
    public void shouldAddElementInThePositionInitialAndAllBeRight() {
        Vector<Integer> vector = new Vector<Integer>(3);
        vector.add(1);
        vector.add(2);
        vector.add(1, 0);

        int firstIntExpected = 1;
        int secondIntExpected = 1;
        int thirdIntExpected = 2;

        int firstIntFound = vector.findWithIndex(0);
        int secondIntFound = vector.findWithIndex(1);
        int thirdIntFound = vector.findWithIndex(2);

        Assertions.assertEquals(firstIntExpected, firstIntFound);
        Assertions.assertEquals(secondIntExpected, secondIntFound);
        Assertions.assertEquals(thirdIntExpected, thirdIntFound);
    }


}
