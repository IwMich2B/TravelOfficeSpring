package com.example.demo;

import com.example.demo.model.Address;
import com.example.demo.model.Customer;
import com.example.demo.model.MyDate;
import com.example.demo.model.Trip;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnMsgFromPrimaryService() throws Exception {
        this.mockMvc.perform(get("/travel"))
                .andExpect(status().isOk());
    }

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Test
    public void shouldCreateCustomer() throws Exception {
        Customer createdCustomer = createCustomer();

    }

    private Customer createCustomer() throws Exception {
        Customer customer = new Customer();
        customer.setName("Igor");
        customer.setAddress(new Address("Pulawski", "22-300", "Warszawa"));
        customer.setTrip(new Trip(new MyDate(2015, 5, 13), new MyDate(2015, 8, 10), "London", 4050.34));

        String postValue = OBJECT_MAPPER.writeValueAsString(customer);
        MvcResult storyResult = mockMvc.perform(MockMvcRequestBuilders
                .post("/customer")
                .contentType(MediaType.APPLICATION_JSON)
                .content(postValue))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();
        return OBJECT_MAPPER.readValue(storyResult.getResponse().getContentAsString(), Customer.class);


    }

}

