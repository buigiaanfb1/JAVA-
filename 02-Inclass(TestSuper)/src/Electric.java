
public class Electric extends Product{
	public String guarantee;
	public int voltage;
	public int power;
	
	public Electric(String guarantee, int voltage, int power, String id, String name) {
		super(id, name);
		this.guarantee = guarantee;
		this.voltage = voltage;
		this.power = power;
	}

	public String getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println(name + "|" + id + "|" + power + "|" + voltage + "|" + guarantee);
	}
	
	
	
}
