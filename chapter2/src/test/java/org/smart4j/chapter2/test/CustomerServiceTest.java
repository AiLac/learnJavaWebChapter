package org.smart4j.chapter2.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.service.CustomerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ai
 * @Classname CustomerServiceTest
 * @Description 单元测试
 * @Date 2020/8/29 23:34
 */
public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest() {
        customerService = new CustomerService();
    }

    @Before
    public void init() {
        //TODO 初始化数据库
    }

    @Test
    public void getCustomerListTest() throws Exception {
        List<Customer> customerList = customerService.getCustomerList("");
        Assert.assertEquals(2, customerList.size());
    }

    @Test
    public void createCustomerTest() throws Exception {
        Map<String, Object> fileMap = new HashMap<String, Object>();
        fileMap.put("name", "customer100");
        fileMap.put("contact", "John");
        fileMap.put("telephone", "12512345678");
        boolean result = customerService.createCustomer(fileMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest() throws Exception {
        long id = 1;
        Map<String, Object> fileMap = new HashMap<String, Object>();
        fileMap.put("contact", "Eric");
        boolean result = customerService.updateCustomer(id, fileMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() throws Exception {
        long id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }
}
