package accountBank;

public class InitAccount {

	public static void main(String[] args) {
		
		Account a1 = new Account("Bruna");
		Account a2 = new Account("Luan", 500);
		
		
		
//		// Init
		System.out.println("Init");
		System.out.println(a1);
		System.out.println(a2);
//		System.out.println("Inicio");
//		System.out.println(a1.getHolder() + " - $ " + a1.getBalance());
//		System.out.println(a2.getHolder() + " - $ " + a2.getBalance());
//		
//		// Luan tranfer 10 to Bruna
		System.out.println("Luan tranfer 100 to Bruna");
		a2.transfer(100, a1);
//		
		
		// Status after transfer
		System.out.println(a1);
		System.out.println(a2);
		
		// Luan won the lottery and deposited 20,000
		a2.deposit(20000);
		
		
		// Status after Luan deposited
		System.out.println(a1);
		System.out.println(a2);
		
//		System.out.println("Affter transfer");
//		System.out.println(a1.getHolder() + " - $ " + a1.getBalance());
//		System.out.println(a2.getHolder() + " - $ " + a2.getBalance());
//		
//		// Luan won the lottery and deposited 20,000
//		a2.deposit(20000);
//		System.out.println("Luan deposit ");
//		System.out.println(a2.getHolder() + " - $ " + a2.getBalance());
	}
}
