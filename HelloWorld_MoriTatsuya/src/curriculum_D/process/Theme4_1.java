package curriculum_D.process;

public class Theme4_1 extends Theme4_2 {

    // サブクラスのコンストラクタ：名前を親クラスへ渡す
    public Theme4_1(String name) {
        super(name);  // Theme4_2(String name) のコンストラクタを呼ぶ
    }

    // あいさつ用メソッド
    public void greeting() {
        System.out.println("こんにちは 「" + getName() + "」 さん");
    }
}