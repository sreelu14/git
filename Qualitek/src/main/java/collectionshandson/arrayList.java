package collectionshandson;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;

public class arrayList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList listtoprint= new ArrayList ();
		listtoprint.add("a");
		listtoprint.add("b");
		listtoprint.add("C");
		listtoprint.add("sreelu");
		System.out.println(listtoprint);
		System.out.println(listtoprint.size());
		listtoprint.remove(1);
		System.out.println("after removing"+listtoprint);
		listtoprint.set(0, "c");
		System.out.println("after changing"+listtoprint);
		listtoprint.add(1,"e");
		System.out.println("after adding a new element"+listtoprint);
		/*Iterator it =  listtoprint.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}*/
		ArrayList listtocopy= new ArrayList ();
		listtocopy.addAll(listtoprint);
		System.out.println("copied list"+listtocopy);
		Collections.sort(listtocopy);
		System.out.println("sorted list"+listtocopy);
		Collections.shuffle(listtocopy);
		System.out.println("shuffled list"+listtocopy);
		System.out.println(listtocopy.contains("e"));

}
}
