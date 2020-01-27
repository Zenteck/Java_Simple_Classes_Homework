public class Printer {

    public int paper;
    public int toner;

    public Printer(int paper, int toner) {
        this.paper = 60;
        this.toner = 500;
    }

    public int getPaper() {
        return this.paper;
    }

    public int getToner() {
        return this.toner;
    }

    public void printCopies(int copies, int pages) {
       int printRun = copies * pages;
        if(printRun <= this.paper){
            this.paper -= printRun;
            this.toner -= printRun;
        }

    }
}
