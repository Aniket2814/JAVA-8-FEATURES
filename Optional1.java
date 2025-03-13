import java.util.*;
class Optional1
{
public static void main(String ar[])
{
Optional<String> name=getName(1);
if(name.isPresent())
{
	System.out.println(name.get());
}
// ifPresent//ka paramteer hota Hai consumer type ka 

name.ifPresent(x->System.out.println(x));
// System.out.println(name);

}
public static Optional<String> getName(int id)
{
	// getting Name from db
	String name="ram";
return Optional.of(name);
}
}