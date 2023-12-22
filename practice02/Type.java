package practice02;

public class Type {
  public static void main(String[] args) {
    int numberA;
    numberA = 10;
    System.out.println(numberA);

    // 大文字小文字区別される
    String HOGE = "HOGE";
    String hoge = "hoge";

    System.out.println(HOGE);
    System.out.println(hoge);

    String[] arr;
    arr = new String[3];

    arr[0] = "Sato";
    arr[1] = "Suzuki";
    arr[2] = "Takahashi";

    System.out.println(arr[1]);

    String[] arr2 = { "Sato", "Suzuki", "Takahashi " };

    arr2[1] = "Tanaka"; // 2番目を田中に

    System.out.println(arr2[1]); // Tanaka

    // String[][] arr3;
    // arr3 = new String[2][2];
  }

}