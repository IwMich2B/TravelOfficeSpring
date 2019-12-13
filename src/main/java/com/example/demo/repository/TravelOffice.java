package com.example.demo.repository;


import com.example.demo.model.Address;
import com.example.demo.model.Customer;
import com.example.demo.model.MyDate;
import com.example.demo.model.Trip;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class TravelOffice {
    Customer customer1 = new Customer("Iza");
    Customer customer2 = new Customer("Agnieszka");
    Customer customer3 = new Customer("Wojtek");
    Customer customer4 = new Customer("Bartek");

    {
        customer1.setAddress(new Address("Poniatowskiego", "95-387", "Lódź"));
        customer2.setAddress(new Address("Piotrkowska", "95-300", "Lódź"));
        customer3.setAddress(new Address("Marzałkowska", "98-100", "Warszawa"));
        customer4.setAddress(new Address("Tolkiena", "95-387", "Kraków"));

    }

    {
        customer1.setTrip(new Trip(new MyDate(2015, 5, 13), new MyDate(2015, 8, 10), "London", 4050.34));
        customer4.setTrip(new Trip(new MyDate(2015, 5, 13), new MyDate(2015, 8, 10), "London", 4050.34));
        customer2.setTrip(new Trip(new MyDate(2015, 5, 13), new MyDate(2015, 8, 10), "Kraków", 600.50));
        customer3.setTrip(new Trip(new MyDate(2015, 5, 13), new MyDate(2015, 8, 10), "Kraków", 600.50));
    }

    Map<Long, Customer> customerMap = new HashMap<>();


    {
        customerMap.put(1L, customer1);
        customerMap.put(2l, customer2);
        customerMap.put(3L, customer3);
        customerMap.put(4l, customer4);
    }

    public Map<Long, Customer> getAllCustomer() {
        return customerMap;
    }

    public void addCustomer(Customer customer) {
        customerMap.put((long) customerMap.size(), customer);
    }
}







