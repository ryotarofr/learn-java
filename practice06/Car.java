package practice06;

// クラスの定義
class Car {
  // メンバ変数
  String color;
  int year;
  String model;

  // コンストラクタ
  public Car(String color, int year, String model) {
    this.color = color;
    this.year = year;
    this.model = model;
  }

  // メソッド
  public void start() {
    System.out.println("Engine started!");
  }

  public void stop() {
    System.out.println("Engine stopped!");
  }

  public static void main(String[] args) {
    // Carクラスのインスタンスを作成
    Car myCar = new Car("Red", 2022, "Toyota");

    // インスタンスのメソッドを呼び出し
    myCar.start();
    myCar.stop();

    // インスタンスのメンバ変数にアクセスして表示
    System.out.println("Color: " + myCar.color);
    System.out.println("Year: " + myCar.year);
    System.out.println("Model: " + myCar.model);
  }
}
