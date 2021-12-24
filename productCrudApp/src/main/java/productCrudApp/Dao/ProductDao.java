package productCrudApp.Dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import productCrudApp.model.Product;

@Repository
public class ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//save Product in database
	@Transactional
	public void create(Product product){
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	//Load all Product of database
	@Transactional
	public List<Product> allProduct(){
		List<Product> loadAll = this.hibernateTemplate.loadAll(Product.class);
		return loadAll;
	}
	
	//Delete Single Product
	@Transactional
	public void deleteProduct(int pid){
		Product p=this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(p);
	}
	
	//Get Single Product
	public Product getProduct(int pid){
		Product p = this.hibernateTemplate.get(Product.class, pid);
		return p;
		
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	

}
