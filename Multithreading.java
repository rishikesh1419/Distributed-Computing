import java.util.*;

class Ascending extends Thread {
 int a[]=new int[5];
 Ascending(int b[]){
   for(int i=0; i<5;i++) {
    a[i]=b[i];
   }
  
 }
 public void run() {
  int temp=0;

  System.out.println("Ascending Thread : ");
  
  for(int i=0; i<4;i++) {
    for(int j=0;j<4-i;j++){
      if(a[j]>a[j+1]){
        temp=a[j];
	a[j]=a[j+1];
	a[j+1]=temp;
      }
    }
  }
  for(int i=0; i<5;i++) {
   System.out.print(a[i]+" ");
  }
  System.out.print("\n");
 }
}
 
class Descending extends Thread {
 int a[]=new int[5];
 Descending(int b[]){
   for(int i=0; i<5;i++) {
    a[i]=b[i];
   }
  
 }
 public void run() {
  int temp=0;

  System.out.println("Descending Thread : ");
  
  for(int i=0; i<4;i++) {
    for(int j=0;j<4-i;j++){
      if(a[j]<a[j+1]){
        temp=a[j];
	a[j]=a[j+1];
	a[j+1]=temp;
      }
    }
  }
  for(int i=0; i<5;i++) {
   System.out.print(a[i]+" ");
  }
  System.out.print("\n");
 }
}
 
public class Multithreading {
 
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int a[]=new int[5];
  System.out.print("Enter 5 numbers: ");
  for(int i=0; i<5;i++) {
   a[i]=sc.nextInt();
  }
  new Ascending(a).start();
  new Descending(a).start();
 }
}

