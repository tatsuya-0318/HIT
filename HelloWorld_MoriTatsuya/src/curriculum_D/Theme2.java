package curriculum_D;

public class Theme2 {
	
	public static void main(String[] args) {
		
		// Theme2_1クラスのインスタンスを生成（引数を渡す）
		Theme2_1 japan = new Theme2_1("日本", "寿司", "和食");
		
		// 各メソッドを順番に呼び出す
		japan.greeting();
		japan.comment();
		japan.info();
		japan.showDateTime();
	}

}
