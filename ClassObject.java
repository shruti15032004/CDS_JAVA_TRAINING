import java.util.Scanner;

public class ClassObject {
    public static void main(String[] args) {
        //call the class and init the obj
        Student student =new  Student ();
        student.setStudentname("Shruti Shrma");
        student.setEnrollTecnology("java");
        System.out.println(student.getStudentname()+ student.getEnrollTecnology());

    }
}

class Student {
    public String getEnrollTecnology() {
        return enrollTecnology;
    }

    public void setEnrollTecnology(String enrollTecnology) {
        this.enrollTecnology = enrollTecnology;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    String studentname;
    String enrollTecnology;
}

