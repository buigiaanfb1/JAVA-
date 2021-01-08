
public class CountTheNumberThread extends Thread{
	private int count = 0;
	private boolean isStop = false;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (!isStop) {
			count++;
			if (count > 100) {
				count = 0;
			}
		}
	}
	
	public void end() {
		isStop = true;
	}
	
	public int getCount() {
		return count;
	}
}
