package prs.business;

public class LineItem {

	private int id;
	private int requestId;
	private int productId;
	private int quantity;
	
	public LineItem() {
		this(0,0,0,0);
	}
	public LineItem(int id, int requestId, int productId, int quantity) {
		super();
		this.id = id;
		this.requestId = requestId;
		this.productId = productId;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "LineItem [id=" + id + ", requestId=" + requestId + ", productId=" + productId + ", quantity=" + quantity
				+ "]";
	}
	
	
}
