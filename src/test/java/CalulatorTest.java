import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalulatorTest {

    private Calculator calculator;

        @Before
            public void before() {
            calculator = new Calculator();
        }

        @Test
        public void canAdd() {
            assertEquals(12, calculator.add(10, 2));
        }

        @Test
        public void canSubtract() {
             assertEquals(5, calculator.subtract(20, 15));
        }

        @Test
        public void canMultiply() {
            assertEquals(28, calculator.multiply(4, 7));
        }
        @Test
        public void canDivide() {
            assertEquals(7.5, calculator.divide(30, 4), 0.01);
        }

}
