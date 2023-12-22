### 整数

```java
byte hoge; // -100 ~ 100
short hoge; // -3万 ~ 3万
int hoge; // -20億 ~ 20億
long hoge; // 京桁以上
```

## 小数

```java
float hoge = 1.234F; // 小数点以下の桁数多い時(最後にFつける)
double hoge = 1.23456; //　小数
```

## 文字

```java
char hoge = "a"; //　文字1つ
String hoge = "abc";　// 文字2つ以上
```

### 大文字小文字区別される

```java
    String HOGE = "HOGE";
    String hoge = "hoge";
```

## bool 型

```java
int hoge1 = 1;
int hoge2 = 2;
boolean hoge_bool;

hoge_bool = (hoge1 > hoge2) //false
```

## データ型

### パターン 1

先にインスタンス化

- コードが長い時にデータ数が何個かってのがわかりやすそう

```java
String[] arr;
arr = new String[3];

arr[0] = "Sato";
arr[1] = "Suzuki";
arr[2] = "Takahashi";

System.out.println(arr[1]);
```

```java
String[] arr;
arr = new String[3];
```

この書き方冗長だなあ()
`new String[3]`の 3 はデータの数なんや
`new String[2]`にしたら`java.lang.ArrayIndexOutOfBoundsException: 2`怒らしい

### パターン 2

- デフォデータがある場合にはこっちかな
- 上書きとかあんまやらないときに使えそう

```java
String[] arr2 = { "Sato", "Suzuki", "Takahashi"};

System.out.println(arr2[1]);
```

### パターン 3

## 2 次元配列
