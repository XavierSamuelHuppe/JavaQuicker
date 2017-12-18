public class JavaQuicker {

  public static void main(String[] args) {
//    MissingInteger missingInteger = new MissingInteger();
//    BinaryGap binaryGap = new BinaryGap();
//    OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
//    CyclicRotation cyclicRotation = new CyclicRotation();
//    FrogJmp frogJmp = new FrogJmp();
//    PermMissingElem permMissingElem = new PermMissingElem();
//    TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
//    PermCheck permCheck = new PermCheck();
//    FrogRiverOne frogRiverOne = new FrogRiverOne();
//    PassingCars passingCars = new PassingCars();
//    Test testOne = new Test();
    TestTwo testTwo = new TestTwo();
  }

  public static void p(String stringToPrint) {
    System.out.println(stringToPrint);
  }

  public static void p(int intToPrint) {
    System.out.println("" + intToPrint);
  }

  public static void p(double doubleToPrint) {
    System.out.println("" + doubleToPrint);
  }

  public static void p(Long longToPrint) {
    System.out.println("" + longToPrint);
  }

  public static void p() {
    System.out.println("");
  }

  public static void p(int[] intArrayToPrint) {
    for (int i = 0; i < intArrayToPrint.length; i++) {
      System.out.print(" " + intArrayToPrint[i]);
    }
    System.out.println("");
  }

}
