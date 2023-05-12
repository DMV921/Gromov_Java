public class Third {
    public static void main(String[] args) {
        int[] new_arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < new_arr.length; i++) {
            if (new_arr[i] % 3 == 0) {
                System.out.println(new_arr[i]);
            }
        }
    }
}
