package set;
import java.util.Iterator;
import java.util.TreeSet;

public class SolutionThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<>();
		set.add("Ankur");
		set.add("jay");
		set.add("prince");
        	set.add("zishan");
        
        	System.out.println("Original tree set:" + set);  
        	Iterator itr = set.descendingIterator();
        	System.out.println("Elements in Reverse Order:");
        	while (itr.hasNext()) {
       			System.out.println(itr.next());
        	}
		
		Iterator<String> itr1 = set.iterator();
		String query = "Sahil";
		boolean result = false;
		
		while (itr1.hasNext()) {
			if (itr1.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");
	}

}
