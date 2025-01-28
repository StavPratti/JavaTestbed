package gr.aueb.cf.ch15.interfaces;

import gr.aueb.cf.ch15.interfaces.model.Customer;

// Inversion of control
public class CustomerServiceImpl {
    private ICustomerDAO iCustomerDAO;

    public CustomerServiceImpl(ICustomerDAO iCustomerDAO) {
        this.iCustomerDAO = iCustomerDAO;
    }

    public void insertCustomer(Customer customer) throws Exception {
        try {
            if (iCustomerDAO.getCustomerByVat(customer.getVat()) != null) {
                throw new Exception("");
            }
            iCustomerDAO.addCustomer(customer);
        } catch (Exception e) {
            System.err.println("");
            throw e;
        }
    }
}
