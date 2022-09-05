package expno3;
import java.util.Scanner;
public class inheritance
{
    public static void main(String[] args)
    {
        System.out.println("-----------STUDENT-----------");
        Student obj=new Student("Jeganath","Madurai","JAVA",2022,80000);
        System.out.println(obj.getName());
        System.out.println(obj.getAddress());
        System.out.println(obj.getProgram());
        String pro1;
        System.out.println("Enter the program to be changed:");
        Scanner scan=new Scanner(System.in);
        pro1=scan.next();
        obj.setProgram(pro1);
        System.out.println(obj.getYear());
        int yr;
        System.out.println("Enter the year to be changed:");
        yr=scan.nextInt();
        obj.setYear(yr);
        System.out.println(obj.getFee());
        System.out.println("Enter the fees to be changed:");
        double fees;
        fees=scan.nextDouble();
        obj.setFee(fees);
        System.out.println(obj.toString());
        System.out.println("-----------STAFF-----------");
        Staff obj1=new Staff("Sankar","OOTY","Chemistry",100000);
        System.out.println(obj1.getName());
        System.out.println(obj1.getAddress());
        System.out.println(obj1.getSchool());
        String scl;
        System.out.println("Enter the school to be changed:");
        scl=scan.next();
        obj1.setSchool(scl);
        System.out.println(obj1.getPay());
        System.out.println("Enter the pay to be changed:");
        double p=scan.nextDouble();
        obj1.setPay(p);
        System.out.println(obj1.toString());
    }    
}
class person
{
    String name;
    String address;
    person(String n,String add)
    {
        name=n;
        address=add;
    }
    String getName()
    {
        return name;
    }
    String getAddress()
    {
        return address;
    }
    void setAddress(String add)
    {
        address=add;
        System.out.println("Address:"+address);
    }
    @Override
    public String toString()
    {
        return "Name="+name+" Address="+address;
    }   
}
class Student extends person
{
    String program;
    int year;
    double fee;
    Student(String na,String ad,String pro,int yr,double fees)
    {
        super(na,ad);
        program=pro;
        year=yr;
        fee=fees;
    }
    String getProgram()
    {
        return program;
    }
    void setProgram(String prog)
    {
        program=prog;
        System.out.println("Program:"+program);
    }
    int getYear()
    {
        return year;
    }
    void setYear(int yr)
    {
        year=yr;
        System.out.println("Year:"+year);
    }
    double getFee()
    {
        return fee;
    }
    void setFee(double f)
    {
        fee=f;
        System.out.println("Fees:"+fee);
    }
    @Override
    public String toString()
    {
     return "Name:"+name+" Address:"+address+" Program:"+program+" Year:"+year+" Fees:"+fee; 
    }    
}
class Staff extends person
{
    String school;
    double pay;
    Staff(String n1,String addr,String scl,double p)
    {
        super(n1,addr);
        school=scl;
        pay=p;
    }
    String getSchool()
    {
       return school;     
    }
    void setSchool(String sl)
    {
        school=sl;
        System.out.println("School:"+school);
    }
    double getPay()
    {
        return pay;
    }
    void setPay(Double pa)
    {
        pay=pa;
        System.out.println("Pay:"+pay);       
    }
    @Override
    public String toString()
    {
        return "Name:"+name+" Address:"+address+" School;"+school+" Pay:"+pay; 
    }
}
