
public class Ceramic extends Product{
	public String type;
	public String country;
	public Ceramic(String id, String name, String type, String country) {
		super(id, name);
		// TODO Auto-generated constructor stub
		this.type = type;
		this.country = country;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println(name + "|" + id + "|" + type + "|" + country);
	}
	
	

	
	
}
