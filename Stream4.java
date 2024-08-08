import java.util.*;
import java.util.stream.*;
//public abstract java.util.stream.Stream<T> sorted();
//Stream sorted()//we use to Sort values or String on basis of natural sorting 
class Stream4
{
	public static void main(String ar[])
	{
	
//(Example :-we want to sort values in a collection 
ArrayList<Integer> al=new ArrayList<>();
al.add(100);
al.add(2);
al.add(32);
al.add(41);
al.add(500);
List<Integer> al2=al.stream().sorted().collect(Collectors.toList());
System.out.println(al2);

	}
}