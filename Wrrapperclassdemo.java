import java.util.HashMap;

public class Wrrapperclassdemo {
    public static void main(String[] args) {
        HashMap<String,Integer>myfriends =new HashMap<>();
        myfriends.put("anshu",20);
        myfriends.put("shreya",17);
        myfriends.put("shruti",20);
        System.out.println(myfriends);
        for (String name : myfriends.keySet()){
            System.out.println(name);
        }
    }
}
