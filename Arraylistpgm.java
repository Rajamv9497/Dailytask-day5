/*1.Given two arrayslist. retrieve the odd position elements form first input and even position elemetns from second list.
put it into the new arraylist at the same positions from where they are retrieved from.
(consider 0th position as even position, and two lists are of same size)
input1:{12,1,32,3}
input2:{0,12,2,23}
output:{0,1,2,3}*/


import java.io.*;
import java.lang.*;
import java.util.*;
 
class Arraylistpgm
{
  public static void main(String args[])
   {
      int n;
      ArrayList<Integer> al1=new ArrayList<Integer>();
      ArrayList<Integer> al2=new ArrayList<Integer>();
      ArrayList<Integer> al3=new ArrayList<Integer>();
      Scanner sc =new Scanner(System.in);
      System.out.println("enter the size of the arraylists");
      n=sc.nextInt();
      System.out.println("enter the elements of the arraylist1");
      for(int i=0;i<n;i++)
       {
        int j=sc.nextInt();
        al1.add(j);
        }
      System.out.println("enter the size of the arraylist2");
       for(int i=0;i<n;i++)
       {
        int j=sc.nextInt();
        al2.add(j);
       }
       for(int i=0;i<n;i++)
       {
         if(i%2==0)
            al3.add(al2.get(i));
         else
            al3.add(al1.get(i));
       }
      Iterator itr=al3.iterator();
      while(itr.hasNext())
      {
         System.out.println(itr.next());
       }   
      
      }

  }