import java.util.Scanner; 

public class pravoagolnik {
public static void main(String[] args) {
	double str1, str2, povrsina, perimetar;

Scanner tastatura = new Scanner(System.in);
System.out.println("Programata presmetuva povrsina i plostina na pravoagolnik");

	System.out.println("Vnesete dolzina na edna strana");
	str1 = tastatura.nextDouble();
	System.out.println("Vnesete dolzina na druga strana");
	str2 = tastatura.nextDouble();
	
		povrsina = str1*str2;
		perimetar = 2*str1+2*str2;
		System.out.println();
			System.out.println("Perimetarot iznesuva:" + perimetar);
			System.out.println("Plostinata iznesuva:" + povrsina);
		
	



	}

}
