import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Memory<T> {

  private T[] sortArray(T[] arrayToSort) {
    Arrays.sort(arrayToSort);
    return arrayToSort;
  }

  private List<?> sortList(List<? extends Comparable> listToSort) {
    Collections.sort(listToSort);
    return listToSort;
  }

  private List<T> convertToList(T[] arrayToConvert) {
    List<T> objectList = Arrays.stream(arrayToConvert).collect(Collectors.toList());
    return objectList;
  }
}
