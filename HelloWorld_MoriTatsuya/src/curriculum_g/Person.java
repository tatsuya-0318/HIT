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

	  // ★ これが問題7の答え
	  double bmi() {
	    return this.weight / (this.height * this.height);
	  }
}