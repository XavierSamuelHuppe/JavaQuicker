import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CyclicRotation {

  public CyclicRotation() {
    int[] A = {3, 8, 9, 7, 6};
    int[] expectedResult = {9, 7, 6, 3, 8};
    int K = 3;

    JavaQuicker.p("got result:");
    JavaQuicker.p(solution(A, K));
    JavaQuicker.p("expected result:");
    JavaQuicker.p(expectedResult);

    int[] A2 = {1, 2, 3, 4};
    int[] expectedResult2 = {1, 2, 3, 4};
    int K2 = 4;

    JavaQuicker.p("got result:");
    JavaQuicker.p(solution(A2, K2));
    JavaQuicker.p("expected result:");
    JavaQuicker.p(expectedResult2);
  }

  public int[] solution(int[] A, int K) {
    if (A.length == 0) {
      return A;
    }

    List<Integer> IntegerList = Arrays.stream(A).boxed().collect(Collectors.toList());

    for (int i = 0; i < K; i++) {
      Integer lastValue = IntegerList.get(IntegerList.size() - 1);
      IntegerList.remove(IntegerList.size() - 1);
      IntegerList.add(0, lastValue);
    }

    int[] rotatedArray = new int[IntegerList.size()];
    for (int i = 0; i < IntegerList.size(); i++) {
      rotatedArray[i] = IntegerList.get(i);
    }
    return rotatedArray;
  }
}
