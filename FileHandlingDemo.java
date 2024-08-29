import javax.swing.plaf.synth.SynthGraphicsUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo {
    public static void main(String[] args) {
        //file handling work file - create, write,read, update,delete
            Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the  file name : -");
            String filename=scanner.nextLine();
            File file =new File(filename +".txt");
                //To check the file is already create or not
        try {
            if (file.createNewFile()) {
                System.out.println("file is created ");
            } else {
                System.out.println(" File is already exists");


            }
            if (file.exists()) {
                //Write the Data in Your File
                FileWriter writer = new FileWriter("filename" + ".txt",true);
                //1file ko write karne ka kaam karta hai aur
                //2. aur agar file exists nhi karti toh nwe file create kar deta hai
                System.out.println("Write the msg in your file");
                String message = scanner.nextLine();
                //to write the msg in your file
                writer.write(message);
                writer.close();

            } else {
                System.out.println("file not found");
            }

            //read the file using scanner
            Scanner reader = new Scanner(file);
            String data ="";
            while (reader.hasNextLine()) {

               data = reader.nextLine();

            }
            System.out.println(data);
            System.out.println("Enter Your Update message");
            String  update= scanner.nextLine();
            FileWriter updatewriter=new FileWriter(file,true);
            updatewriter.append(" "+update+" ");
            updatewriter.close();
            //to search
            System.out.println("What  You WANT TO search");
            String search= scanner.nextLine();
            if(data.contains(search)){
                System.out.println("found");
            }
            else {
                System.out.println("Not Found");
            }

  }

 catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}
