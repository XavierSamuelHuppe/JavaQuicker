import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {

  public PermMissingElem() {

    int[] A = {2, 3, 1, 5};

    JavaQuicker.p("got result:");
    JavaQuicker.p(solution(A));
    JavaQuicker.p("expected result:");
    JavaQuicker.p(4);
  }

  public int solution(int[] A) {
    int possibleMissingElement = 1;

    if (A.length == 0) {
      return possibleMissingElement;
    }

    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < A.length; i++) {
      if (A[i] > 0) {
        set.add(A[i]);
      }
    }
    while (set.contains(possibleMissingElement)) {
      possibleMissingElement++;
    }
    return possibleMissingElement;
  }

}
