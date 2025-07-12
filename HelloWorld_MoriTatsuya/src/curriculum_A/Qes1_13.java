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
		 
		 
	}

}