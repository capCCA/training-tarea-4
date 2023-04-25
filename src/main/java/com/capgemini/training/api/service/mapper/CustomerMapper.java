package com.capgemini.training.api.service.mapper;

import com.capgemini.training.api.model.CustomerDetails;
import com.capgemini.training.api.model.UpdateCustomerRequest;
import com.capgemini.training.api.repository.model.CustomerEntity;

public final class CustomerMapper {

  private CustomerMapper() {
    throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
  }

  public static CustomerEntity updateEntityFromRequest(CustomerDetails customerDetails){
    CustomerEntity customerEntity = new CustomerEntity();
    customerEntity.setCustomerId(customerDetails.getCustomerId());
    customerEntity.setDocumentType(customerDetails.getDocumentType());
    customerEntity.setDocumentNumber(customerDetails.getDocumentNumber());
    customerEntity.setName(customerDetails.getName());
    customerEntity.setSurname(customerDetails.getSurName());
    customerEntity.setLastname(customerDetails.getLastName());
    customerEntity.setCountry(customerDetails.getCountry());
    customerEntity.setTelephone(Integer.valueOf(customerDetails.getTelephone()));
    return customerEntity;
  }

  public static CustomerEntity updateEntityFromRequest(CustomerEntity entity, UpdateCustomerRequest customerDetails){
    entity.setDocumentType(customerDetails.getDocumentType());
    entity.setDocumentNumber(customerDetails.getDocumentNumber());
    entity.setName(customerDetails.getName());
    entity.setSurname(customerDetails.getSurName());
    entity.setLastname(customerDetails.getLastName());
    entity.setCountry(customerDetails.getCountry());
    entity.setTelephone(Integer.valueOf(customerDetails.getTelephone()));
    return entity;
  }

  public static CustomerDetails toCustomerDetails(CustomerEntity customer) {
    CustomerDetails customerDetails = new CustomerDetails();
    customerDetails.setCustomerId(customer.getCustomerId());
    customerDetails.setDocumentType(customer.getDocumentType());
    customerDetails.setDocumentNumber(customer.getDocumentNumber());
    customerDetails.setName(customer.getName());
    customerDetails.setSurName(customer.getSurname());
    customerDetails.setLastName(customer.getLastname());
    customerDetails.setCountry(customer.getCountry());
    customerDetails.setTelephone(customer.getTelephone().toString());
    return customerDetails;
  }


}
