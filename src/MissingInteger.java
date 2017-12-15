import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

  public MissingInteger() {
    JavaQuicker.p("MissingInteger");

    int[] array = {6, 4, 2, 1, 0};
    JavaQuicker.p(solution(array));
  }

  public int solution(int[] A) {
    int lowestValue = 1;

    if (A.length == 0) {
      return lowestValue;
    }

    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < A.length; i++) {
      if (A[i] > 0) {
        set.add(A[i]);
      }
    }
    while (set.contains(lowestValue)) {
      lowestValue++;
    }
    return lowestValue;
  }
}
