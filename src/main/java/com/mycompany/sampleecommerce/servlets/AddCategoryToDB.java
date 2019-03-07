package com.mycompany.sampleecommerce.servlets;

import com.mycompany.sampleecommerce.dao.CategoryDAO;
import com.mycompany.sampleecommerce.impl.CategoryDAOImpl;
import com.mycompany.sampleecommerce.models.Category;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/AddCategoryToDB")
public class AddCategoryToDB extends HttpServlet{
    
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("post");

        String name = req.getParameter("name");
        String description = req.getParameter("description");
    
        System.out.printf("name: %s, description: %s",name,description);
        
        Category c = new Category(name, description);
        
        CategoryDAO cdao = new CategoryDAOImpl();
        
        cdao.insert(c);
        
    }
    
}
