package Feb15;

public class Feb15_1 {

    static class Integer1 {
        int input;
        int index;

        public int search(int[] arrays, int input) {
            for (int i = 0; i < arrays.length; i++) {
                if (arrays[i] == input) {
                    this.index = i;
                }
            }
            return this.index;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        Integer1 s = new Integer1();
        int search = s.search(nums, -1);
        System.out.println("search = " + search);
    }

}
