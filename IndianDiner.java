
public class IndianDiner {

	public static void main(String[] args) {
		IndianCook cook = new IndianCook();
		IndianWaitress waitress = new IndianWaitress();
		Customer customer = new Customer(waitress);
		customer.createOrder(new EggCurry_Biryani_GarlicNaan (cook));
		customer.hungry();
		System.out.println("Your Indian food order is ready!");
	}

}
