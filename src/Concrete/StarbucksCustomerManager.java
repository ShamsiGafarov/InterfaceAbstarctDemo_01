package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager {
    private ICustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        _customerCheckService = customerCheckService;
    }


    @Override
    public void Delete(Customer customer) throws Exception {
        super.Delete(customer);
    }

    @Override
    public void Save(Customer customer) throws Exception {
        if (_customerCheckService.CheckIfRealPerson(customer)) {
            super.Save(customer);
        } else {
            throw new Exception("Not a valid person");
        }

    }
}
