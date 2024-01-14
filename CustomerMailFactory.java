public class CustomerMailFactory {
    public static Customer createCustomer(String customer){
        if(customer.equals("Regular")){
            return new RegularCustomer();
        }else if(customer.equals("Delinquent")){
            return new DelinquentCustomer();
        }else if(customer.equals("Mountain")){
            return new MountainCustomer();
        }else{
            return null;
        }
    }
    
}
