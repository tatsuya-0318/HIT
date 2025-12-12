package curriculum_D;

import java.util.Scanner;
import curriculum_D.process.Theme4_1;  // ← パッケージに合わせてここを変更

public class Theme4 {

    public static void main(String[] args) {

        // try-with-resourcesでscannerを自動クローズ
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("名前を入力してください：");
            String name = scanner.nextLine();

            // サブクラス Theme4_1 のインスタンスを作成
            Theme4_1 player = new Theme4_1(name);

            // あいさつ
            player.greeting();

            // ステータス表示
            System.out.println("ステータス");
            System.out.println("HP：" + player.getHp());
            System.out.println("MP：" + player.getMp());
            System.out.println("攻撃力：" + player.getAttack());
            System.out.println("素早さ：" + player.getSpeed());
            System.out.println("防御力：" + player.getDefense());

            System.out.println("\nさあ冒険に出かけよう！");
        }
    }
}