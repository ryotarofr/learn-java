package practice07;

public class Main {
  public static void main(String[] args) {
    String si = "Java and JavaScript";
    if (si.contains("Java")) {
      System.out.println("siにJavaは含まれています。");
    }
    if (si.endsWith("Java")) {
      System.out.println("siのJavaは末尾にあります。");
    }
    System.out.println("Javaが初めに登場するのは" + si.indexOf("Java"));
    System.out.println("Java が最後に登場するのは" + si.lastIndexOf("Java"));
  }
}
