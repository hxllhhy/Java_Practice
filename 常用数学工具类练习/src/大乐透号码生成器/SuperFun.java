package 大乐透号码生成器;

import java.util.*;

public class SuperFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            StringBuilder sb = new StringBuilder();
            List<String> startList = getStarNumber();
            List<String> endList = getEndNumber();
            for (String s : startList) {
                sb.append(s + " ");
            }
            sb.append("\t");
            for (String s : endList) {
                sb.append(s + " ");
            }
            System.out.println(sb.toString());
        }
    }
    public static List<String> getStarNumber() {
        List<String> list = new ArrayList<>();
        String luckyNumber = "";
        for (int i = 1; i < 36; i++) {
            if(i < 10) {
                list.add("0" + i + " ");
            } else {
                list.add("" + i + " ");
            }
        }
        int roundIndex = 0;
        List<String> luckyList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int amount = list.size();
            Random ra = new Random();
            roundIndex = ra.nextInt(amount);
            luckyNumber = list.get(roundIndex);
            luckyList.add(luckyNumber);
            list.remove(roundIndex);
        }
        Collections.sort(luckyList);
        return luckyList;
    }
    public static List<String> getEndNumber() {
        List<String> list = new ArrayList<>();
        String luckyNumber = "";
        for (int i = 0; i < 13; i++) {
            if(i < 10) {
                list.add("0" + i + " ");
            } else {
                list.add("" + i + " ");
            }
        }
        int roundIndex = 0;
        List<String> luckyList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int amount = list.size();
            Random ra = new Random();
            roundIndex = ra.nextInt(amount);
            luckyNumber = list.get(roundIndex);
            luckyList.add(luckyNumber);
            list.remove(roundIndex);
        }
        Collections.sort(luckyList);
        return luckyList;
    }
}
