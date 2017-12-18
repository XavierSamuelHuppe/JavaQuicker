import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

  public FrogRiverOne() {
    int X = 5;
    int[] A = {1, 3, 1, 4, 2, 3, 5, 4};

    JavaQuicker.p("got result:");
    JavaQuicker.p(solution(X, A));
    JavaQuicker.p("expected result:");
    JavaQuicker.p(6);
  }

  public int solution(int X, int[] A) {
    Set<Integer> set = new HashSet<>();

    for (int second = 0; second < A.length; second++) {
      int positionOfnewLeaf = A[second];
      if (positionOfnewLeaf <= X) {
        if (!set.contains(positionOfnewLeaf)) {
          set.add(positionOfnewLeaf);
        }
      }
      if (set.size() == X) {
        return second;
      }
    }
    return -1;
  }
}
