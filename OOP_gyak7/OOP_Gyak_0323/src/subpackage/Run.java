package subpackage;
import myproducts.Bread;
import myproducts.Product;

public class Run {

	public static void main(String[] args) {
		Product Aru = new Product();
		Bread Kenyer = new Bread();
		
		Aru.setDatas("Coconaut ", 300, 10);
		Kenyer.setDatasFour("Bekecsi ", 500, 20, 0.75);
		
		System.out.println(Aru.toString());
		System.out.println(Kenyer.toString());
		System.out.println(Aru.compareBetweenBruttos(Kenyer));
		
		Bread Kenyer2 = new Bread();
		Kenyer2.setDatasFour("Tallyai ", 400, 15, 1.0);
		Product Aru2 = Kenyer2;
		
		System.out.println(Aru2.toString());
		
		Bread Kenyer3 = new Bread();
		Kenyer3.setDatasFour("Prugyi ", 600, 30, 1.5);
		
		System.out.println(Bread.compareBetweenTwoBreads(Kenyer3, (Bread) Aru2));
	}
	
}
