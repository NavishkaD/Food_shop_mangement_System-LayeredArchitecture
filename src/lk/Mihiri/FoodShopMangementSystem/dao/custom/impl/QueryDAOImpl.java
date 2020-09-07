/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.Mihiri.FoodShopMangementSystem.dao.custom.impl;

import lk.Mihiri.FoodShopMangementSystem.dao.custom.QueryDAO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sanu
 */
public class QueryDAOImpl implements QueryDAO{

    @Override
    public void getCustomersOrderDetails(String oid) throws ClassNotFoundException, SQLException {
        String sql = "select Orders.oid,Orders.date,Orders.customerID,OrderDetails.oid,OrderDetails.itemCode,OrderDetails.qty,OrderDetails.unitPrice from Orders inner join OrderDetails on Orders.oid=OrderDetails.oid where Orders.oid=?;";
        ResultSet rst = CrudUtil.executeQuery(oid, oid);
        while(rst.next()){
            String orderID = rst.getString(1);
            String orderDate = rst.getString(2);
            String customerID = rst.getString(3);
            String orderDID = rst.getString(4);
            String itemCode = rst.getString(5);
            int qty = rst.getInt(6);
            double unitPrice = rst.getDouble(7);
                       
        }
        
    }
}
