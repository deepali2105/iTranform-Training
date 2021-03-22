package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collection2 {
   public static void main(String args[]) {
      LinkedHashSet<String> linkedHS = new LinkedHashSet();
      linkedHS.add("Apple");
      linkedHS.add("B");
      linkedHS.add("C");
      linkedHS.add("D");
      linkedHS.add("E");
      Iterator<String> iterator = linkedHS.iterator();
      while (iterator.hasNext()) {
         System.out.println(iterator.next());
      }
   }
}

