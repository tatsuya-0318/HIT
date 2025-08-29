package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		for (int i = 1; i <= 9; i++) { //九九の “段（行）” を1〜9まで回す。i が行番号。
			 StringBuilder line = new StringBuilder();//1行分の文字列を作る“入れ物”。+ 連結より 高速＆ムダな一時文字列が出ない から、ループ内ではこれが定番。
		   for (int j = 1; j <= 9; j++) { //その行の中で 1〜9 の列を回す。j が列番号。各マスに i * j の計算結果を入れる。
			 line.append(String.format("%02d ＊ %02d = %02d", i, j, i * j));//表示の“型”をそろえるフォーマット指定。%02d は 2桁の整数、足りない分は 先頭を 0 で埋める（01, 02, …）。先頭の数、掛ける数、結果のすべてを 2桁にして、桁ズレを防止。＊ は 全角アスタリスク（画像に合わせて半角 * ではなく全角）。
			 if (j < 9) line.append(" || ");//最後の列の後ろにだけ区切りを付けないための条件。
		   }
		  System.out.println(line);//1行ぶん作り終わったらまとめて表示。これにより、列間の区切りや余計なスペースを厳密にコントロールできる。
		}

	}

}
