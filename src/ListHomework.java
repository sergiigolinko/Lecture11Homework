import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

public class ListHomework {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        sortList();
        removeDuplicates();
        lessThenTenSymbols();
        System.out.println(mostCommonInList());

    }

    private static void sortList() {
        List<String> stringList = new ArrayList<String>();
        stringList.add("mkjkm");
        stringList.add("hjbjjklml");
        stringList.add("ok");
        for (int i = 0; i < stringList.size(); i++) {
            sort(stringList);

        }
        System.out.println(stringList);
    }

    private static void removeDuplicates() {
        List<String> stringList = new ArrayList<String>();
        stringList.add("aaa");
        stringList.add("aaa");
        stringList.add("hgfj");
        stringList.add("ddd");
        stringList.add("aaa");
        for (int i = 0; i < stringList.size(); i++) {
            for (int j = i + 1; j < stringList.size(); j++) {
                if (stringList.get(i).equals(stringList.get(j))) {
                    stringList.remove(j);
                    j--;
                }

            }

        }
        System.out.println(stringList);
    }

    private static void lessThenTenSymbols() {
        List<String> stringList = new ArrayList<String>(5);
        stringList.add(SCANNER.nextLine());
        stringList.add(SCANNER.nextLine());
        stringList.add(SCANNER.nextLine());
        stringList.add(SCANNER.nextLine());
        stringList.add(SCANNER.nextLine());
        String s10 = "qwertyuiof";
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).length() < s10.length()) {
                System.out.println(stringList.get(i));

            }

        }
    }

    private static int mostCommonInList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        int count = 1;
        int tempCount = 0;
        int common = list.get(0);
        int temp = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            temp = list.get(i);
            tempCount = 0;
            for (int j = 1; j < list.size(); j++) {
                if (temp == list.get(i)) {
                    tempCount++;
                }
            }
            if (tempCount > count) {
                common = temp;
                count = tempCount;
            }
        }
        return common;
    }
}
