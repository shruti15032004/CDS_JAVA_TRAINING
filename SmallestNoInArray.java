public class SmallestNoInArray {
    public static void main(String[] args) {
        int[] num = {17, 7, 3, 1, 24, 9};
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if(min>num[i]){
                min =num[i];
            }
        }
        System.out.println("Smallest element : " + min);
    }
}