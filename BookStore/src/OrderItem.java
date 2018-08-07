
public class OrderItem {
	private Book book;
	private int quantity;

	protected OrderItem() {
		
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public void setBook(Book book) {
		this.book = book;	
	}
	public Book getBook() {
		return this.book;
	}
}

