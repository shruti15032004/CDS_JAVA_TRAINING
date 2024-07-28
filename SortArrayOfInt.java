public class  SortArrayOfInt {
    public static void main(String[] args) {
        int[] nos={1,7,3,11,24,9};
        // sorting data array {1,3,7,9,11,24}
        System.out.println("Array elements after sorting:");
//sorting logic
        for (int i = 0; i < nos.length; i++)
        {
            for (int j = i + 1; j < nos.length; j++)
            {
                int tmp = 0;
                if (nos[i] > nos[j])
                {
                    tmp = nos[i];
                    nos[i] = nos[j];
                    nos[j] = tmp;
                }
            }
//prints the sorted element of the array
            System.out.println(nos[i]);
        }
    }
}

