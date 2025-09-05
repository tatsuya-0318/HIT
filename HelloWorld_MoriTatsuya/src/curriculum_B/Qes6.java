package curriculum_B;

import java.util.Random;//乱数を生成する Random クラスを使うのでインポート。
import java.util.Scanner;//キーボード入力を読む Scanner を使うのでインポート。

public class Qes6 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {//Scanner を開く。try-with-resources なので後で自動的に閉じられる。
            System.out.println("商品名を入力してください：");
            // 例：パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品
            String line = sc.nextLine();//入力行を1行まるごと取得し、line に格納。

            String[] items = line.split("、");   // 全角読点で分割
            Random rand = new Random();          // 0〜11 の乱数を作るため

            // ★拡張for文で順番に処理
            for (String raw : items) {//items の各要素（商品名）を順に取り出して処理する 拡張for文。
                String name = raw.trim();//前後の空白を削除して確定名 name に整える（入力に空白が混じってもOK）。
                int r = rand.nextInt(12);        // 0〜11 の乱数

                // ★switch文で商品ごとに出力
                switch (name) {
                    case "パソコン":
                    case "冷蔵庫":
                    case "扇風機":
                    case "洗濯機":
                    case "加湿器":
                        System.out.println(name + "の残り台数は" + r + "台です");
                        break;

                    // ★テレビとディスプレイは“続けて書く”
                    case "テレビ":
                    case "ディスプレイ":
                        // ★条件演算子で出力値を変更：
                        //   ディスプレイなら (11 - r) ／ テレビなら r
                        int out = "ディスプレイ".equals(name) ? (11 - r) : r;//条件演算子 ?:。name が「ディスプレイ」なら out = 11 - r、それ以外（=テレビ）なら out = r。
                        System.out.println(name + "の残り台数は" + out + "台です");
                        break;

                    // 指定外の商品
                    default:
                        System.out.println("『 " + name + " 』は指定の商品ではありません");
                }
            }
        }
    }
}