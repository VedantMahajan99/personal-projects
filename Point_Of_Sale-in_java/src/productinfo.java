/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vedantmahajan
 */
public class productinfo {
    
    int PID;
    
    String product_name , product_desc , barcode , Price , Photo , category;
    
    public productinfo(int PID , String product_name , String product_desc , String barcode , String Price , String Photo , String category)
            
    {
           this.PID = PID;
        
           this.product_name = product_name;
           
           this.product_desc = product_desc;
           
           this.barcode = barcode;
           
           this.Photo = Photo;
           
           this.Price = Price;
           
           this.category = category;
    }
    
}
