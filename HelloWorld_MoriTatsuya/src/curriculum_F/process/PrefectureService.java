package curriculum_F.process;

import java.util.*;

public class PrefectureService {

    private static final String[] DATA = {
        "北海道:札幌市:83424",
        "青森県:青森市:9646",
        "岩手県:盛岡市:15275",
        "宮城県:仙台市:7282",
        "秋田県:秋田市:11638",
        "山形県:山形市:9323",
        "福島県:福島市:13784",
        "茨城県:水戸市:6097",
        "栃木県:宇都宮市:6408",
        "群馬県:前橋市:6362",
        "埼玉県:さいたま市:3798"
    };

    public static List<String> execute(String inputNums, String order) {

        List<Prefecture> list = new ArrayList<>();

        for (String s : inputNums.split(",")) {
            int index = Integer.parseInt(s.trim());
            String[] parts = DATA[index].split(":");

            list.add(new Prefecture(parts[0], parts[1], Double.parseDouble(parts[2])));
        }

        list.sort((a, b) -> 
            order.equalsIgnoreCase("asc")
            ? Double.compare(a.area, b.area)
            : Double.compare(b.area, a.area)
        );

        List<String> output = new ArrayList<>();
        for (Prefecture p : list) {
            output.add(p.format());
        }
        return output;
    }

    static class Prefecture {
        String name;
        String capital;
        double area;

        Prefecture(String n, String c, double a) {
            name = n;
            capital = c;
            area = a;
        }

        String format() {
            return  "都道府県名：" + name + "\n" +
                    "県庁所在地：" + capital + "\n" +
                    "面積：" + area + "km2\n";
        }
    }
}
