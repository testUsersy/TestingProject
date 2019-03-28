
public class RentalCountDTO {

	private int  lastWeek;
	
	private int yeartodate;

	public int getLastWeek() {
		return lastWeek;
	}

	public void setLastWeek(int lastweek) {
		this.lastWeek = lastweek;
	}

	public int getYeartodate() {
		return yeartodate;
	}

	public void setYeartodate(int yeartodate) {
		this.yeartodate = yeartodate;
	}

	@Override
	public String toString() {
		return "RentalCountDTO [lastWeek=" + lastWeek + ", yeartodate=" + yeartodate + "]";
	}
	
	
}
