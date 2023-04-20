import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class P_03 {

  public static void main(String[] args) {
    List<Integer> list2 = Arrays.asList(8, 2, 1, 7, 5);

    Stream<Integer> StreamData = list2.stream();

    // long count =  StreamData.count();
    // System.out.println(count);

    // StreamData.forEach(System.out::println);

    Stream<Integer> finalStream = StreamData
      .filter(n -> n % 2 == 0)
      .sorted()
      .map(n -> n * 2);

    // Stream<Integer> sortedData = fillData.sorted();

    // sortedData.forEach(n -> System.out.println(n));

    // Stream<Integer> mapStream = sortedData.map(n -> n * 2);

    finalStream.forEach(n -> System.out.println(n));
  }
}
