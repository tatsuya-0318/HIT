package curriculum_h;

public class Person {

  // ★ 問題1：クラスフィールド（static）
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
  }

  // BMI
  public double bmi() {
    return this.weight / this.height / this.height;
  }

  // 表示
  public void print() {
    System.out.println("名前は" + this.name + "です");
    System.out.println("年は" + this.age + "です");
  }
}