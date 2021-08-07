//Creating a class named EnterpriseEdition which is subclass of MicrosoftProduct
public class EnterpriseEdition extends MicrosoftProduct 
{
    private String ClientCompanyName;
    private float pricePerUser;
    private int numberOfUser;
    private String activationDate;
    private String licenseExpireDate;
    private boolean isActivated;
    private boolean isExpired;
    private String activationKey;
    
    //declaring the private variables with the corresponding types.
    public EnterpriseEdition(int productNo,String productName,float pricePerUser)
    {
        //calling the super class with two parameters
        super(productNo,productName);
        this.pricePerUser = pricePerUser;
        numberOfUser = 0;
        licenseExpireDate = "";
        isActivated = false;
        isExpired = false;
        ClientCompanyName = "";
    }
    
    //getter method for name of company
    public String getclientCompanyName() 
    {
        return ClientCompanyName;
    }
    
    //getter method for price per user
    public float getPricePerUser() 
    {
        return pricePerUser;
    }
    
    //getter method for activation date
    public String getactivationDate() 
    {
        return activationDate;
    }
    
    //getter method for license expire date
    public String getLicenseExpireDate() 
    {
        return licenseExpireDate;
    }
    
    //getter method for activated
    public boolean isactivated() 
    {
        return isActivated;
    }
    
    //getter method for expired
    public boolean isexpired() 
    {
        return isExpired;
    }
    
    //getter method for number of users
    public int getNumberOfUser() 
    {
        return numberOfUser;
    }
    
    //this method helps to know the price per user when called
    public void setPricePerUser(float pricePerUser)
    {
        if (isActivated == false)
        {
            this.pricePerUser = pricePerUser; 
        }    
    }
    
    //this method helps to know the activated license 
    public void activateLicense(String ClientCompanyName,int numberOfUser,String activationDate,String licenseExpireDate,String activationKey)
    {
        if (isActivated == true)
        {
            System.out.println("The license is already activated.");
        }
        else
        {
            this.ClientCompanyName = ClientCompanyName;
            this.numberOfUser = numberOfUser;
            this.activationDate = activationDate;
            this.licenseExpireDate = licenseExpireDate;
            this.isActivated = true;
            this.isExpired = false;
            super.setActivationKey(activationKey);
            super.setPrice(pricePerUser);
            float totalPrice = numberOfUser*pricePerUser;
        }
    }
    
    //this method helps to terminate to license which are expired
    public void terminateLicense()
    {
        if(isExpired == true)
        {
            System.out.println("The license is already expired.");
        }
        else
        {
            this.ClientCompanyName = "";
            this.activationDate = "";
            this.licenseExpireDate = "";
            this.numberOfUser = 0;
            this.isActivated = false;
            this.isExpired = true;
        }
    }
    
    //this method helps to display 
    public void displayInfo() 
    {
        super.display();
        System.out.println("Price per user: "+this.pricePerUser);
        if(this.isActivated == true) 
        {
            System.out.println("Client Company Name: "+this.ClientCompanyName);            
            System.out.println("Number of users: "+this.numberOfUser);
            System.out.println("Total price: "+this.numberOfUser*this.pricePerUser);
            System.out.println("Activation date: "+this.activationDate);
            System.out.println("Expiration date: "+this.licenseExpireDate);
            System.out.println("The activation status is true.");
        }
        else
        {
            System.out.println("The license does not exist or is terminated.");
        }
    }
}    

