public class FrogJmp {

  public FrogJmp() {
    JavaQuicker.p("got result:");
    JavaQuicker.p(solution(10, 85, 30));
    JavaQuicker.p("expected result:");
    JavaQuicker.p(3);

    JavaQuicker.p("got result:");
    JavaQuicker.p(solution(110, 150, 10));
    JavaQuicker.p("expected result:");
    JavaQuicker.p(4);
  }

  public int solution(int X, int Y, int D) {
    return (Y - X) % D == 0 ? (Y - X) / D : (Y - X) / D + 1;
  }
}
