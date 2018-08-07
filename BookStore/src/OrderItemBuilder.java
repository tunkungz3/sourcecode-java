
public class OrderItemBuilder {
	OrderItem orderItem = new OrderItem();

	public OrderItemBuilder setQuantity(int quantity) {
		orderItem.setQuantity(quantity);
		return this;
	}

	public OrderItemBuilder setBook(Book book) {
		orderItem.setBook(book);
		return this;
	}

	public OrderItem build() {
		return orderItem;
	}
}
