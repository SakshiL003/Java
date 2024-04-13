package April2;

class BOI implements Plan1{

	@Override
	public void getRoi(double rate) {
		// TODO Auto-generated method stub
		
		System.out.println("The Rate of Intreset for BOI :"+rate+"%");
	}
	
}
class SBI implements Plan1{

	@Override
	public void getRoi(double rate) {
		// TODO Auto-generated method stub
		
		System.out.println("The Rate of Intreset for SBI :"+rate+"%");
	}
	
	
}

class BOB implements Plan1{

	@Override
	public void getRoi(double rate) {
		// TODO Auto-generated method stub
		
		System.out.println("The Rate of Intreset for BOB :"+rate+"%");
	}
	
	
}

	
		
public class PlanResult {
	public static void main(String[] args) {
	BOI b1=new BOI();
	
	b1.getRoi(8.2);
	
	SBI s1=new SBI();
	
	s1.getRoi(7.2);
	
	BOB b2=new BOB();
	
	b2.getRoi(6.2);

}
	
}

