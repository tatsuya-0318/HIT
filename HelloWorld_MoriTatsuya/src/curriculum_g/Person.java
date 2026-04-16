package curriculum_g;

class Person {

	  // フィールド
	  String name;
	  int age;
	  double height;
	  double weight;

	  // コンストラクタ
	  Person(String name, int age, double height, double weight) {
	    this.name = name;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	  }

	  // ★ 問題6：bmiメソッド
	  double bmi() {
	    return this.weight / (this.height * this.height);
	  }
}