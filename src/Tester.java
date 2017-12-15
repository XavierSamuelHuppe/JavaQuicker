public class Tester {

  public Tester() {
    p("Start");

    p("END");
  }

  private void p(String stringToPrint) {
    System.out.println(stringToPrint);
  }

  private void p(int intToPrint) {
    System.out.println("" + intToPrint);
  }

  private void p(double doubleToPrint) {
    System.out.println("" + doubleToPrint);
  }

  private void p(Long longToPrint) {
    System.out.println("" + longToPrint);
  }
}
