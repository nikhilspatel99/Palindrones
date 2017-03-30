/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NikhilPatel
 */
public class Palindrones {
    boolean m=true;
    String n1;
    int counter=0;
    
    public int Palindrones(int start,int stop)
    {
        while (start<=stop)
        {
            m=true;
            n1= Integer.toString(start);
            for(int i=0; i<n1.length();i++)
            {
                if(n1.charAt(i)!=n1.charAt(n1.length()-i-1))
                {
                    m=false;
                    i=n1.length();
                }//end if
                counter++;
            }//end for
            start++;

        }//end while
        return counter;
    }
    
    public int PalindronesO(int start,int stop)
    {
        int counter=0;
        while (start<=stop)
        {
            m=true;
            n1= Integer.toString(start);
            for(int i=0; i<(n1.length()/2);i++)
            {
                if(n1.charAt(i)!=n1.charAt(n1.length()-i-1))
                {
                    m=false;
                    i=n1.length();
                }//end if
                counter++;
            }//end for
            start++;

        }//end while
        return counter;
    }
    
    public String PalindronesSO(int start, int stop)
    {
      ;
    
        while(start<=stop){

            StringBuilder num= new StringBuilder();
            num.append(start);
            String num1= num.toString();
            StringBuilder rnum2=num.reverse();
            String num2= rnum2.toString();
            if(num1.equals(num2))
            {
                System.out.println(num);
            }
            start++;
        }
        return "";
    }
}

