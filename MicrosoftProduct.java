/**
 * is a GUI based application used for soft company(program description)
 * 
 * @author(Alka Lama)
 * @version(4.2.2)
 */
//Creating a class named MicrosoftProduct which is super class  
public class MicrosoftProduct
{
   //declaring the instance variable for the class
   private float productNo; 
   private String productName; 
   private String activationKey; 
   private float price; 
      
   //defining the parameterized constructor
   public MicrosoftProduct(float productNo, String productName) 
   {
       this.productNo = productNo;
       this.productName = productName;
       this.activationKey = "";
       this.price = 0;
   }
   
   //getter method for product number
   public float getProductNo() 
   {
       return productNo;
   }
   //getter method for Product name
   public String getProductName() 
   {
       return productName;
   }
   //getter method for activation key
   public String getActivationKey() 
   {
       return activationKey;
   }
   
   //setter method for activation key
   public void setActivationKey (String activationKey) 
   {
       this.activationKey = activationKey;
   }
   
   //getter method for price
   public float getPrice()
   {
       return price;
   }
   
   //setter method for price
   public void setPrice(float price)
   {
       this.price = price;
   }
   
   //displaying the output 
   public void display() 
   {
       System.out.println("Product Number: "+this.productNo);
       System.out.println("Product Name: "+this.productName);
       if (!activationKey.equals("") && price != 0)
       {
           System.out.println("Activation key: "+this.activationKey);
           System.out.println("Marked Price: "+this.price);
       }
    }
}
