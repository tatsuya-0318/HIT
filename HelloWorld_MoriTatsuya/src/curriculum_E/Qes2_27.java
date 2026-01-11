package curriculum_E;

import java.util.Scanner;

public class Qes2_27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("コンソールに文字を入力してください");
        String input = sc.nextLine();

        // ① , で分割
        String[] animals = input.split(",");

        for (String a : animals) {

            // ② : で分解
            String[] data = a.split(":");

            String name = data[0];
            double length = Double.parseDouble(data[1]);
            int speed = Integer.parseInt(data[2]);

            // ③ 学名取得
            String scientificName = getScientificName(name);

            // ④ 出力
            System.out.println("動物名：" + name);
            System.out.println("体長：" + length + "m");
            System.out.println("速度：" + speed + "km/h");
            System.out.println("学名：" + scientificName);
            System.out.println();
        }

        sc.close();
    }

    // 学名を返すメソッド
    private static String getScientificName(String name) {

        switch (name) {
            case "ライオン":
                return "パンテラ レオ";
            case "ゾウ":
                return "ロキソドンタ・サイクロティス";
            case "パンダ":
                return "アイルロポダ・メラノレウカ";
            case "チンパンジー":
                return "パン・トゥログロディテス";
            case "シマウマ":
                return "チャップマンシマウマ";
            default:
                return "不明";
        }
    }
}