import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display extends JPanel{

  // The JPanel class, where everything is added to the JFrame, and the calculator method is called

  public Display(){


    JLabel expression = new JLabel("Enter Expression:");
    JTextField firstnumber = new JTextField(3);
    JLabel uncertop = new JLabel("±");
    JLabel uncertop2 = new JLabel("±");
    JTextField firstuncert = new JTextField(3);
    JLabel blank = new JLabel("  ");
    JLabel blank2 = new JLabel("  ");
    JTextField operator = new JTextField(1);
    JTextField secondnumber = new JTextField(3);
    JTextField seconduncert = new JTextField(3);
    JLabel numberanswer = new JLabel("The answer is: ");
    JButton calc = new JButton("Calculate");

    add(expression);
    add(firstnumber);
    add(uncertop2);
    add(firstuncert);
    add(blank);
    add(operator);
    add(blank2);
    add(secondnumber);
    add(uncertop);
    add(seconduncert);
    add(calc);// JButton
    add(numberanswer);


    calc.addActionListener(new ActionListener(){ //Class actiated when the button is pushed
      @Override
      public void actionPerformed(ActionEvent e){

        String firstnumberz;
        String firstuncertz;
        String operatorz;
        String secondnumberz;
        String seconduncertz;
        firstnumberz = firstnumber.getText();
        firstuncertz = firstuncert.getText();
        operatorz = operator.getText();
        secondnumberz = secondnumber.getText();
        seconduncertz = seconduncert.getText();
        Uncertainty uncertainty = new Uncertainty();

       numberanswer.setText("the answer is "+uncertainty.calculator(firstnumberz, firstuncertz, operatorz, secondnumberz, seconduncertz));
       ;
        validate();
      }//action performed
          });//action listener

        }//Display

  }//class
