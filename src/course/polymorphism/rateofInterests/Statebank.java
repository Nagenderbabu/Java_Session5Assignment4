package course.polymorphism.rateofInterests;

public class Statebank extends Bank {

	// declaring static variable and initialize to 7
static float rate=7;

// default constructor
Statebank(){
	
}
   // constructor with parameters
   @SuppressWarnings("static-access")
public Statebank(int principle,float rate,int time){
	   super(principle,rate,time);
	    super.setRate(this.rate);
}

// method to find rate of interest
public float getRateofInterest(){
   
  return rate ;
}



}

