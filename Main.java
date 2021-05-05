public class Main {

    public static void main(String[] args) {
        Customer customer1=new Customer();
        customer1.setFirstName("Sümeyye");
        customer1.setLastName("Özkýlýç");
        customer1.setDateOfBirth(2001);
        
        Customer customer2=new Customer();
        customer2.setFirstName("Engin");
        customer2.setLastName("Demiroð");
        customer2.setDateOfBirth(1985);
        
        BaseCustomerManager baseCustomerManager=new NeroCustomerManager();
        baseCustomerManager.save(customer1);
        baseCustomerManager.save(customer2);
        
        BaseCustomerManager starbucksCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
        starbucksCustomerManager.save(customer1);
        starbucksCustomerManager.save(customer2);

    }
}
