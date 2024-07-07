package string;

public class StrExam {

	public static void main(String[] args) {
		String s="Sanchita";
		String t="bhunia";
		s.concat("bhunia");
		System.out.println(s);
		System.out.println(s.concat(" bhunia"));
		System.out.println(s.concat(t));
		System.out.println(s.charAt(4));
		System.out.println(s.substring(2));
		System.out.println(s.substring(2,4));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.trim());
		String s1="hello world";
		System.out.println(s1.replace("world", "hello"));
		String p="sanchita";
		
	}

}
