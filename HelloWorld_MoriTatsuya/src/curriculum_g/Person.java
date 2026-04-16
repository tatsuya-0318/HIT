package curriculum_g;

class Person {

	  // フィールド
	  String name;
	  int age;
	  double height;
	  double weight;  // ← 追加

	  // コンストラクタ
	  Person(String name, int age, double height, double weight) {

	    this.name = name;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;  // ← 追加
	  }
}