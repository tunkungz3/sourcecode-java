
public class OrderBuilder {
	Order order = new Order();

	public OrderBuilder addItem(OrderItem item) {
		order.addItem(item);
		return this;
	}

	public Order build() {
		return order;
	}
}
