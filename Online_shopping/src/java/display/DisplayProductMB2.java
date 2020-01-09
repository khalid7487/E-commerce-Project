/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display;

import entity.Product;
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
}
