package com.SpringCrud.SpringAngular.Service;

import com.SpringCrud.SpringAngular.CustomerRepo.CustomerRepo;
import com.SpringCrud.SpringAngular.DTO.CustomerDTO;
import com.SpringCrud.SpringAngular.DTO.CustomerSaveDTO;
import com.SpringCrud.SpringAngular.DTO.CustomerUpdateDTO;
import com.SpringCrud.SpringAngular.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceIMPL implements CustomerService{

    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO) {
        Customer customer = new Customer(
                customerSaveDTO.getCustomername(),
                customerSaveDTO.getCustomeraddress(),
                customerSaveDTO.getMobile()
        );
        customerRepo.save(customer);
        return customer.getCustomername();

    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
        List<Customer>getCustomers=customerRepo.findAll();
        List<CustomerDTO>customerDTOList = new ArrayList<>();
        for(Customer a:getCustomers)
        {
            CustomerDTO customerDTO= new CustomerDTO(
                    a.getCutomerid(),
                    a.getCustomername(),
                    a.getCustomeraddress(),
                    a.getMobile()
            );
            customerDTOList.add(customerDTO);
        }
        return customerDTOList;
    }

    @Override
    public String updateCustomers(CustomerUpdateDTO customerUpdateDTO)
    {
        if(customerRepo.existsById(customerUpdateDTO.getCutomerid()))
        {
            Customer customer = customerRepo.getById(customerUpdateDTO.getCutomerid());

            customer.setCustomername(customerUpdateDTO.getCustomername());
            customer.setCustomeraddress(customerUpdateDTO.getCustomeraddress());
            customer.setMobile(customerUpdateDTO.getMobile());
            customerRepo.save(customer);
        }
        else
        {
            System.out.println("Customer Id is not found! ");
        }
            return null;
    }

    @Override
    public boolean deleteCustomer(int id) {
        if (customerRepo.existsById(id))
        {
            customerRepo.deleteById(id);
        }
        else
        {
            System.out.println("Customer Id does not exist!");
        }
        return true;
    }
}
