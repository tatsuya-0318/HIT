/**
 * 
 */
package curriculum_A;

/**
 * 
 */
public class Qes1_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int num=20;
		
		int num1=23;
		
		System.out.println("ハローJAVA"+(num+num1));
		
		//ここまででQ5の内容。
		
		String name;
		
		int age;
		
		float height;
		
		double weight;
		
		String food;
		
		name="山田太郎";
		
		age=18;
		
		height=170.5f;
		
		weight=62.2;
		
		food="寿司";
		
		System.out.println("初めまして"+name+"です。");
		
		System.out.println("年齢は"+age+"歳です。");
		
		System.out.println("身長は"+height+"cmです。");
		
		System.out.println("体重は"+weight+"kgです。");
		
		System.out.println("好きな食べ物は"+food+"です。");
		
		//ここまででQ6の内容。
		
		double BMI;//小数点も表示させたいからdouble型。
		
		double height1;
		
		height1=height/100;//cmをmに変換する。
		
		BMI=weight/Math.pow(height1,2);//累乗を表すにはMath.pow(底,指数);を活用する。
		
		System.out.println("BMIは"+BMI+"です。");
		
		//ここまででQ7の内容。
		
		
	}

}