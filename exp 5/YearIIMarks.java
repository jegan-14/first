package YEAR_II;
public class YearIIMarks {
    public double sub3mark, sub4mark;
    public YearIIMarks(double a,double b)
    {
        sub3mark=a;
        sub4mark=b;          
    }
    public String Sub3(double m1)
    {
        if(m1>=50)
            return "PASS";
        else
            return "FAIL";
    }
    public String Sub4(double m1)
    {
        if(m1>=50)
            return "PASS";
        else
            return "FAIL";
    }
}
