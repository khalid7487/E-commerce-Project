
package addhandler;

import dao.AddDao;
import entity.Category;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CategoryMB {
    Category category=new Category();

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    public String addCategory(){
        category.setCatName(category.getCatName());
        category.setCatDesc(category.getCatDesc());
        new AddDao().addCategory(category);
        return null;
    }
}
