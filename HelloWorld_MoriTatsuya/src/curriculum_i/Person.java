package curriculum_i;

public class Person {

  // クラスフィールド
  private static int count = 0;

  // インスタンスフィールド
  private String firstName;
  private String lastName;
  private int age;
  private double height;
  private double weight;

  // ★ コンストラクタ①（フルネーム）
  public Person(String firstName, String lastName, int age, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;

    Person.count++;
  }

  // ★ コンストラクタ②（オーバーロード）
  public Person(String firstName, int age, double height, double weight) {
    this.firstName = firstName;
    this.lastName = ""; // lastNameなし
    this.age = age;
    this.height = height;
    this.weight = weight;

    Person.count++;
  }

  // フルネーム
  public String fullName() {
    return this.firstName + this.lastName;
  }

  // 表示
  public void print() {
    System.out.println("名前は" + this.fullName() + "です");
    System.out.println("年は" + this.age + "です");
  }

  // BMI
  public double bmi() {
    return this.weight / this.height / this.height;
  }

  // 人数表示
  public static void printCount() {
    System.out.println("合計" + Person.count + "人です");
  }
}