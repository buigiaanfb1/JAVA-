package data;

public class DayInWeek {
	Day d;

	DayInWeek(Day d) {
		this.d = d;
	}

	public void wahet() {
			switch (d) {
			case MONDAY: System.out.println("Boring");
						break;
			case TUESDAY: System.out.println("Boring");
				 break;
			case WEDNESDAY: System.out.println("Boring");
				break;
			case FRIDAY: System.out.println("Boring");
				break;
			case THURSDAY: System.out.println("Boring");
				break;
			case SATURDAY: System.out.println("Boring");
				break;
			case SUNDAY: System.out.println("Boring");
				break;
			}
		}
}

}
