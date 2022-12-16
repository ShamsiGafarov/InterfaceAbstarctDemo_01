package Entities;

import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;

import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws Exception {

        BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
        baseCustomerManager.Save(new Customer(123,"Ahmet", "Koc",new SimpleDateFormat("06/08/2005"),"123123"));

    }
}
