package servlets;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Validations.CartValidation;
import Validations.CategoryValidation;
import dao.CartDAO;
import impl.CartDAOImpl;
import model.Cart;

@WebServlet(urlPatterns="/ViewSingleProduct")
public class AddtoCart extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
	
	int qty = Integer.parseInt(req.getParameter("qty"));
	String email = req.getParameter("email");
	
	
	Cart k = new Cart();
	
	k.setQty(qty);
	k.setEmail(email);
	
	CartDAO kdao = new CartDAOImpl();
	
	kdao.insert(k);
	
	resp.sendRedirect( "/" + getServletContext().getServletContextName() + "/ViewCart.jsp");
	  
}
	}

