public class BookStore {
	public static void main(String[] args) {
		Book firstBook = new BookBuilder()
				.setName("Harry Potter volume.1")
				.setPrice(8)
				.build();
		
		Book secondBook = new BookBuilder()
				.setName("Harry Potter volume.2")
				.setPrice(10)
				.build();
		
		OrderItem item = new OrderItemBuilder()
				.setQuantity(2)
				.setBook(firstBook)
				.build();
		
		OrderItem item2 = new OrderItemBuilder()
				.setQuantity(5)
				.setBook(secondBook)
				.build();
		
		Order order = new OrderBuilder()
				.addItem(item)
				.addItem(item2)
				.build();
		
		System.out.println("      Name              Unit     Price");
		for(OrderItem orderItem : order.getOrderItem()) {
			System.out.println(String.format("%s    %d      %6.2f"
					,orderItem.getBook().getName()
					,orderItem.getQuantity()
					,orderItem.getBook().getPrice()
					));
		}
		System.out.println("======================================");
		System.out.println(String.format("Total  %.2f Baht",+order.caculateTotalPrice()));
	}
}
