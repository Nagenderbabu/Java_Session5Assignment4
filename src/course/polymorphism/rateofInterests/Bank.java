package course.polymorphism.rateofInterests;

public class Bank {

	// declaring variables
	private int principle;
	private float rate=1;
	private int time;
	
	// default constructor
	Bank(){
		
	}


	//  constructor with parameters
	public Bank(int principle,float rate, int time) {
		super();
		this.principle = principle;
        this.rate=rate;
		this.time = time;
	}


	// setters and getters methods
	
	// to get principle value 
	public int getPrinciple() {
		return principle;
	}

    // to set principle variable
	public void setPrinciple(int principle) {
		this.principle = principle;
	}

	// to get rate value
	public float getRate() {
		return rate;
	}

	// to set rate variable
	public void setRate(float rate) {
		this.rate = rate;
	}

	// to get time value
	public int getTime() {
		return time;
	}

	// to set time variable
	public void setTime(int time) {
		this.time = time;
	}
	
	// method to calculate rate of interest
	public float getRateofInterest(){
	  return rate;
	}
	
	
}
