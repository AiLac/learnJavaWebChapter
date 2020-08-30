package org.smart4j.chapter2.service;

import org.smart4j.chapter2.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * @author Ai
 * @Classname CustomerService
 * @Description 提供客户数据服务
 * @Date 2020/8/29 23:27
 */
public class CustomerService {

    /**
     * 获取客户列表
     * @param keyword
     * @return
     */
    public List<Customer> getCustomerList(String keyword) {
        //TODO
        return null;
    }

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustomer(long id) {
        //TODO
        return null;
    }

    /**
     * 新增客户
     * @param fileMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fileMap) {
        //TODO
        return false;
    }

    /**
     * 更新客户
     * @param id
     * @param fileMap
     * @return
     */
    public boolean updateCustomer(long id, Map<String, Object> fileMap) {
        //TODO
        return false;
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id) {
        //TODO
        return false;
    }
}
