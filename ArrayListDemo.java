import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        //add your 5 friends name
        ArrayList<String> namelist = new ArrayList<>();

        //to add five friends name into array list
        namelist.add("Anshu");
        namelist.add("Invan");
        namelist.add("kunal");
        namelist.add("rahul");
        namelist.add("mudit");
        namelist.add("Anshu");
        for (String name : namelist) {
            System.out.println(name);
        }
        System.out.println(namelist.get(4));
        Collections.sort(namelist);
        System.out.println(namelist);
        // reverse the arraylist element


        for (int  i =0; i < namelist.size() ; i++) {
            for(int j=i+1; j<namelist.size();j++){
                if ( namelist.get(i).equals (namelist.get(j))){
                    System.out.println(" duplicate value" + namelist.get(i));
                }
            }



            System.out.println(namelist.get(i));
        }
    }}

