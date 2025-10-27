package curriculum_D;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Theme2_1 {
	
	// 【フィールド】（thisを使うためにインスタンス変数にする）
		String place;   // 場所
		String food;    // 食べ物
		String type;    // 食べ物の種類
		
		// 【コンストラクタ】
		public Theme2_1(String place, String food, String type) {
			this.place = place;  // thisでフィールドに代入
			this.food = food;
			this.type = type;
		}
		
		// 【メソッド1】あいさつ
		public void greeting() {
			System.out.println("こんにちは！ここは" + this.place + "です！");
		}
		
		// 【メソッド2】食べ物の感想
		public void comment() {
			System.out.println("この" + this.food + "はうまい");
		}
		
		// 【メソッド3】食べ物の種類
		public void info() {
			System.out.println(this.food + "は" + this.type + "です");
		}
		
		// 【メソッド4】日時の表示
		public void showDateTime() {
			LocalDateTime now = LocalDateTime.now();  // 現在日時を取得
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			String formatted = now.format(fmt);
			System.out.println("今の現在日時は" + formatted + "です");
		}

}
