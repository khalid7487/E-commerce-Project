
package addhandler;

import dao.AddDao;
import dao.ListDao;
import entity.Category;
import entity.SubCategory;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

/**
 *
 * @author KHALID
 */
@ManagedBean
@SessionScoped
public class SubCategoryMB {
    SubCategory subcat=new SubCategory();
    Category category=new Category();

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    String catname;
    List<Category> listCat;

    public List<Category> getListCat() {
        return listCat;
    }

    public void setListCat(List<Category> listCat) {
        this.listCat = listCat;
    }
    public SubCategory getSubcat() {
        return subcat;
    }

    public void setSubcat(SubCategory subcat) {
        this.subcat = subcat;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }
     public String addSubCategory(){
        listCat=new ListDao().catListByName(catname);
        category.setCatId(listCat.get(0).getCatId());
        subcat.setCategory(category);
        subcat.setSubCatName(subcat.getSubCatName());
        subcat.setSubCatDesc(subcat.getSubCatDesc());
        boolean status=new AddDao().addSubCategory(subcat);
        if(status){
            FacesContext.getCurrentInstance().addMessage( null,new 
     FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved", ""));
        }else{
            FacesContext.getCurrentInstance().addMessage( null,new 
     FacesMessage(FacesMessage.SEVERITY_WARN, "Data not Saved", ""));
        }
            
        return null;
    }
     public List<SelectItem> getCategoryName(){
         List<SelectItem> catname=new ListDao().catList();
         return catname;
     }
}
