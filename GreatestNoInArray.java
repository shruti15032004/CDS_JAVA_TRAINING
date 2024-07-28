public class GreatestNoInArray {
    // find greatest number
    public static void main(String[] args) {
        int[] num={1,7,3,11,24,9};
        int maximum=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>maximum){
                maximum=num[i];
            }

        }
        System.out.println("Greatest element : " + maximum);
    }
}
