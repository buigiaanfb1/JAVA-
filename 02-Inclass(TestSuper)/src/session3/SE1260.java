package session3;

public class SE1260 extends Student{
	private float m_PRF192;
	private float m_PRO192;
	

	public SE1260(String code, String name, String birthday, int age, float m_PRF192, float m_PRO192) {
		super(code, name, birthday, age);
		this.m_PRF192 = m_PRF192;
		this.m_PRO192 = m_PRO192;
	}


	public float getM_PRF192() {
		return m_PRF192;
	}


	public void setM_PRF192(float m_PRF192) {
		this.m_PRF192 = m_PRF192;
	}


	public float getM_PRO192() {
		return m_PRO192;
	}


	public void setM_PRO192(float m_PRO192) {
		this.m_PRO192 = m_PRO192;
	}
	
	public void printMark() {
		System.out.println("Marks of PRF192: " + m_PRF192);
		System.out.println("Marks of PR0192: " + m_PRO192);
	}
	
}


