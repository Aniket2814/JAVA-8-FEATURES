import java.util.*;
import java.util.stream.*;
//Long count()
//Stream count()//we use count() used to count no. of Object
class Stream3
{
	public static void main(String ar[])
	{
	
//(Example :-we want to count no.of object in a collection 
ArrayList<Integer> al=new ArrayList<>();
al.add(1);
al.add(2);
al.add(3);
al.add(4);
al.add(5);
Long i1=al.stream().count();
System.out.println(i1);

	}
}