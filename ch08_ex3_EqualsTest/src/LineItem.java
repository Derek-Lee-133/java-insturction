import java.text.NumberFormat;

public class LineItem {

    private Product product;
    private int quantity;

    public LineItem() {
        this.product = new Product();
        this.quantity = 0;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        double total = quantity * product.getPrice();
        return total;
    }
    
    public String getTotalFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getTotal());
    }
    @Override
    public boolean equals(Object object) {
    	if (object instanceof LineItem) {
    		LineItem li = (LineItem) object;
    		if (product.equals(li.getProduct())  &&
    				quantity == li.getQuantity()) {
    			return true;
    		}
    	}
    	return false;
    }
}