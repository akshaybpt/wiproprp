package set;

import java.util.*;

public class HashSetDemo {
    HashSet<String> set = new HashSet<>(); 
    
    public static void main(String[] args) {
        HashSetDemo demo = new HashSetDemo();
        
        demo.addCountry("United States");
        demo.addCountry("Canada");
        demo.addCountry("Mexico");
        demo.addCountry("United States"); 
        
        System.out.println(demo.findCountry("Canada"));
        System.out.println(demo.findCountry("Brazil"));
        
        demo.printAllCountries();
    }
    
    public boolean addCountry(String countryName) {
        return set.add(countryName);
    }
    
    public String findCountry(String countryName) {
        if (set.contains(countryName)) {
            return countryName;
        } else {
            return "Country Not Found";
        }
    }
    
    public void printAllCountries() {
        System.out.println("Using Enumeration:");
        Enumeration<String> e = Collections.enumeration(set);
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        
        System.out.println("Using Iterator:");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        
        System.out.println("Using ListIterator:");
        ListIterator<String> li = new ArrayList<>(set).listIterator(set.size());
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
