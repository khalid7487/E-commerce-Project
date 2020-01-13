
package display;

import dao.ListDao;
import entity.Product;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author KHALID
 */
@ManagedBean
@SessionScoped
public class DisplayProductMB2 {
    Product product=new Product();
    private String param;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
    
    public List<Product> getAllProductByCatName(){
        System.out.println("check:"+param);
        List<Product> plist=new ListDao().allProductListbyCatName(param);
        System.out.println(plist);
        return plist;
        
        
    }
}
