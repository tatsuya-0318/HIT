package curriculum_D;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Theme2_1 {
	
	// 【フィールドをprivateにして外から直接見えないようにする】
	private String place;   // 場所
	private String food;    // 食べ物
	private String type;    // 食べ物の種類
	
	// 【コンストラクタ】
	public Theme2_1(String place, String food, String type) {
		this.place = place;
		this.food = food;
		this.type = type;
	}
	
	// 【getterメソッド】（外部から値を読む専用）
	public String getPlace() {
		return this.place;
	}
	
	public String getFood() {
		return this.food;
	}
	
	public String getType() {
		return this.type;
	}
	
	// 【setterメソッド】（外部から値を変更する専用）
	public void setFood(String food) {
		this.food = food;
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
		LocalDateTime now = LocalDateTime.now(); 
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String formatted = now.format(fmt);
		System.out.println("今の現在日時は" + formatted + "です");
	}
}