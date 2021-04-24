package sE2;

public class BagTest {
	public static void main(String[] args) {
		BagInterface<String> colorBag = new ArrayBag();
		System.out.println("Initial bag size: "+ colorBag.getCurrentSize());
		System.out.println("Check before adding objects isEmpty(): "+colorBag.isEmpty());
		System.out.println("Add 3 objects");
		colorBag.add("phone");
		colorBag.add("laptop");
		colorBag.add("pen");
		System.out.println("After adding objects isEmpty(): "+colorBag.isEmpty());
		System.out.println("Current bag size: "+colorBag.getCurrentSize());
		System.out.println("Remove 1 existing object");
		colorBag.remove();
		System.out.println("Updated bag size: "+colorBag.getCurrentSize());
		System.out.println("Current frequency of phone: "+colorBag.getFrequencyOf("phone"));
		System.out.println("Add 1 occurrence of phone");
		colorBag.add("phone");
		System.out.println("Updated frequency of phone: "+colorBag.getFrequencyOf("phone"));
		System.out.println("Check whether bag contains laptop: " + colorBag.contains("laptop"));
		System.out.println("Remove the occurrence of laptop");
		colorBag.remove("laptop");
		System.out.println("Now check whether bag still contains laptop: "+colorBag.contains("laptop"));
		System.out.println("Remove all entries from the bag");
		colorBag.clear();
		System.out.println("Final bag size: "+colorBag.getCurrentSize());
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		BagInterface<String> numberBag = new ArrayBag(10);
		System.out.println("Initial bag size: "+ numberBag.getCurrentSize());
		System.out.println("Check before adding objects isEmpty(): "+numberBag.isEmpty());
		System.out.println("Add 3 objects");
		numberBag.add("1");
		numberBag.add("2");
		numberBag.add("3");
		System.out.println("After adding objects isEmpty(): "+numberBag.isEmpty());
		System.out.println("Current bag size: "+numberBag.getCurrentSize());
		System.out.println("Remove 1 existing object");
		numberBag.remove();
		System.out.println("Updated bag size: "+numberBag.getCurrentSize());
		System.out.println("Current frequency of 1: "+numberBag.getFrequencyOf("1"));
		System.out.println("Add 1 occurrence of 1");
		numberBag.add("1");
		System.out.println("Updated frequency of 1: "+numberBag.getFrequencyOf("1"));
		System.out.println("Check whether bag contains 2: " + numberBag.contains("2"));
		System.out.println("Remove the occurrence of 2");
		numberBag.remove("2");
		System.out.println("Now check whether bag still contains 2: "+numberBag.contains("2"));
		System.out.println("Remove all entries from the bag");
		numberBag.clear();
		System.out.println("Final bag size: "+numberBag.getCurrentSize());
	}
}
