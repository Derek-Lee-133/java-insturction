
public abstract class Animal implements Countable {
	private int count;
	
	@Override
	public void incrementCount() {
		count++;
	}
	@Override
	public void resetCount() {
		count = 0;
	}
	@Override
	public int getCount() {
		return count;
	}
	
	
	
	
	

}
