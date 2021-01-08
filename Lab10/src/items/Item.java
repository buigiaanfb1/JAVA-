package items;

public class Item {
	private String code;
	private String name;
	private int price;
	public Item(String code, String name, int price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
	public void print() {
		System.out.println("----------------------");
		System.out.format("|%-20s|%-20s|%-6d\n", code, name, price);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
