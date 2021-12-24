package productCrudApp;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productCrudApp.Dao.ProductDao;
import productCrudApp.model.Product;

@Controller
public class MainController {
	
	@Autowired
	private ProductDao productDao;
	
	//Method for Home page
	@RequestMapping(path="/home", method= RequestMethod.GET)
	public String home(Model m){
		System.out.println("This is Home Controller of Product CRUD App!");
		List<Product> allProduct = productDao.allProduct();
		m.addAttribute("products", allProduct);
		return "index";
	}
	
	//Method to add Product
	@RequestMapping(path="/addProduct")
	public String addProduct(Model m){
		m.addAttribute("title", "Product Add");
		return "add_product_form";
	}
	
	//Handle Product Method
	@RequestMapping(path="/handleProduct",method=RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest req){
		System.out.println("This is Product handler CRUD App!"+product.toString());
		productDao.create(product);
		
		RedirectView redirectView = new RedirectView();
		String s = req.getContextPath()+"/home";
		redirectView.setUrl(s);
		return redirectView;
	}
	
	//Method for Delete
	@RequestMapping(path="/deleteProduct/{id}", method= RequestMethod.GET)
	public RedirectView deleteProduct(@PathVariable("id") int pid,HttpServletRequest req){
		productDao.deleteProduct(pid);
		
		RedirectView redirectView = new RedirectView();
		String s = req.getContextPath()+"/home";
		redirectView.setUrl(s);
		return redirectView;
	}
	
	////Method for Update
	@RequestMapping(path="/updateProduct/{productId}", method= RequestMethod.GET)
	public String deleteProduct(@PathVariable("productId") int pid, Model m){
		Product product = this.productDao.getProduct(pid);
		m.addAttribute("p", product);
		return "update_product_form";
	}

}
