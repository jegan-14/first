package expno2;
import java.util.Scanner;
public class EB 
{
    public static void main(String[] args){
    EBdetail obj=new EBdetail();
    obj.getdata();
    obj.calc();
    obj.display();
    }
}
class EBdetail
{
    int consumer_no,unit;
    String consumer_name;
    int prev_read;
    int cur_read;
    String type;
    double price;
    void getdata()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter consumer no:");
      consumer_no=sc.nextInt();
      System.out.println("Enter consumer name:");
      consumer_name=sc.next();
      System.out.println("Enter previous month reading:");
      prev_read=sc.nextInt();
      System.out.println("Enter current month reading:");
      cur_read=sc.nextInt();
      System.out.println("Enter type domestic or commrecial:");
      type=sc.next();
    }
    void calc()
    {
        unit=cur_read-prev_read;
        switch(type)
        {
            case "domestic":
                if(unit<=100)
                
                    price=1*unit;
                
                else if(unit>100 && unit<=200)
                    
                        price=(100+2.5*(unit-100));
                        
                else if(unit>200 && unit<=500)
                
                    price=(100+2.5*100+4*(unit-200));
                
                else
                
                    price=(1*100+2.5*100+4*300+6*(unit-500));
                
            case "commercial":
                if(unit<=100)
                    price=2*unit;
                else if(unit>100 && unit<=200)
                    price=200+4.5*(unit-100);
                else if(unit>200 && unit<=500)
                    price=200+4.5*100+6*(unit-200);
                else
                    price=200+4.5*100+6*300+7*(unit-500);
            }
            
    }
    void display()
    {
        System.out.println("Consumer no:"+consumer_no+"\nConsumer name:"+consumer_name+"\nPrevious month reading:"+prev_read+"\nCurrent month reading:"+cur_read+"\nType:"+type+"\nUnit:"+unit+"\nPrice:"+price);
    }
}
