package course.polymorphism.rateofInterests;

public class AxisBank extends Bank {

	
	static float rate=9;

	//default constructor
	public AxisBank() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	// constructor with parameters
	@SuppressWarnings("static-access")
	public AxisBank(int principle, float rate, int time) {
		super(principle, rate, time);
	      super.setRate(this.rate); 
		// TODO Auto-generated constructor stub
	}
	
	// method to calculate rate of interest
	public float getRateofInterest(){
	    
		  return rate;
		}

	
}
