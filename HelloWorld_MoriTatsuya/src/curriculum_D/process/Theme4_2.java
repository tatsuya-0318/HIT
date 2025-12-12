package curriculum_D.process;

public class Theme4_2 {

    // フィールド（privateでカプセル化）
    private String name;
    private int hp;
    private int mp;
    private int attack;
    private int speed;
    private int defense;

    // コンストラクタ（名前を受け取る）
    public Theme4_2(String name) {
        this.name = name;

        // ステータスは毎回変わる（ランダム）
        this.hp = (int)(Math.random() * 1000);   // 0〜999
        this.mp = (int)(Math.random() * 1000);
        this.attack = (int)(Math.random() * 500);
        this.speed = (int)(Math.random() * 1000);
        this.defense = (int)(Math.random() * 100);
    }

    // getter
    public String getName() { return this.name; }
    public int getHp() { return this.hp; }
    public int getMp() { return this.mp; }
    public int getAttack() { return this.attack; }
    public int getSpeed() { return this.speed; }
    public int getDefense() { return this.defense; }

    // setter（条件に「setterを使う」があるので最低1つ用意）
    public void setName(String name) {
        this.name = name;
    }
}