

public class Student extends User {
	
	private String couponCode;
	
	public Student() {
		
	}

	public Student(String couponCode) {
		super();
		this.couponCode = couponCode;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

}
