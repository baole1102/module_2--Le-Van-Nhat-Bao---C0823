package util;

import model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDB {
    public static List<Customer> getAll(){
        String sql = "SELECT * FROM text.customer";
        List<Customer> list = new ArrayList<Customer>();
        Connection connection = null;
        connection = Util.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String number = rs.getString("number");
                String address = rs.getString("address");
                Customer customer = new Customer();
                customer.setId(id);
                customer.setName(name);
                customer.setNumber(number);
                customer.setAddress(address);
                list.add(customer);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
