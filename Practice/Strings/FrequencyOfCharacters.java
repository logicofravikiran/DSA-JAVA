
class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "asdasdfasdfgasd";
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            int count;
            if (arr[i] == 0) {
                count = 1;
                arr[i] = 1;
                System.out.print(str.charAt(i) + " :- ");
            } else {
                count = 0;
            }

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && arr[j] == 0) {
                    arr[j] = 1;
                    count++;
                } else if (str.charAt(i) == str.charAt(j) && arr[j] != 0) {
                    count--;
                }
            }

            if (count > 0) {
                System.out.print(count);
                System.out.println();
            }
        }
    }
}
