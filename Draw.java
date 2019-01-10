import java.awt.*;
import java.util.*;
import javax.swing.*;

// A class to make the initial JFrame

public class Draw extends JFrame{

  private static final int WIDTH = 400;
  private static final int HEIGHT = 400;
  public static void main(String []args) {

  JFrame frame = new JFrame("Kais Uncertainty Calculator");
  frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  frame.setVisible(true);
  frame.setSize(500,500);
  frame.add(new Display()); //Calls the display class
  frame.setVisible(true);

      }
}
