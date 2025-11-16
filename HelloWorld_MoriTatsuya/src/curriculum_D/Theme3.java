package curriculum_D;

public class Theme3 {

	public static void main(String[] args) {
		
		// Theme3_1のインスタンス作成
		Theme3_1 animal = new Theme3_1();
		
		// setterを使って値を代入
		animal.setName("ライオン");
		animal.setLength(2.1);
        animal.setSpeed(80);
		
		// getterを使って出力
		System.out.println("動物名：" + animal.getName());
		System.out.println("体長：" + animal.getLength() + "m");
		System.out.println("速度：" + animal.getSpeed() + "km/h");
	}
}