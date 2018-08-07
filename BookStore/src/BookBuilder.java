
public class BookBuilder {

	private Book book = new Book();
	public BookBuilder setName(String name) {
		book.setName(name);
		return this;
	}
	public BookBuilder setPrice(double price) {
		book.setPrice(price);
		return this;
	}
	public Book build() {
		return book;
	}

}
