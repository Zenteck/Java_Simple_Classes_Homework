import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before() {
        printer = new Printer(60, 500);
    }

    @Test
    public void hasPaper() {
       assertEquals(60, printer.getPaper());
    }

    @Test
    public void hasToner() {
        assertEquals(500, printer.getToner());
    }

//    @Test
//    public void canPrintCopies() {
//        assertEquals(20, printer.printCopies(10, 4));
//    }
//
//    @Test
//    public void notEnoughPaper() {
//        assertEquals(60, printer.printCopies(10, 7));
//    }

    @Test
    public void usesToner() {
        printer.printCopies(5, 3);
        assertEquals(485, printer.getToner());
    }

}

