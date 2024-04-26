package string;

public class StringDemo {
	
	public static void main(String[] args) {
		String name="computer";
		String x="computer";
		System.out.println(name);
		System.out.println(x.concat(name));
		System.out.println(x==name);
		System.out.println(x.charAt(0));
		String s1="hello";
		String s2="mello";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.startsWith("he"));
		String str= new String("welcome");
		String str1= new String("welcome");
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		StringBuilder str2=new StringBuilder("Hello");
		str2.append("world");
		str2.insert(5, " ");
		str2.replace(0, 5, "HELLO");
		System.out.println(str2);
		StringBuffer str3=new StringBuffer("hello");
		System.out.println(str3.capacity());
		System.out.println(str3.indexOf("e"));
		System.out.println(str3.substring(0,3));
	}

}
