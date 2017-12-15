import java.util.HashSet;
import java.util.Set;

public class PermCheck {

  public PermCheck() {
    int[] A = {4, 1, 3, 2};
    JavaQuicker.p("got result:");
    JavaQuicker.p(solution(A));
    JavaQuicker.p("expected result:");
    JavaQuicker.p(1);

    int[] A1 = {4, 1, 3};
    JavaQuicker.p("got result:");
    JavaQuicker.p(solution(A1));
    JavaQuicker.p("expected result:");
    JavaQuicker.p(0);
  }

  public int solution(int[] A) {
    int value = 1;

    if (A.length == 0) {
      return 0;
    }

    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < A.length; i++) {
      if (A[i] > 0) {
        set.add(A[i]);
      }
    }
    for (int i = 0; i < A.length; i++) {
      if (!set.contains(i + 1)) {
        return 0;
      }
    }
    return 1;
  }
}
