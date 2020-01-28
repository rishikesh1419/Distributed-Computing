import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.net.MalformedURLException; 
import java.rmi.NotBoundException;
import java.util.Scanner;
 
public class CalculatorClient { 
 
    public static void main(String[] args) {
	int a,b;
	Scanner sc = new Scanner(System.in);
        try { 
            Calculator c = (Calculator)
                           Naming.lookup(
                 "rmi://localhost/CalculatorService"); 
	    System.out.println("Enter numbers A and B (A>B):");
	    System.out.print("A = ");
	    a = sc.nextInt();
	    System.out.print("B = ");
	    b = sc.nextInt();
	    System.out.println("Addition: " + c.add(a,b) );
            System.out.println("Subtraction: " + c.sub(a,b) );
            System.out.println("Multiplication: " + c.mul(a,b) );
            System.out.println("Division: " + c.div(a,b) );
        } 
        catch (MalformedURLException murle) { 
            System.out.println(); 
            System.out.println(
              "MalformedURLException"); 
            System.out.println(murle); 
        } 
        catch (RemoteException re) { 
            System.out.println(); 
            System.out.println(
                        "RemoteException"); 
            System.out.println(re); 
        } 
        catch (NotBoundException nbe) { 
            System.out.println(); 
            System.out.println(
                       "NotBoundException"); 
            System.out.println(nbe); 
        } 
        catch (
            java.lang.ArithmeticException
                                      ae) { 
            System.out.println(); 
            System.out.println(
             "java.lang.ArithmeticException"); 
            System.out.println(ae); 
        } 
    } 
}
