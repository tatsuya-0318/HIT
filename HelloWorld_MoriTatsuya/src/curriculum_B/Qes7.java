package curriculum_B;

import java.util.Scanner;

public class Qes7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("生徒の人数を入力してください（2以上）：");
        int n = sc.nextInt();

        int[][] scores = new int[n][4];
        String[] subjects = {"英語", "数学", "理科", "社会"}; // 追加①

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "人目の「英語」の点数を入力してください：");
            scores[i][0] = sc.nextInt();

            System.out.println((i + 1) + "人目の「数学」の点数を入力してください：");
            scores[i][1] = sc.nextInt();

            System.out.println((i + 1) + "人目の「理科」の点数を入力してください：");
            scores[i][2] = sc.nextInt();

            System.out.println((i + 1) + "人目の「社会」の点数を入力してください：");
            scores[i][3] = sc.nextInt();
        }

        double totalAll = 0; // 追加② 全体合計

        // 生徒ごとの平均
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += scores[i][j];
            }
            totalAll += sum; // 追加③ 全体合計に加算
            double avg = sum / 4.0;
            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), avg);
        }
        System.out.println();

        // 各教科の平均
        for (int j = 0; j < 4; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += scores[i][j];
            }
            double avg = sum / (double) n;
            System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], avg); // 追加④ 出力
        }

        // 全体平均
        double overall = totalAll / (n * 4.0); // 追加⑤
        System.out.printf("全体の平均点は%.2f点です。\n", overall);

        sc.close(); // 追加⑥（任意）
    }
}