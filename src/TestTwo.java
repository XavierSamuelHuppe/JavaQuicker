public class TestTwo {

  public TestTwo() {
    int[] A = {1, 5, 4, 9, 8, 7, 12, 13, 14};

    JavaQuicker.p(A);
    JavaQuicker.p("got result:");
    JavaQuicker.p(solution(A));
    JavaQuicker.p("expected result:");
    JavaQuicker.p(6);

    int[] A1 = {4, 3, 2, 6, 1};

    JavaQuicker.p("");
    JavaQuicker.p(A1);
    JavaQuicker.p("got result:");
    JavaQuicker.p(solution(A1));
    JavaQuicker.p("expected result:");
    JavaQuicker.p(1);

    int[] A2 = {5, 4, 6, 1, 2, 7};

    JavaQuicker.p("");
    JavaQuicker.p(A2);
    JavaQuicker.p("got result:");
    JavaQuicker.p(solution(A2));
    JavaQuicker.p("expected result:");
    JavaQuicker.p(2);
  }

  public int solution(int[] A) {
    int numberOfGroups = 0;

    int i = 0;
    while (i < A.length) {
      int giraffeHeight = A[i];
      int positionOfLastSmallerGiraffe = i;
      for (int j = i; j < A.length; j++) {
        int possiblySmallerGiraffeHeight = A[j];
        if (possiblySmallerGiraffeHeight < giraffeHeight) {
          positionOfLastSmallerGiraffe = j;
        }
      }
      i = positionOfLastSmallerGiraffe + 1;
      numberOfGroups++;
    }

    return numberOfGroups;
  }
}
