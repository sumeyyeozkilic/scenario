public class Main {

    public static void main(String[] args) {
        Customer customer1=new Customer();
        customer1.setFirstName("S�meyye");
        customer1.setLastName("�zk�l��");
        customer1.setDateOfBirth(2001);
        
        Customer customer2=new Customer();
        customer2.setFirstName("Engin");
        customer2.setLastName("Demiro�");
        customer2.setDateOfBirth(1985);
        
        BaseCustomerManager baseCustomerManager=new NeroCustomerManager();
        baseCustomerManager.save(customer1);
        baseCustomerManager.save(customer2);
        
        BaseCustomerManager starbucksCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
        starbucksCustomerManager.save(customer1);
        starbucksCustomerManager.save(customer2);

    }
}
