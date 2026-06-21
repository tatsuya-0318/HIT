package curriculum_j;

public class Person {

  private String firstName;
  private String lastName;
  private int age;
  private double height;
  private double weight;

  public Person(String firstName, String lastName, int age, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String fullName() {
    return this.firstName + this.lastName;
  }
  
  public void buy(Car car) {
	car.setOwner(this.fullName());	
	System.out.println(this.fullName() + "が購入しました");
	}

	public void buy(Bicycle bicycle) {
	  bicycle.setOwner(this.fullName());
	  System.out.println(bicycle.getOwner() + "が購入しました");
	}
}