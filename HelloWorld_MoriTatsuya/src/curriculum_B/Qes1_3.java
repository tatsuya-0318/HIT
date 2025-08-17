package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		try (Scanner sc = new Scanner(System.in)){//入力準備
		
			System.out.println("ユーザー名を入力してください：");//入力を促す
			
			String input = sc .nextLine();// コンソールから1行取得（nullは通常来ない）
			
			String userName = input.trim();
			
			int displayLen = userName.codePointCount(0, userName.length());//UTF-16のコード単位ではなく見た目の文字数でカウント。
			
			if (userName.isEmpty()) {//userName.isEmpty()：空文字（長さ0）かをチェック。
                System.out.println("名前を入力してください");
            } else if (displayLen > 10) {
                System.out.println("名前を10文字以内にしてください");
            } else if (!userName.matches("^[A-Za-z0-9]+$")) {//＾から＄までの範囲をA-Z / a-z / 0-9 の 半角英字・数字のみを許可する。
            	System.out.println("半角英数字のみで名前を入力してください");
            } else {
                System.out.println("ユーザー名「 " + userName + " 」を登録しました");
            }
		}
	}

}
