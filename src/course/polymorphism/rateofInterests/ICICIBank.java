package course.polymorphism.rateofInterests;

public class ICICIBank extends Bank {

	
	static float rate=8;
	
	ICICIBank(){
		
	}
	 // constructor with parameters
	@SuppressWarnings("static-access")
	public ICICIBank(int principle, float rate, int time) {
		super(principle, rate, time);
		super.setRate(this.rate);
		// TODO Auto-generated constructor stub
	}
	
	//method to calculate rate of interest
	public float getRateofInterest(){
	    
		  return rate;
		}


}
