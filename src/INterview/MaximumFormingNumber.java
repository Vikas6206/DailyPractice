package INterview;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given a number =923
 * another key number =5
 * insert the key number in netween the given number and get the highest number
 */
public class MaximumFormingNumber {
    public static void main(String args[]) {
        int givenNumber = 923;
        int key = 8;

        Integer maxNumber = findMaxNumber(givenNumber, key);

        System.out.println("Maximum number is " + maxNumber);
    }

    private static Integer findMaxNumber(int givenNumber, int key) {
        ArrayList<Integer> integerList = new ArrayList<>();

        while (givenNumber > 0) {
            int reminder = givenNumber % 10;
            integerList.add(reminder);
            givenNumber = givenNumber / 10;
        }

        integerList.add(key);
//        int outPutArray[] =integerList.stream().mapToInt(j->j).toArray();
        Collections.sort(integerList, (o1, o2) -> o2 - o1);

        String out = "";
        for (int i : integerList) {
            out += i;
        }
        return Integer.parseInt(out.trim());

    }
}
