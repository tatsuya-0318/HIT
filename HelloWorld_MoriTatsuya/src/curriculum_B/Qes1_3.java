package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		try (Scanner sc = new Scanner(System.in)){//入力準備
		
			System.out.println("ユーザー名を入力してください：");//入力を促す
			
			String input = sc .nextLine();// コンソールから1行取得（nullは通常来ない）
			
				if (input == null || input.trim().isEmpty()) {// ① 未入力（null or 空文字 or 空白だけ）
					
					System.out.println("名前を入力してください");
					
					return;
				}
			
			String userName = input.trim(); // 前後の空白は無視したい想定でtrim
			
				if (userName.length() > 10 ) {// ② 文字数が10より大きい
					
					System.out.println("名前を10文字以内にしてください");
					
					return;
				}

			System.out.println("ユーザー名「 " + userName + " 」を登録しました");// ③ 正常
		}
	

	}

}
