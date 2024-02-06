package practice06;

import java.util.ArrayList;
import java.util.List;

public class Array {
  public static void main(String[] args) {
    // 配列をリストから作成する:
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    int[] myArray = list.stream().mapToInt(Integer::intValue).toArray();
    System.out.println(list);
    System.out.println(myArray);
  }
}
