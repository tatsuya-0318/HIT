package curriculum_F;

import java.util.*;
import curriculum_F.process.PrefectureService;

public class Main {

    public static void Main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("番号をカンマ区切りで入力してください");
        String inputNums = sc.nextLine();

        System.out.println("昇順 or 降順 を入力してください（asc / desc）");
        String order = sc.nextLine();

        List<String> result = PrefectureService.execute(inputNums, order);

        for (String s : result) {
            System.out.println(s);
        }

        sc.close();
    }
}