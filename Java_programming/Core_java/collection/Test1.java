package p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import p1.Product;

class IdComplarable implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Product p1 = (Product) o1;
		Product p2 = (Product) o2;
		return p1.getId() - p2.getId();
	}
	
}

class NameComplarable implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product p1 = (Product) o1;
		Product p2 = (Product) o2;
		
//		String s1 = p1.getName();
//		String s2 = p2.getName();
//		return s1.compareTo(s2);
		
		return p1.getName().compareTo(p2.getName());
	}
	
}

public class Test1{
	public static void main(String[] args) {
		ArrayList <Product> a1 =new ArrayList <Product>();
		Product p1 = new Product(104,"parle-g");
		Product p2 = new Product(101,"good day");
		Product p3 = new Product(103,"happy");
		Product p4 = new Product(102,"monnaco");
		
		a1.add(p1);
		a1.add(p2);
		a1.add(p3);
		a1.add(p4);
		
		System.out.println("Before"+a1);
		
//		IdComplarable c1 = new IdComplarable();
//		Collections.sort(a1,c1);
//		System.out.println("After"+a1);
		
		NameComplarable nc = new NameComplarable();
		Collections.sort(a1,nc);
		System.out.println("After"+a1);
		
	}
}