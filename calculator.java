
import java.util.*;
public class calculator
{
    public static double add(double f1,double f2){
        return f1+f2;
    }
    public static double sub(double f1,double f2){
        return f1-f2;
    }
    public static double mul(double f1, double f2){
        return f1*f2;
    }
    public static double div(double f1,double f2){
        return f1/f2;
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the two numbers");
		
		double input1=s.nextDouble();
		double input2=s.nextDouble();
		
		System.out.println("Enter the operator");
		char op=s.next().charAt(0);
		double output;
		switch(op){
		    case '+':
		        output=add(input1,input2);
		        break;
		        
		  case '-':
		      output=sub(input1,input2);
		      break;
		      case '*':
		          output=mul(input1,input2);
		          break;
		          case '/':
		              output=div(input1,input2);
		              break;
		              default:
		              System.out.println("Error");
		              return;
		}
		System.out.println(output);
	}
}
