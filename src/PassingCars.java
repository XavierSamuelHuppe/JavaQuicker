public class PassingCars {

  public PassingCars() {
    int[] A = {0, 1, 0, 1, 1};
    JavaQuicker.p("got result:");
    JavaQuicker.p(solution(A));
    JavaQuicker.p("expected result:");
    JavaQuicker.p(5);
  }

  public int solution(int[] A) {
    int numberOfCarGoingEstSoFar = 0;
    int numberOfPair = 0;

    for (int i = 0; i < A.length; i++) {
      if (A[i] == 0) {
        numberOfCarGoingEstSoFar++;
      } else {
        numberOfPair += numberOfCarGoingEstSoFar;
      }
    }
    if (Math.abs(numberOfPair) > 1000000000) {
      return -1;
    } else {
      return numberOfPair;
    }
  }
}
