import java.util.ArrayList;

//class Test {
//
//	public static void main(String[] args) {
//		ArrayList a1 = new ArrayList();
//		a1.add(10);
//		a1.add(30);
//		a1.add(20);
//		a1.add("mrunmayee");
//		a1.add("mansi");
//		a1.add("aboli");
//		System.out.println(a1);  //[10, 30, 20] tostring is present it handle the [,  , ,]
//		
//		for(int i=0;i<a1.size();i++) {
//			System.out.println(a1.get(i));
//			String str = (String) a1.get(i);  //here we use downcasting
//			System.out.println(str.charAt(i));
//		}
//	}
//
//}

class Test {

	public static void main(String[] args) {
		ArrayList <String> a1 = new <String> ArrayList();
		
		a1.add("mrunmayee");
		a1.add("mansi");
		a1.add("aboli");
//		a1.add(10);   //for this line error occured when we enter inter
		System.out.println(a1);  //[10, 30, 20] tostring is present it handle the [,  , ,]
		
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
			String str = (String) a1.get(i);  //here we use downcasting
			System.out.println(str.charAt(i));
		}
	}

}
