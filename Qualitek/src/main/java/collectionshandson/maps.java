package collectionshandson;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String>m = new Hashtable<>();
        m.put(100,"uday");
        m.put(101,"uday");
        m.put(102,"akshat");
        m.put(103,"sreelu1");
        m.putIfAbsent(104, "akshay");
        m.putIfAbsent(103, "sreelu");
        
        Set <Integer>id = m.keySet();
        Collection<String>value = m.values();
        for(Integer empid: id) {
        	//System.out.println(empid);
        	System.out.println(empid + m.get(empid));
        }
		/*
		 * for(String name: value) { System.out.println(name); }
		 */
        m.remove(104);
        System.out.println(m);
        System.out.println(m.containsKey(103));
        System.out.println(m.containsValue("sreelu1"));
        Set<Entry<Integer,String>> entries = m.entrySet();
        for(Entry<Integer,String>Keyval :entries) {
        	System.out.println(Keyval.getKey());
        	System.out.println(Keyval.getValue());
        }
       
	}
	

}
