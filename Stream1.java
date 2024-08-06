import java.util.*;
import java.util.stream.*;
class Stream1
{
	public static void main(String ar[])
	{
	//before stream if we want to filter some element based on condition
//(Example :- if we want to filter out only even no.)
ArrayList<Integer> al=new ArrayList<>();
al.add(1);
al.add(2);
al.add(3);
al.add(4);
al.add(5);
/*
for(Integer i:al)
{
	if(i%2==0) System.out.println(i);
} */
//after stream api 
List<Integer> i1=al.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println(i1);
	
	}
}