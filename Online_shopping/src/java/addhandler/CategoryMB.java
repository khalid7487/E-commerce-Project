
package addhandler;

import dao.AddDao;
import dao.ListDao;
import entity.Category;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class CategoryMB {
    Category category=new Category();
    private List<Category> allcat=new ArrayList<>();

    public List<Category> getAllcat() {
        allcat=new ListDao().catListAll();
        return allcat;
    }

    public void setAllcat(List<Category> allcat) {
        this.allcat = allcat;
    }
    
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    public String addCategory(){
        category.setCatName(category.getCatName());
        category.setCatDesc(category.getCatDesc());
        boolean status=new AddDao().addCategory(category);
        if(status){
            FacesContext.getCurrentInstance().addMessage( null,new 
     FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved", ""));
        }else{
            FacesContext.getCurrentInstance().addMessage( null,new 
     FacesMessage(FacesMessage.SEVERITY_WARN, "Data not Saved", ""));
        }
            
        return null;
    }
}
