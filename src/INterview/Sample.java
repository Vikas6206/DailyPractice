package INterview;

public class Sample {

    public static void main(String args[]) {
        String input = "B!FDCEA2";

        String reverseString = reverseCharacter(input);
        System.out.println("Reverse string is " + reverseString);
    }

    private static String reverseCharacter(String input) {
        char[] ch = input.toCharArray();
        int l = 0, r = ch.length - 1;

        while (l < r) {
            while(!Character.isAlphabetic(ch[l])) {
                l++;
            }
            while (!Character.isAlphabetic(ch[r])) {
                r--;
            }
            //swap the 2 values

            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;

        }

        return new String(ch);

    }

}
