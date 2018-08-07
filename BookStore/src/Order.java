import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private int id;
	private double totalPrice;
	private double discountPrice;
	private double netPrice;
	private List<OrderItem> items = new ArrayList<>();
	private Date orderDate;

	protected Order(){
		
	}
	public void addItem(OrderItem item) {
		this.items.add(item);
	}
	public List<OrderItem> getOrderItem(){
		return items;
	}
	public double caculateTotalPrice() {
		for (OrderItem item : items) {
			totalPrice += (item.getQuantity() * item.getBook().getPrice());
		}
		return totalPrice;
	}

}
