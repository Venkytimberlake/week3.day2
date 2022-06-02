package week3.day2;

import java.util.LinkedHashSet;

public class Removeduplicates {

	
    void removeDuplicates(String str)
    {
        LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
        for(int i=0;i<str.length();i++)
            lhs.add(str.charAt(i));
          
       
        for(Character ch : lhs)
            System.out.print(ch);
    }
      
    
    public static void main(String args[])
    {
        String str = "We learn java basics as part of java sessions in java week1";
        Removeduplicates r = new Removeduplicates();
        r.removeDuplicates(str);
    }
}
