package string;

public class StrDemo {

	public static void main(String[] args) {
		String name="Sagnik";
		String title="Ghosh";
		String a="mango";
		String b="mango";
		System.out.println(name.concat(title));
		System.out.println(name==title);
		System.out.println(a==b);
		System.out.println(name.equals(title));
		System.out.println(a.equals(b));
		String c="200";
		int i=Integer.parseInt(c);
		System.out.println(i+100);
		System.out.println(name+title);
		System.out.println(name.toUpperCase());
		char d=name.charAt(5);
		System.out.println(d);
		System.out.println(name.length());
		System.out.println(name.compareTo(title));
		System.out.println(name.substring(3,5));
		String e="       abc";
		System.out.println(e);
		System.out.println(e.trim());
		String f="hello world";
		System.out.println(f.replace("world", "sanchita"));
		StringBuilder sb=new StringBuilder("meow");
		sb.append(" hehehe");
		System.out.println(sb);
		
		String str1=new String("owl");
		String str2=new String("owl");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		StringBuffer sbf=new StringBuffer("who");
		System.out.println(sbf.capacity());
		System.out.println(sbf.indexOf("o"));
	}

}
