package curriculum_C;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		
		Dog dog1 = new Dog();  // 引数なしコンストラクタで作成
		System.out.println("動物の名前：" + dog1.name);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		
		Dog dog2 = new Dog(3); // 3匹の犬として作成
		System.out.println("動物の数：" + dog2.count);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		String formatted = now.format(fmt);
		System.out.println("現在日時：" + formatted);
		
	}

}
