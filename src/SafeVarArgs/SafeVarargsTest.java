package SafeVarArgs;
import java.util.ArrayList;
import java.util.List;

public class SafeVarargsTest {
	
	public static void main(String[] args) {
		List<String> nameList1=new ArrayList<>();
		nameList1.add("kk");
		nameList1.add("pk");
		nameList1.add("sk");
		
		List<String> nameList2=new ArrayList<>();
		nameList2.add("mk");
		nameList2.add("Tk");
		
		SafeVarargsTest safeVarargsTest=new SafeVarargsTest();
		safeVarargsTest.loopingThrough(nameList2);
		
		System.out.println("...........................");
		safeVarargsTest.loopingThrough(nameList1,nameList2);
	}

	@SafeVarargs
	private void loopingThrough(List<String>...nameList) { 
     		for(List<String> list:nameList)
     		{
     			System.out.println(list);
     		}
	}
}


