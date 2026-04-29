package curriculum_h;

public class Person {

  // クラスフィールド
  public static int count = 0;

  // インスタンスフィールド
  private String name;
  private int age;
  private double height;
  private double weight;

  // コンストラクタ
  public Person(String name, int age, double height, double weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;

    count++;
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  public void print() {
    System.out.println("名前は" + this.name + "です");
    System.out.println("年は" + this.age + "です");
  }

  // ★ 問題5（ここが答え）
  public static void printCount() {
    System.out.println("合計" + count + "人です");
  }
}