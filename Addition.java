import java.util.Scanner;
public class Addition{

public static void main(String[] args){
int num1,num2,mul;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number da goyala");
num1=sc.nextInt();
System.out.println("Enter the second number da mayiru");
num2=sc.nextInt();
sc.close();
mul=num1*num2;
System.out.println("sum of two numbers is:"+mul);
}
}