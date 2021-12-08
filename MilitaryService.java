package workspace;

public class MilitaryService implements NationalService {
	
	private int daysLeft;
	
	public MilitaryService(int days) {
		this.daysLeft=days;
	}
	
	public int getDaysLeft() {
		return this.daysLeft;
	}
	
	public void work() {
		if(this.daysLeft>0) {
			this.daysLeft--;
		}
	}
}
