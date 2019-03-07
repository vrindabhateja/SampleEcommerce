package com.mycompany.sampleecommerce.impl;

import com.mycompany.sampleecommerce.dao.CategoryDAO;
import com.mycompany.sampleecommerce.models.Category;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CategoryDAOImpl implements CategoryDAO{

    @Override
    public void insert(Category c) {
        try{
         
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomm", "root", "root");
            
            String query = "insert into category (name,description) values (?,?)";
            
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            pstmt.setString(1, c.getName());
            pstmt.setString(2, c.getDescription());
            
            pstmt.executeUpdate();
            
            System.out.println("Inserted");
            
        }
        catch( Exception e ){
            e.printStackTrace();
        }
    }
    
}
