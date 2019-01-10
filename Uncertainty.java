import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Uncertainty{

  //returns the uncertainty in relative
  public static double torelative(double number, double uncertain){
    return ((uncertain / number) *100);
  }
  //returns the uncertainty in absolute
  public static double toabsolute(double number, double uncertain){
    return ((uncertain/100)*number);
  }
  //returns the sum of two numbers
  public static double basic(double first, double second){
      return(first + second);
  }
  public static double advanced(double first, double second){
      return 1.0;
  }



//The Calculation method used to either add, substract, multiply, or divide two numbers and return a respective uncertainty
//in absolute form.

public static String calculator(String firstnumber, String firstuncertain, String operator, String secondnumber, String seconduncertain){
  double result; // This is the result of the operator on the two numbers, (add, substract, multiply, or divide)


  switch(operator){
      case("+"):
      result = Double.parseDouble(firstnumber) + Double.parseDouble(secondnumber);
      //System.out.println("the final number is " + result +" ±"+basic(Double.parseDouble(firstuncertain),Double.parseDouble(seconduncertain)));
      return (String.valueOf(result)+ " ± " +String.valueOf(basic(Double.parseDouble(firstuncertain),Double.parseDouble(seconduncertain))));
        //returns the result of the operation, ± the two uncertainties added together

      case("-"):
      result = Double.parseDouble(firstnumber) - Double.parseDouble(secondnumber);
      //System.out.println("the final number is " + result +" ±"+basic(Double.parseDouble(firstuncertain),Double.parseDouble(seconduncertain)));
      return (String.valueOf(result) +" ± "+String.valueOf(basic(Double.parseDouble(firstuncertain),Double.parseDouble(seconduncertain))));
        //returns the result of the operation, ± the two uncertainties added together

      case("*"):
      result = Double.parseDouble(firstnumber) * Double.parseDouble(secondnumber);
      double uncertaintey = basic(torelative(Double.parseDouble(firstnumber), Double.parseDouble(firstuncertain)),torelative(Double.parseDouble(secondnumber), Double.parseDouble(seconduncertain)));
      //System.out.println("the final number is " + result +" ±"+ toabsolute(result, uncertaintey));
      return (String.valueOf(result) +" ± "+ String.valueOf((toabsolute(result, uncertaintey))));
        //returns the result of the operation, ± the two uncertainties added together, the uncertainties must first be converted to relative
        //(percentage) before being added together, hence the double "uncertaintey"

      case("/"):
      result = Double.parseDouble(firstnumber) / Double.parseDouble(secondnumber);
      double uncertaintey2 = basic(torelative(Double.parseDouble(firstnumber), Double.parseDouble(firstuncertain)),torelative(Double.parseDouble(secondnumber), Double.parseDouble(seconduncertain)));
      //System.out.println(String.valueOf(result) +" ±"+ String.valueOf(toabsolute(result, uncertaintey2)));
      return(String.valueOf(result) +" ± "+ String.valueOf(toabsolute(result, uncertaintey2)));
      //returns the result of the operation, ± the two uncertainties added together, the uncertainties must first be converted to relative
      //(percentage) before being added together, hence the double "uncertaintey2"


  }

  return "Expression not valid!";// if an improper operator is given as input


}



public static void main(String []args) {


//  An initial attempt of the calculator written without the GUI, to be used in the terminal

/*
  Scanner input = new Scanner(System.in);

  System.out.print("Enter the first number: ");
  String firstnumber = input.nextLine();

  System.out.print("Enter the Uncertainty of the first number in absolute: ");
  String firstuncertain = input.nextLine();

  System.out.print("Enter the operator: ");
  String operator = input.nextLine();

  System.out.print("Enter the second number: ");
  String secondnumber = input.nextLine();

  System.out.print("Enter the Uncertainty of the second number in absolute: ");
  String seconduncertain = input.nextLine();
  System.out.println();
  System.out.println("your expression is "+ firstnumber+ "±" +firstuncertain + " "+ operator +" " +secondnumber + "±" + seconduncertain);
  System.out.println();
  System.out.println("press enter to confirm");
  input.nextLine();



  double result;

  switch(operator){



      case("+"):
      result = Double.parseDouble(firstnumber) + Double.parseDouble(secondnumber);
      System.out.println("the final number is " + result +" ±"+basic(Double.parseDouble(firstuncertain),Double.parseDouble(seconduncertain)));
      break;

      case("-"):
      result = Double.parseDouble(firstnumber) - Double.parseDouble(secondnumber);
      System.out.println("the final number is " + result +" ±"+basic(Double.parseDouble(firstuncertain),Double.parseDouble(seconduncertain)));
      break;

      case("*"):
      result = Double.parseDouble(firstnumber) * Double.parseDouble(secondnumber);
      double uncertaintey = basic(torelative(Double.parseDouble(firstnumber), Double.parseDouble(firstuncertain)),torelative(Double.parseDouble(secondnumber), Double.parseDouble(seconduncertain)));
      System.out.println("the final number is " + result +" ±"+ toabsolute(result, uncertaintey));
      break;

      case("/"):
      result = Double.parseDouble(firstnumber) / Double.parseDouble(secondnumber);
      double uncertaintey2 = basic(torelative(Double.parseDouble(firstnumber), Double.parseDouble(firstuncertain)),torelative(Double.parseDouble(secondnumber), Double.parseDouble(seconduncertain)));
      System.out.println("the final number is " + result +" ±"+ toabsolute(result, uncertaintey2));
      break;


  }
*/
}//main




}//class
