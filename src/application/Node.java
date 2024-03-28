package application;

public class Node {
	private String seat_number;
	private String branch;
	private String average;

	Node next;

	public Node(String seat_number, String branch, String average) {
		this.seat_number = seat_number;
		this.branch = branch;
		this.average=average;

	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAverage() {
		return average;
	}

	public void setAverage(String average2) {
		this.average = average2;
	}

	String getSeat_number() {
		return seat_number;
	}

	public void setSeat_number(String seat_number2) {
		this.seat_number = seat_number2;
	}

	@Override
	public String toString() {
		return " [ seat_number=" + getSeat_number() + "branch=" + getBranch() + "average =" + getAverage() + "]";
	}

}
