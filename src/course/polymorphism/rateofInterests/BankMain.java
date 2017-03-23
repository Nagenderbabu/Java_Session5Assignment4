package course.polymorphism.rateofInterests;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initializing state bank class
       Statebank sb=new Statebank();
    // initializing ICICI bank class
       ICICIBank ib=new ICICIBank();
    // initializing Axis bank class
       AxisBank ab=new AxisBank();
       
       //displays State bank details
       System.out.println("-------------------------State Bank Of India--------------------------------");
      // System.out.println(" Principle :"+sb.getPrinciple());
      // System.out.println(" Time(in years) :"+sb.getTime());
       System.out.println(" Rate of Interest : "+sb.getRateofInterest());
       
       //displays ICICI bank details
       System.out.println("----------------------------- ICICI Bank -----------------------------------");
      // System.out.println(" Principle :"+ib.getPrinciple());
      // System.out.println(" Rate(%) :"+ib.getRate());
      // System.out.println("Time(in years) :"+ib.getTime());
       System.out.println(" Rate of Interest :"+ib.getRateofInterest());
       
       // displays Axis bank details
       System.out.println("----------------------------- Axis Bank -----------------------------------");
      // System.out.println(" Principle :"+ab.getPrinciple());
      // System.out.println(" Rate(%) :"+ab.getRate());
      // System.out.println(" Time (in years):"+ab.getTime());
       System.out.println(" Rate of Interest :"+ab.getRateofInterest());
	
		
	}

}
