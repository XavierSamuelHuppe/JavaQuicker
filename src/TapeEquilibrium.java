public class TapeEquilibrium {

  public TapeEquilibrium() {
    int[] A = {3, 1, 2, 4, 3};

    JavaQuicker.p("got result:");
    JavaQuicker.p(solution(A));
    JavaQuicker.p("expected result:");
    JavaQuicker.p(1);
  }

  public int solution(int[] A) {
    int lowestDiff = 0;

    int ALeftSum = 0;
    int ARightSum = sum(A);
    for (int i = 0; i < A.length - 1; i++) {
      ALeftSum += A[i];
      ARightSum -= A[i];

      int newDiff = Math.abs(ALeftSum - ARightSum);

      if (lowestDiff == 0) {
        lowestDiff = newDiff;
      }
      lowestDiff = Math.min(lowestDiff, newDiff);

    }
    return lowestDiff;
  }

  private int sum(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum;
  }
}
