public class StarbucksCustomerManager extends BaseCustomerManager{
    CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService){
        this.customerCheckService=customerCheckService;
    }

    public void save(Customer customer){
        if(customerCheckService.checkIfRealPerson(customer)){
            super.save(customer);
        }else{
            System.out.println("Invalid person");
        }
    }

}
