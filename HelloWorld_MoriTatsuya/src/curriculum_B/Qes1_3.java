package curriculum_B;

import java.util.Scanner;
import java.util.Random;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		try (Scanner sc = new Scanner(System.in)){//入力準備
		
			System.out.println("ユーザー名を入力してください：");//入力を促す
			
			String input = sc .nextLine();// コンソールから1行取得（nullは通常来ない）
			
			String userName = input.trim();
			
			int displayLen = userName.codePointCount(0, userName.length());//UTF-16のコード単位ではなく見た目の文字数でカウント。
			
			if (userName.isEmpty()) {//userName.isEmpty()：空文字（長さ0）かをチェック。
                System.out.println("名前を入力してください");
            } else if (displayLen > 10) {
                System.out.println("名前を10文字以内にしてください");
            } else if (!userName.matches("^[A-Za-z0-9]+$")) {//＾から＄までの範囲をA-Z / a-z / 0-9 の 半角英字・数字のみを許可する。
            	System.out.println("半角英数字のみで名前を入力してください");
            } else {
                System.out.println("ユーザー名「 " + userName + " 」を登録しました");
                
                String[] hands = {"グー","チョキ","パー"};
                
                Random rand = new Random();//「乱数発生器を用意」しているだけ
                
                for (int count = 0; ;) {
                	System.out.println("0はグー、1：チョキ、2：パー から選んで入力してください: ");
                	String line = sc.nextLine().trim();
                	
                	if (!line.matches("[012]")) {
                		System.out.println("0 / 1 / 2のいずれかを入力してください。");
                		continue;
                	}
                	int me  = Integer.parseInt(line);
                	int cpu = rand.nextInt(3); // 0..2
                	count++; // 1回プレイしたので加算（有効入力のみ）
                	
                	System.out.println(userName + "の手は「" + hands[me] + "」");
                	System.out.println("相手の手は「" + hands[cpu] + "」");
                	
                	
                	if (me == cpu) {
                		System.out.println("DRAW あいこ もう一回しましょう！");
                		continue;
                	}
                	 // 勝ち判定：cpu が (me + 1) % 3 なら自分の勝ち
                    if (cpu == (me + 1) % 3) {
                        System.out.println("やるやん。");
                        System.out.println("次は俺にリベンジさせて");
                        System.out.println("勝つまでにかかった合計回数は" + count + "回です");
                        break; // 勝ったのでループ終了
                    }
                    System.out.println("俺の勝ち！");
                    if (cpu == 0) {                 // 相手がグー → 自分はチョキで負け
                        System.out.println("負けは次につながるチャンスです！");
                        System.out.println("ネバーギブアップ！");
                    } else if (cpu == 1) {          // 相手がチョキ → 自分はパーで負け
                        System.out.println("たかがじゃんけん、そう思ってないですか？");
                        System.out.println("それやったら次も、俺が勝ちますよ");
                    } else {                        // cpu == 2（相手がパー）→ 自分はグーで負け
                        System.out.println("なんで負けたか、明日まで考えといてください。");
                        System.out.println("そしたら何かが見えてくるはずです");
                    }
                 }
                
                
            }
		}
	}

}
