package curriculum_g;

class Person {

  String name;
  int age;
  double height;
  double weight;

  // ★ 人数カウント（static）
  static int count = 0;

  Person(String name, int age, double height, double weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;

    count++; // ★ 作られるたびに増える
  }

  double bmi() {
    return this.weight / (this.height * this.height);
  }

  void print() {
    System.out.println("名前は" + this.name + "です");
    System.out.println("年は" + this.age + "です");
    System.out.println("BMIは" + String.format("%.2f", this.bmi()) + "です");
  }
}