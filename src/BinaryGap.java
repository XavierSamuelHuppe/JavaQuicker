public class BinaryGap {

  public BinaryGap() {
    int example = 529;
//    int example = 20;
    JavaQuicker.p(solution(example));
  }

  public int solution(int N) {
    String binary = Integer.toBinaryString(N);
    int biggestGap = 0;

    String binaryWithoutTrailings = binary
        .substring(binary.indexOf("1"), binary.lastIndexOf("1") + 1);

    String splitableBinary = binaryWithoutTrailings.replaceAll("1+", "1");
    String[] segments = splitableBinary.split("1");
    for (int i = 0; i < segments.length; i++) {
      biggestGap = Math.max(biggestGap, segments[i].length());
    }

    return biggestGap;
  }
}
