public class ExceptionHandlingDemo {
    public static void main(String[] args) {
//        try{
//
//
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//
//           try{
//               int i = Integer.parseInt(name);
//                System.out.println(i);
//           }
           // datatype conversion error//error name = number format error
        //comparison between null and empty string
//        String fullname =null;
//            String fname="";
//            if (fullname== fname){
//                System.out.println("equal");
//            }
//            else {
//                System.out.println(" not equal");
//            }

            //problem staement3

        String name = "Shruti sharma";
        try{
        int b= 100/0;
            System.out.println(b);

        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        int[] arr={1,3,5,7};
        String clgname=null;

            try {


                System.out.println(arr[4]);

                int i = Integer.parseInt(name);
                System.out.println(i);

                System.out.println(clgname.length());//null pointer Exception
                //ArrayIndexOutBoundException
            }

            catch(ArrayIndexOutOfBoundsException  ex){
                System.out.println(ex);
            }

            catch(NullPointerException e) {
                System.out.println(e);
            }
            //problem 4
            catch(Exception e){
                System.out.println(e);
            }

            }

    }



