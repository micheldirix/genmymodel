package com.genmymodel.shoppingcart;

import java.util.Set;
import java.util.HashSet;
import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class ShoppinCart
{
   /**
    * <!-- begin-user-doc -->
    * <!--  end-user-doc  -->
    * @generated
    * @ordered
    */

   public Date creationDate;

   /**
    * <!-- begin-user-doc -->
    * <!--  end-user-doc  -->
    * @generated
    * @ordered
    */
   public WebUser webuser;

   /**
    * <!-- begin-user-doc -->
    * <!--  end-user-doc  -->
    * @generated
    * @ordered
    */

   public Set<LineItem> items;

   /**
    * <!-- begin-user-doc -->
    * <!--  end-user-doc  -->
    * @generated
    * @ordered
    */

   public Account account;

   /**
    * <!-- begin-user-doc -->
    * <!--  end-user-doc  -->
    * @generated
    */
   public ShoppinCart()
   {

   }

   public void addItem(LineItem item)
   {
      items.add(item);
   }

   public void zboub(int size) {
    if (size < 5) {
      System.out.println("Boouuuuuuu!");
      return;
    }
    if ( size > 20) {
      System.out.println("Hello Rocco");
      return;
    }
    System.out.println("I'm " + size + " inches long :D! I'm a big boy.");
    
   }


  public static void main(String[] args )
  {
    ShoppinCart sc = new ShoppinCart();
    sc.zboub(22);
  }
  
}
