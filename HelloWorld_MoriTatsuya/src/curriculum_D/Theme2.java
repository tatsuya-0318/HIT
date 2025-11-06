package curriculum_D;

public class Theme2 {
	public static void main(String[] args) {
		
		Theme2_1 japan = new Theme2_1("日本", "寿司", "和食");
		
		// メソッド呼び出し
		japan.greeting();
		japan.comment();
		japan.info();
		japan.showDateTime();
		
		// 外部から直接フィールドにアクセスはできない（下記はエラー）
		// japan.food = "カレー"; ← privateだから触れない

		// 代わりに setterを使う
		japan.setFood("ラーメン");
		System.out.println("食べ物を変更：" + japan.getFood());
	}
}