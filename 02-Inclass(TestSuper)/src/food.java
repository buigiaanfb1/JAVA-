
public class food extends Product{
	public String expired;
	public String dateProduct;
	public food(String id, String name, String expired, String dateProduct) {
		super(id, name);
		// TODO Auto-generated constructor stub
		this.expired = expired;
		this.dateProduct = dateProduct;
	}
	public String getExpired() {
		return expired;
	}
	public void setExpired(String expired) {
		this.expired = expired;
	}
	public String getDateProduct() {
		return dateProduct;
	}
	public void setDateProduct(String dateProduct) {
		this.dateProduct = dateProduct;
	}
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println(name + "|" + id + "|" + expired + "|" + dateProduct);
	}
	
	
	
}
