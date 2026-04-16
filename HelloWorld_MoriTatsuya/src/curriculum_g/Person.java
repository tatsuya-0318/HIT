package curriculum_g;

class Person {

	  String name;
	  int age;
	  double height;
	  double weight;

	  Person(String name, int age, double height, double weight) {
	    this.name = name;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	  }

	  // BMI
	  double bmi() {
	    return this.weight / (this.height * this.height);
	  }

	  // ★ 問題9
	  void print() {
	    System.out.println("名前は" + this.name + "です");
	    System.out.println("年は" + this.age + "です");
	    System.out.println("BMIは" + this.bmi() + "です");
	  }
}