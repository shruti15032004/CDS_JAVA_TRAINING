import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JframeDemo {
    public static void main(String[] args) {
        System.out.println(" Jframe is used to build GUI Java applictaion");
        JFrame jFrame = new JFrame("BMI Calculator");
        // to get the  input  from user JTextField
        // to display any msg to user  JLable
        // to perform any action by clicking the button  Jbutton
        //--------------- lable---------- weight---------------
        JLabel userweightLable = new JLabel(" Enter Your in Kg : ");
        userweightLable.setBounds(40,40, 200, 40);
        //------------textfield-------------weight-----------
        JTextField userweightTextField= new JTextField(" ");
        userweightTextField.setBounds(240,40, 60, 40);
        //----- attaching with jframe-----------lable & textfield----
        jFrame.add(userweightLable);
        jFrame.add(userweightTextField);
        //--------------- lable---------- height---------------
        JLabel userheightLable = new JLabel(" Enter Your in  meter : ");
        userheightLable.setBounds(40,90, 200, 40);
        //------------textfield-------------height-----------
        JTextField userheightTextField= new JTextField(" ");
        userheightTextField.setBounds(240,90, 60, 40);
        //----- attaching with jframe-----------lable & textfield----
        jFrame.add(userheightLable);
        jFrame.add(userheightTextField);

        JButton calculateBMI = new JButton("calulate BMI ");
        calculateBMI.setBounds(200,150, 130,50);
        jFrame.add(calculateBMI);

        calculateBMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            float weight = Float.parseFloat(userweightTextField.getText().toString());
            float height = Float.parseFloat(userheightTextField.getText().toString());
            float bmivalue = weight/(height*height);

            calculateBMI.setText(String.valueOf(bmivalue));
            }
        });




        // logic BMI calculator user height  in meter and user weight kg

        jFrame.setLayout(null);// to use the default layout
        jFrame.setSize(400 ,300);// to add the size of frame
        jFrame.setVisible(true); //set  visible frame
    }
}
