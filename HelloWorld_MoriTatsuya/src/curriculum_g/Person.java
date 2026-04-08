package curriculum_g;

class Person {

	  // フィールド
	  String name;
	  int age;
	  double height;

	  // コンストラクタ（←これが問題2）
	  Person(String name, int age, double height) {
	    this.name = name;
	    this.age = age;
	    this.height = height;
	  }
}