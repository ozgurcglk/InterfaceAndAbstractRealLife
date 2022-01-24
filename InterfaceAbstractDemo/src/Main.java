import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Özgür Berke", "Çaðlak", 2000,"232323");
		
		BaseCustomerManager customerManager1 = new NeroCustomerManager();
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager1.save(customer1);
		customerManager2.save(customer1);
		
	}

}
