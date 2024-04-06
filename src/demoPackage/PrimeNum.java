package demoPackage;


public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPrime(6));
	}
	
	public static boolean checkPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i*i<=num;i++) {
			if(num%i==0)
				return false;
			
		}
		return true;
	}
}



