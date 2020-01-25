import java.net.*;
import java.io.*;
import java.util.*;

public class DNS 
{
 public static void main(String[] args) 
 {
  int n;
  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try 
    {
     System.out.println("Enter Host Name or IP Address: ");
     String hname=in.readLine();
     InetAddress address= InetAddress.getByName(hname);
     System.out.println("Host Name: " + address.getHostName());
     System.out.println("IP: " + address.getHostAddress());
    } 
    catch(IOException ioe) 
    {
     ioe.printStackTrace();
    }
 }
}

