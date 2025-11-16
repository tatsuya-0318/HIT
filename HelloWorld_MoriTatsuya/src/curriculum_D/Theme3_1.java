package curriculum_D;

public class Theme3_1 {

	// フィールド（必ず private）
	private String name;   // 動物名
	private double length; // 体長
	private int speed;     // 速度

	// setter（値を入れる）
	public void setName(String name) {
		this.name = name;        // thisでフィールドに代入
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// getter（値を取り出す）
	public String getName() {
		return this.name;
	}

	public double getLength() {
		return this.length;
	}

	public int getSpeed() {
		return this.speed;
	}
}