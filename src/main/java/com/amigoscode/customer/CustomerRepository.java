package com.amigoscode.customer;

import java.util.List;

public class CustomerRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {
        //TODO connect to real db
        return List.of(
                new Customer(1L, "TODO - implement real DB", "todo")
        );
    }
}
