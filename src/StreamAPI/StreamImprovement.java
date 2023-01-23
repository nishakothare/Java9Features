package StreamAPI;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamImprovement {
	
	public static void main(String[] args) {
		System.out.println("stream iterate");
		List<Integer> collect1=Stream.iterate(1,i->i+1).limit(10).collect(Collectors.toList());
		collect1.forEach(System.out::println);
		System.out.println(".............");
		List<Integer> collect2=Stream.iterate(1, i->i<=10,i->i+1).collect(Collectors.toList());
		collect2.forEach(System.out::println);
		
		System.out.println("Stream takewhile");
		List<Integer> collect3=Stream.of(12,4,80,5,67,8,9,0,90)
		.takeWhile(number->number%2==0).collect(Collectors.toList());
		collect3.forEach(System.out::println);
		
		System.out.println("Stream dropwhile");
		List<Integer> collect4=Stream.of(12,4,80,5,67,8,9,0,90)
	    .dropWhile(number->number%2==0).collect(Collectors.toList());
	    collect4.forEach(System.out::println);
	    
	    System.out.println("Stream.ofNullable()");
	    Stream<Integer> s1=Stream.ofNullable(67);
	    Stream<Integer> s2=Stream.ofNullable(null);
	    System.out.println(s1.count());
	    System.out.println(s2.count());
	}
}


