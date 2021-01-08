
public class AccessModifiers {
	public static void main(String[] args) {
		Advanced ad = new Advanced();
		ad.showMoney();
		ad.ShowWives();
	}
}

interface Boss {
	void showMoney();
	void ShowWives();
}

interface Company {
	void ShowMoney();
}

class People implements Boss, Company{

	@Override
	public void showMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ShowWives() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ShowMoney() {
		// TODO Auto-generated method stub
		
	}
	
		 
	 
}
class Normal {
	public void showMoney() {
		System.out.println("Ok con bò");
	}
}

class Advanced extends Normal implements Boss{

	@Override
	public void ShowWives() {
		// TODO Auto-generated method stub
		System.out.println("Ok Con de");
	}

	@Override
	public void showMoney() {
		// TODO Auto-generated method stub
		super.showMoney();
		System.out.println("Ok con heo");
	}
	
	
	
	
	
}
