import java.util.HashMap;
import java.util.Map;

public class Test {

  public Test() {
    Point2D[] A = new Point2D[5];
    A[0] = new Point2D();
    A[0].x = -1;
    A[0].y = -2;
    A[1] = new Point2D();
    A[1].x = 1;
    A[1].y = 2;
    A[2] = new Point2D();
    A[2].x = 2;
    A[2].y = 4;
    A[3] = new Point2D();
    A[3].x = -3;
    A[3].y = 2;
    A[4] = new Point2D();
    A[4].x = 2;
    A[4].y = -2;

    JavaQuicker.p("got result:");
    JavaQuicker.p(solution(A));
    JavaQuicker.p("expected result:");
    JavaQuicker.p(4);


  }

  public int solution(Point2D[] A) {
    Map<Integer, Integer> lasersforward = new HashMap<>();
    Map<Integer, Integer> lasersbackward = new HashMap<>();

    for (int i = 0; i < A.length; i++) {
      Double statueXposition = (double) A[i].x;
      Double statueYposition = (double) A[i].y;
      Double statueFormula = (double) statueYposition / statueXposition;
      Integer stableFormula = (int) (statueFormula * 10);

      if (statueXposition > 0) {
        if (lasersforward.containsKey(statueFormula)) {
          lasersforward.put(stableFormula, lasersforward.get(statueFormula) + 1);
        } else {
          lasersforward.put(stableFormula, 1);
        }
      } else {
        if (lasersbackward.containsKey(statueFormula)) {
          lasersbackward.put(stableFormula, lasersbackward.get(statueFormula) + 1);
        } else {
          lasersbackward.put(stableFormula, 1);
        }
      }
    }

    int totalNumberOfLasersNeeded = 0;
    for (Integer i : lasersforward.values()) {
      totalNumberOfLasersNeeded += i;
    }
    for (Integer i : lasersbackward.values()) {
      totalNumberOfLasersNeeded += i;
    }

    return totalNumberOfLasersNeeded;
  }

  class Point2D {

    public int x;
    public int y;
  }
}
