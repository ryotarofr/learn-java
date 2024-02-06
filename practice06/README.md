## 配列

### 配列を宣言して初期化する:

```java
int[] myArray = {1, 2, 3, 4, 5};
```

### 配列を宣言して後で初期化する:

```java
int[] myArray;
myArray = new int[5];
myArray[0] = 1;
myArray[1] = 2;
myArray[2] = 3;
myArray[3] = 4;
myArray[4] = 5;

```

### 配列を動的にサイズ変更する:

```java
int[] myArray = new int[5]; // 初期サイズを指定
// もし後でサイズを変更したい場合
myArray = Arrays.copyOf(myArray, 10); // 新しいサイズを指定
```

### // 多次元配列を作成する:

```java
int[][] multiDimensionalArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
```

### new について

new つける場合：
`int[] myArray = new int[5];`のように配列のサイズを指定する

new を付けない場合：
`int[] myArray = {1, 2, 3, 4, 5};`のように配列の数が明示しなくてもわかるとき

java の配列は波括弧らしい
