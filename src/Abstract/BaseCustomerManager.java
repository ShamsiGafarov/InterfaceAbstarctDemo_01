package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
    public void Save(Customer customer) throws Exception {
        System.out.println("Saved to db : " + customer.firstName);

    }

    @Override
    public void Delete(Customer customer) throws Exception {

    }
}
