import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String s = in.nextLine();
	    int sum = 0;
	    for (int i = 0;i < s.length();i++){
	        Boolean qw = Character.isDigit(s.charAt(i));
	        if (qw){
	            int n = Integer.parseInt(String.valueOf(s.charAt(i)));
	            sum += n;
	        }
	    }
		System.out.println(sum);
	}
}
