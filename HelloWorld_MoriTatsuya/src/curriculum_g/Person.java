package curriculum_g;

class Person {

	  // フィールド
	  String name;
	  int age;
	  double height;

	  // コンストラクタ
	  Person(String name, int age, double height) {

	    // ←ここが問題3
	    this.name = name;
	    this.age = age;
	    this.height = height;
	  }
}