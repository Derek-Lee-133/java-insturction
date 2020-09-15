
public class ins_switch {

	public static void main(String[] args) {
		String productCode = "hgf";
		String productDescription;
		
		if (productCode.equals("hm01"))
		{
			productDescription = "Hammer";
		
		}
		else if (productCode.equals("bn01")) {
				productDescription = "Box of Nails";
		}
		else {
			productDescription = "Product not found";
		}
	System.out.println("productDescription via if/elsse:  "+ productDescription);
	
	switch (productCode) {
	case "bn01":
		productDescription = "Box or nails";
		break;
	case "hm01":
		productDescription = "Hammer";
	default:
		productDescription = "Product not found";
	
	}
	
	System.out.println("product description via switch:" + productDescription);
	}

}
