public class ArrayDemo {

    public static void main(String[] args) {
        String[] friendName={"Abhi","shruti","kartik","shreya","abhishek",};


        friendName[3]="Rini";
        System.out.println("Length of Array : " +friendName.length);

        //System.out.println(friendName[3]);
      //  for (int i=0;i<=friendName.length; i++) {

           // System.out.println(friendName[i]);
            //System.out.println(" /n");
            //alternate of for loop is Foreachloop


            for (String name : friendName) {
                System.out.println("Names in the Array : "+name);
            }
        }
    }

