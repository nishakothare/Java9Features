package CollectionFactory;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class CollectionFactoryMethodsTest {

		public static void main(String[] args) {
			List<String>list=List.of("kk", "pk", "sk", "mk");
			list.forEach(System.out::println);
			System.out.println("............");
			
			Set<String>set=Set.of("kk", "pk", "sk", "mk");
			set.forEach(System.out::println);
			System.out.println("............");
			
			Map<Integer,String> empIdMap1=Map.of(1234,"kk", 7878,"pk");
			empIdMap1.forEach((key,value)->System.out.println(key+"\t"+value));
			System.out.println(".............");
			
			Map.Entry<Integer, String> entry1=Map.entry(1212, "kkk");
			Map.Entry<Integer, String> entry2=Map.entry(1213, "jjj");
			Map.Entry<Integer, String> entry3=Map.entry(1214, "jjj");
			Map.Entry<Integer, String> entry4=Map.entry(1215, "sss");
			Map<Integer,String> empIdMap2=Map.ofEntries(entry1,entry2,entry3,entry4);
			
			empIdMap2.forEach((key,value)->System.out.println(key+"\t"+value));

		}
	}


