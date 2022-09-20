/*
1. Write a Java program to create a Package “YEAR_I” which has a class YearIMarks (members 
–  sub1mark,  sub2mark).  Create  another  package  “YEAR_II”  which  has  a  class  YearIIMarks 
(members – sub3mark, sub4mark ). Create n objects of Student class (having rollNumber, name, 
YearIMarks  and  YearIIMarks).  Calculate  the  Grade  (‘Pass’  >  =50  else  ‘Fail’)  for  each  subject 
and display the result of the student in proper format.
*/
package YEAR_I;
public class YearIMarks {
    public double sub1mark,sub2mark;
    public YearIMarks(double a,double b)
    {
        sub1mark=a;
        sub2mark=b;          
    }
    public String Sub1(double m1)
    {
        if(m1>=50)
            return "PASS";
        else
            return "FAIL";
    }
    public String Sub2(double m1)
    {
        if(m1>=50)
            return "PASS";
        else
            return "FAIL";
    }
}
