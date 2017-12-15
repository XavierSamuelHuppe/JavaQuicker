import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

  public OddOccurrencesInArray() {
    int[] A = new int[7];
    A[0] = 9;
    A[1] = 3;
    A[2] = 9;
    A[3] = 3;
    A[4] = 9;
    A[5] = 7;
    A[6] = 9;
    JavaQuicker.p(solution(A));
  }

  public int solution(int[] A) {
    Map<Integer, Integer> numberOfOccurencesForUniqueInteger = new HashMap<>();

    for (int i = 0; i < A.length; i++) {
      if (!numberOfOccurencesForUniqueInteger.containsKey(A[i])) {
        numberOfOccurencesForUniqueInteger.put(A[i], 1);
      } else {
        int oneMoreOccurence = numberOfOccurencesForUniqueInteger.get(A[i]) + 1;
        numberOfOccurencesForUniqueInteger.put(A[i], oneMoreOccurence);
      }
    }

    for (int key : numberOfOccurencesForUniqueInteger.keySet()) {
      if (numberOfOccurencesForUniqueInteger.get(key) % 2 == 1) {
        return key;
      }
    }

    return 0;
  }
}
