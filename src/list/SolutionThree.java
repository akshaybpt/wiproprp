package list;

import java.util.*;

public class SolutionThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> list = new Vector<>();
		
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	
		
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) 
			System.out.println(itr.next());
	}

}
