import java.util.*;
import java.util.stream.*;

//Stream map(function)
class Stream2
{
	public static void main(String ar[])
	{
	//before stream if we want to map some element based on condition
//(Example :-we want a collection in which a new Object is double of old object)
ArrayList<Integer> al=new ArrayList<>();
al.add(1);
al.add(2);
al.add(3);
al.add(4);
al.add(5);
/*
for(Integer i:al)
{
 System.out.println(i*2);
} */
//after stream api 
List<Integer> i1=al.stream().map(i->i*2).collect(Collectors.toList());
System.out.println(i1);
	// https://github.com/Aniket2814/JAVA-8-FEATURES/blob/main/Stream1.java
	}
}