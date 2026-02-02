public class Main {
    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};
        for (int i = 0; i < strs.length - 1; i++) {
            for (int j = 0; j < strs[i].length() && j < strs[i + 1].length(); j++) {
                if (strs[i].charAt(j) == strs[i + 1].charAt(j)) {
                    System.out.print(strs[i].charAt(j));
                } else {
                    break;
                }
            }

            System.out.println();
        }
    }
}