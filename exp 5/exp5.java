package students;
import YEAR_I.YearIMarks;
import YEAR_II.YearIIMarks;
import java.util.Scanner;
public class exp5
{
public static void main(String args[])
{
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter total Number of Student:");
    int n=scan.nextInt();
    int roll[]=new int[n];
    String name[]=new String[n];
    double m1[]=new double[n];
    double m2[]=new double[n];
    double m3[]=new double[n];
    double m4[]=new double[n];
    
    for(int i=0;i<=n;i++)
    {
    System.out.println("Enter Roll Number of Student:");
    roll[i]=scan.nextInt();
    System.out.println("Enter Name of Student:");
    name[i]=scan.next();
    System.out.println("Enter mark 1:");
    m1[i]=scan.nextDouble();
    System.out.println("Enter mark 2:");
    m2[i]=scan.nextDouble();
    System.out.println("Enter mark 3:");
    m3[i]=scan.nextDouble();
    System.out.println("Enter mark 4:");
    m4[i]=scan.nextDouble();
    YearIMarks obj1=new YearIMarks(m1[i],m2[i]);
    YearIIMarks obj2=new YearIIMarks(m3[i],m4[i]);
    System.out.println("NAME OF STUDENT IS "+name[i]);
    System.out.println("ROLL NUMBER OF STUDENT IS "+roll[i]);
    System.out.println("GRADE OF SUBJECT 1 OF STUDENT "+i+" IS "+obj1.Sub1(m1[i]));
    System.out.println("GRADE OF SUBJECT 2 OF STUDENT "+i+" IS "+obj1.Sub2(m2[i]));
    System.out.println("GRADE OF SUBJECT 3 OF STUDENT "+i+" IS "+obj2.Sub3(m3[i]));
    System.out.println("GRADE OF SUBJECT 4 OF STUDENT "+i+" IS "+obj2.Sub4(m4[i])); 
}
}
class student {
    int RollNo;
    String Name;
    student(int roll,String na)
    {
        RollNo=roll;
        Name=na;
    }
}
