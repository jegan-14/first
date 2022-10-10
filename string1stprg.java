package exp7;
import java.util.Scanner;
public class string1stprg
{
    public static void main(String[] args)
    {
        String str;
        int i,count=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        str=sc.nextLine();
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' '||str.charAt(i)=='.'||str.charAt(i)==','||str.charAt(i)==';'||str.charAt(i)=='?'||str.charAt(i)=='!'||str.charAt(i)=='-')
                count++;

        }
        System.out.println("Word count is "+count);
    }
}
