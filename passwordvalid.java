/*2.validate a password
i) there should be atleast one digit
ii) there should be atleast one of '#','@' or '$' .
iii)the password should be of 6 to 20 characters
iv) there should be more uppercase letter than lower case.
v) should start with an upper case and end with lower case*/

import java.io.*;
import java.lang.*;
import java.util.*;
 
class passwordvalid
{
  public static void main(String args[])
   {
     String s;
     System.out.println("enter the password");
     Scanner sc=new Scanner(System.in);
     s=sc.next();
     char ch[]=s.toCharArray();
     int len=ch.length;
     int spl=0,up=0,low=0,flag=0,str=0,dig=0;
     for(int i=0;i<len;i++)
     {
      if(ch[i]==35||ch[i]==36|| ch[i]==64)
            spl++;
      if(ch[i]>=65&&ch[i]<=90)
            up++; 
      if(ch[i]>=97&&ch[i]<=122)
            low++;
       if(ch[i]>=97&&ch[i]<=122)
            dig++;
     }
     if((ch[0]>=65&&ch[0]<=97)&&(ch[len-1]>=97&&ch[len-1]<=122))
            flag++;
     if((len>=6&&len<=20)&&(up>low)&&(spl>=1)&&(dig>=1))
            str++;
     
     if((flag==1)&&(str==1))
           System.out.println("Valid");
     else
           System.out.println("Invalid");          
   }
}