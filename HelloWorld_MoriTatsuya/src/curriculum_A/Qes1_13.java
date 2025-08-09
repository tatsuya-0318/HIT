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
		
		byte age ;
		// バイト型（-128～127）
		
		short temperature ;
		// 短整数型（-32，768～32，767）
		
		int score ;
		// 整数型（-2，147，483，648～2，147，483，647）
		
		long population ;
		// 長整数型（-9,223,372,036,854,775,808 ～ 9,223,372,036,854,775,807）
		
		float height ;
		// 単精度浮動小数点数型
		
		double weight ;
		// 倍精度浮動小数点数型
		
		char letter ;
		// 文字型（1文字）
		
		String message ;
		// 文字列型（文字の並び）
		
		boolean isActive ;
		// ブーリアン型（true or false）
		
		//ここまででQ1の内容。
		
		
		 age = 0 ;
		 
		 temperature = 0;
		 
		 score = 0;
		 
		 population = 0L ;
		 
		 height = 0.0f ;
		 
		 weight = 0.0 ;
		 
		 letter = '\u0000' ;
		 
		 message = null ;
		 
		 isActive = false ;
		 
		 //ここまででQ2の内容。
		 
		 byte age2 ;
		 
		 age2 = 10 ;
		 
		 byte age3 ;
		 
		 age3 = (byte)(age + age2);// byteはキャストが必要
		 
		 short temperature2 ;
		 
		 temperature2 = 100;
		 
		 short temperature3 ;
		 
		 temperature3 =(short)(temperature + temperature2) ;// shortもキャスト
		 
		 int score2 ;
		 
		 score2 = 1000 ;
		 
		 int score3 ;
		 
		 score3 = score + score2 ;
		 
		 long population2 ;
		 
		 population2 = 10000 ;
		 
		 long population3 ;
		 
		 population3 = population + population2 ;
		 
		 float height2 ;
		 
		 height2 = 9.5f ;
		 
		 float height3 ;
		 
		 height3 = height + height2 ;
		 
		 double weight2 ;
		 
		 weight2 = 10.5 ;
		 
		 double weight3 ;
		 
		 weight3 = weight + weight2 ;
		 
		 char letter2 ;
		 
		 letter2 = 'a' ;
		 
		 String letter3 ;
		 
		 letter3 = "" + letter + letter2 ; // char + char → intになるので Stringに変換
		 
		 String message2 ;
		 
		 message2 = "ハロー" ;
		 
		 String message3 ;
		 
		 message3 = message + message2 ;
		 
		 boolean isActive2 ;
		 
		 isActive2 = true ;
		 
		 boolean isActive3 ;
		 
		 isActive3 = isActive || isActive2 ;// 論理和（どちらかがtrueならtrue）
		 
		 //ここまででQ3の内容。
		 
		// 1. 11110 
		 System.out.println(population3 + score3 + age3+ temperature3);
		 
		// 2. 20 
		 System.out.println(age3 * 2);
		 
		// 3. a ハロー true
		 System.out.println(letter2 + " " + message2 + " " + isActive2);
		 
		// 4. 11130
		 System.out.println(population3 + score3 + temperature3 + age3 * 3 );
		 
		// 5. 1E+10
		 double total = (double)population3 * score3 * age3 * temperature3;//10進数にするためにdouble型にキャストする。
		 System.out.println(total);
		 
		// 6. 0.105
		 System.out.println(weight2 / 100);
		 
		// 7. -90
		 System.out.println(age3 - temperature3);
		 
		 
		 //ここまででQ4の内容。
		 
		
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
		
		double BMI1=Math.round(BMI*10.0)/10.0;//四捨五入小数点第一にする。BMIを一度10倍してMath.roundで四捨五入してそのあと10で割って小数点第一にしてる。
		
		System.out.println("BMIは"+BMI1+"です。");
		
		//ここまででQ7の内容。
		
		
		//再代入
		name="鈴木一郎";
		
		age=24;
		
		int ageQ8 = age;
		
		height=168.5f;
		
		weight=64.2;
		
		food="オムライス";
		
		//BMIの計算
		
		height1=height/100;
		
		BMI=weight/Math.pow(height1,2);
		
		BMI1=Math.round(BMI*10.0)/10.0;
		
		//出力
		System.out.println("初めまして"+name+"です。");
		
		System.out.println("年齢は"+age+"歳です。");
		
		System.out.println("身長は"+height+"cmです。");
		
		System.out.println("体重は"+weight+"kgです。");
		
		System.out.println("好きな食べ物は"+food+"です。");
		
		System.out.println("BMIは"+BMI1+"です。");
		
		//ここまででQ8の内容。
		
		age = age + age;
		
		height = height + height;
		
		weight = weight + weight ;
		
		height1 = height / 100;
		
		BMI = weight / Math.pow(height1,2);
		
		BMI1 = Math.round(BMI*100.0) / 100.0;
		
		System.out.println("初めまして" + name + "です。");
		
		System.out.println("年齢は" + age + "歳です。");
		
		System.out.println("身長は" + height + "cmです。");
		
		System.out.println("体重は" + weight + "kgです。");
		
		System.out.println("好きな食べ物は" + food + "です。");
		
		System.out.println("BMIは" + BMI1 + "です。");
		
		//ここまででQ9の内容。
		
		boolean isOver25;
		
		isOver25 = ageQ8 >= 25;
		
		System.out.println(isOver25);
		
		//ここまででQ10の内容。
		
		String ageStr = Integer.toString(ageQ8) ;//int型→String型に変換カッコ内に値を入れてコロンで閉じる。
		
		String heightStr = Float.toString(height);//float型→String型に変換カッコ内に値を入れてコロンで閉じる。
		
		String weightStr = Double.toString(weight);//double型→String型に変換カッコ内に値を入れてコロンで閉じる。
		
		System.out.println(ageStr + heightStr + weightStr);
		
		//ここまででQ11の内容。
		
		int ageInt = Integer.parseInt(ageStr);
		
		int heightInt = (int)Float.parseFloat(heightStr);
		
		System.out.println(ageInt);
		
		System.out.println(heightInt);
		
		//ここまででQ12の内容。
		
		boolean heightAge = (ageInt == 25) || (heightInt >= 160);
		
		
		System.out.println(heightAge);
		
		//ここまででQ13の内容。
	}

}