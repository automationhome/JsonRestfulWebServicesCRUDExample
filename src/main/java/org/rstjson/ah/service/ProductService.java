package org.rstjson.ah.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.rstjson.ah.bean.Product;

/*
 * It is just a helper class which should be replaced by database implementation.
 * It is not very well written class, it is just used for demonstration.
 */
public class ProductService {

 static HashMap<Integer,Product> ProductIdMap=getProductIdMap();


 public ProductService() {
  super();

  if(ProductIdMap==null)
  {
   ProductIdMap=new HashMap<Integer,Product>();  
  // Creating some objects of Product while initializing
   Product prdt1=new Product(1, "Chair Shoe",24.8f);
   Product prdt4=new Product(4, "Ice Tea",12.8f);
   Product prdt3=new Product(3, "Chair",25.4f);
   Product prdt2=new Product(2, "Telephone Clock",25.8f);


   ProductIdMap.put(1,prdt1);
   ProductIdMap.put(4,prdt4);
   ProductIdMap.put(3,prdt3);
   ProductIdMap.put(2,prdt2);
  }
 }

 public List<Product> getAllProducts()
 {
  List<Product> products = new ArrayList<Product>(ProductIdMap.values());
  return products;
 }

 public Product getProduct(int id)
 {
	 Product product= ProductIdMap.get(id);
  return product;
 }
 public Product addProduct(Product product)
 {
  product.setId(getMaxId()+1);
  ProductIdMap.put(product.getId(), product);
  return product;
 }
 
 public Product updateProduct(Product product)
 {
  if(product.getId()<=0)
   return null;
  ProductIdMap.put(product.getId(), product);
  return product;

 }
 public void deleteProduct(int id)
 {
  ProductIdMap.remove(id);
 }

 public static HashMap<Integer, Product> getProductIdMap() {
  return ProductIdMap;
 }
 

 // Utility method to get max id
 public static int getMaxId()
 {   int max=0;
 for (int id:ProductIdMap.keySet()) {  
  if(max<=id)
   max=id;

 }  
 return max;
 }
}

