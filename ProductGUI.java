
//in Java. Importing different package.
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class ProductGUI implements ActionListener, KeyListener
{
    JFrame f;
    JTextField tprodNo, tprodName, ttotprice, tCCompanyName, tlicenseActivationDate, 
    tExpireDate, tnoOfUser, tpPerUser, tpnum1, tpnum2, tpnum3, tpperuser, tActivationKey;
    JButton btnAdd_Product, btnActivate_License, btnTerminate_License, btnSet_Price, btnDisplay, btnClear;
    JMenuBar menu;
    JMenu file, task, help;
    JMenuItem New, save, exit, Add, Activate, Terminate, SetP, about;
    ArrayList<MicrosoftProduct>list = new ArrayList<MicrosoftProduct>();
    
    //constructor of ProductGUI class
    public ProductGUI()
    {
        JFrame f = new JFrame("19033655 ");
        f.setSize(720,740); //frame size 720 width  and 740 height
        f.setLayout(null); //setting layout as null of JFrame
        f.setResizable(false);//setting Resizable of frame as false
        f.setVisible(true); //settinng visible status of frame as true
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing the window when pressed close button
        
        //assigning variables to the labels 
        JLabel prodNo = new JLabel("Product No.: ");        
        JLabel prodName = new JLabel("Product Name: ");
        JLabel pPerUser = new JLabel("Price per User: ");
        JLabel pnum1 = new JLabel("Product No.: ");
        JLabel CCompanyName = new JLabel("Client Company Name: ");
        JLabel noOfUser = new JLabel("No. of User: ");
        JLabel licenseActivationDate = new JLabel("Activation Date: ");
        JLabel ExpireDate = new JLabel("Expire Date: "); 
        JLabel ActivationKey = new JLabel("Activation Key: ");
        JLabel totprice = new JLabel("Total Price: ");
        JLabel pnum2 = new JLabel("Product No.: ");
        JLabel pnum3 = new JLabel("Product No.: ");
        JLabel pperuser = new JLabel("Price per User: "); 
        
        //assigning variabales to the text fields
        tprodNo = new JTextField();
        tprodName = new JTextField();
        tpPerUser = new JTextField();     
        tpnum1 = new JTextField();
        tCCompanyName = new JTextField();
        tnoOfUser = new JTextField();
        tlicenseActivationDate = new JTextField();
        tExpireDate = new JTextField();
        tActivationKey = new JTextField();
        ttotprice = new JTextField();        
        ttotprice.setEditable(false);
        tpnum2 = new JTextField();
        tpnum3 = new JTextField();
        tpperuser = new JTextField();
        
        //adding titles in the frame
        JLabel title1 = new JLabel("ProductGUI");
        f.add(title1);
        title1.setFont(new Font("Arial", Font.PLAIN, 20));
        title1.setBounds(300,10,700,45);
        title1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));              
              
        JLabel title2 = new JLabel("Product Addition");
        f.add(title2);
        title2.setFont(new Font("Arial", Font.PLAIN, 18));
        title2.setBounds(60,45,500,45);
        title2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        JLabel title3 = new JLabel("License Activation");
        f.add(title3);
        title3.setFont(new Font("Arial", Font.PLAIN, 18));
        title3.setBounds(60,165,500,45);
        title3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        JLabel title4 = new JLabel("License Termination");
        f.add(title4);
        title4.setFont(new Font("Arial", Font.PLAIN, 18));
        title4.setBounds(60,375,500,45);
        title4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        JLabel title5 = new JLabel("Product Price Per User");
        f.add(title5);
        title5.setFont(new Font("Arial", Font.PLAIN, 18));
        title5.setBounds(60,460,500,45);
        title5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        
        btnAdd_Product = new JButton("Add");
        btnActivate_License = new JButton("Activate License");
        btnTerminate_License = new JButton("Terminate License");
        btnSet_Price = new JButton("Set Price");
        btnDisplay = new JButton("Display");
        btnClear = new JButton("Clear");
            
        JLabel n = new JLabel("0   OF   0");
        n.setBounds(320,623,90,60);
        f.add(n);
        
        //adding menu bar to the frame
        menu  = new JMenuBar();
        f.setJMenuBar(menu);
        
        file = new JMenu("File");
        menu.add(file);
        New = new JMenuItem("New");
        file.add(New);        
        save = new JMenuItem("Save");
        file.add(save);
        exit = new JMenuItem("Exit");
        file.add(exit);
        
        task = new JMenu("Task");
        menu.add(task);
        Add = new JMenu("Add Product");
        task.add(Add);
        Activate = new JMenu("Activate License");
        task.add(Activate);        
        Terminate = new JMenuItem("Terminate License");
        task.add(Terminate);        
        SetP = new JMenuItem("Set Price");
        task.add(SetP);
        
        help = new JMenu("Help");
        menu.add(help); 
        about = new JMenu("About");
        help.add(about);           
        
        //setting the position and size of labels and text fields 
        prodNo.setBounds(60,77,100,40);
        tprodNo.setBounds(155,87,150,30);
        prodName.setBounds(375,77,100,40); 
        tprodName.setBounds(475,87,150,30);
        pPerUser.setBounds(60,120,180,40);
        tpPerUser.setBounds(155,130,150,30);
        pnum1.setBounds(60,205,100,40);
        tpnum1.setBounds(155,210,150,30);
        CCompanyName.setBounds(375,205,145,40);
        tCCompanyName.setBounds(525,210,150,30);
        noOfUser.setBounds(60,243,100,40); 
        tnoOfUser.setBounds(155,248,150,30);;
        licenseActivationDate.setBounds(375,243,145,40);
        tlicenseActivationDate.setBounds(525,248,150,30);
        ActivationKey.setBounds(60,285,100,40);
        tActivationKey.setBounds(155,288,150,30);
        ExpireDate.setBounds(375,285,150,40);
        tExpireDate.setBounds(525,288,150,30); 
        totprice.setBounds(60,330,100,40);
        ttotprice.setBounds(155,330,150,30);
        pnum2.setBounds(60,415,100,40);
        tpnum2.setBounds(155,420,150,30);
        pnum3.setBounds(60,500,100,40);
        tpnum3.setBounds(155,510,150,30);
        pperuser.setBounds(375,500,100,40);
        tpperuser.setBounds(480,510,150,30);
        //setting button positions and size
        btnAdd_Product.setBounds(525,127,100,30);
        btnActivate_License.setBounds(525,330,150,30);
        btnTerminate_License.setBounds(525,420,150,30);
        btnSet_Price.setBounds(525,550,100,30);
        btnDisplay.setBounds(60,600,100,30);
        btnClear.setBounds(575,600,100,30);                     
        
        //adding the labels and text fields into frame
        f.add(prodNo);
        f.add(tprodNo);
        f.add(prodName);
        f.add(tprodName);
        f.add(pPerUser);
        f.add(tpPerUser);
        f.add(pnum1);
        f.add(tpnum1);
        f.add(CCompanyName);
        f.add(tCCompanyName);
        f.add(noOfUser);
        f.add(tnoOfUser);
        f.add(licenseActivationDate);
        f.add(tlicenseActivationDate);
        f.add(ExpireDate);
        f.add(tExpireDate);
        f.add(ActivationKey);
        f.add(tActivationKey);
        f.add(totprice);
        f.add(ttotprice);
        f.add(pnum2);
        f.add(tpnum2);
        f.add(pnum3);
        f.add(tpnum3);
        f.add(pperuser);
        f.add(tpperuser);
        //adding buttons into frame
        f.add(btnAdd_Product);
        f.add(btnActivate_License);
        f.add(btnTerminate_License);
        f.add(btnSet_Price);
        f.add(btnDisplay);
        f.add(btnClear);         
        
        //Adding button functions to ActionListener and KeyListener 
        tnoOfUser.addKeyListener(this);
        btnAdd_Product.addActionListener(this);
        btnActivate_License.addActionListener(this);
        btnTerminate_License.addActionListener(this);
        btnSet_Price.addActionListener(this);
        btnDisplay.addActionListener(this);
        btnClear.addActionListener(this);
        save.addActionListener(this);
        New.addActionListener(this);
        exit.addActionListener(this);
    }
    
    public void keyPressed(KeyEvent ke){}
    public void keyTyped(KeyEvent ke){}
    public void keyReleased(KeyEvent ke)
    {
        try
        {
            //declaring the variables with its corresponding types
            int pnumb = Integer.parseInt(tpnum1.getText());
            String numberOfUser = tnoOfUser.getText();
            float noOfUser =  Float.parseFloat(numberOfUser);
            settotprice(pnumb,noOfUser);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(f,"Invalid value!");
        }
    }
    
    public void settotprice(float pnumb, float noOfUser)
    {
        boolean pnumFound = false;
        //accessing all the list values
        for(MicrosoftProduct listItem:list)
        {            
            if(listItem.getProductNo() == pnumb)
            {
                EnterpriseEdition list = (EnterpriseEdition)listItem;                
                float Totprice = noOfUser*list.getPricePerUser();
                ttotprice.setText(Totprice+"");
                pnumFound = true;
                break;
            }
        }
        if(pnumFound == false)
        {
            ttotprice.setText(0+"");
        }
    }
       
    //Ovverride Method
    public void actionPerformed(ActionEvent e)
    {
        //using Action Listener for Add Product button
        if(e.getSource() ==btnAdd_Product)
        {
            productAdd(); //Calling productAdd function
        }
        
        //using Action Listener for Activate License button
        if(e.getSource() == btnActivate_License)
        {
            licenseActivate(); //Calling licenseActivate function 
        }
        
        //using Action Listener for Terminate License button       
        if(e.getSource() == btnTerminate_License)
        {
            licenseTerminate(); //Calling licenseTerminate function
        }
        
        //using Action Listener for Set Price button
        if(e.getSource() == btnSet_Price)
        {
            SetPrice(); //Calling SetPrice function
        }
        
        //using Action Listener for Display button
        if(e.getSource() == btnDisplay)
        {
            display(); //Calling display function
        }
        
        //using Action Listener for Clear button
        if(e.getSource() == btnClear) 
        {
            tprodNo.setText("");
            tprodName.setText("");
            tpPerUser.setText("");            
            tpnum1.setText("");
            tCCompanyName.setText("");
            tnoOfUser.setText("");
            tlicenseActivationDate.setText("");
            tExpireDate.setText("");
            tActivationKey.setText("");
            ttotprice.setText("");
            tpnum2.setText("");
            tpnum3.setText("");
            tpperuser.setText("");
        }
        
        //using Action Listener for save button
        if(e.getSource() == save) 
        {
            JOptionPane.showMessageDialog(f, "Record is being saved!");
        }
        
        //using Action Listener for New button
        if (e.getSource() == New) 
        {
            tprodNo.setText("");
            tprodName.setText("");
            tpPerUser.setText("");            
            tpnum1.setText("");
            tCCompanyName.setText("");
            tnoOfUser.setText("");
            tlicenseActivationDate.setText("");
            tExpireDate.setText("");
            tActivationKey.setText("");
            ttotprice.setText("");
            tpnum2.setText("");
            tpnum3.setText("");
            tpperuser.setText("");
        }
        
        //using Action Listener for exit button
        if(e.getSource()==exit) 
        {
            System.exit(0);
        }
    }
    
    public void productAdd()
    {
        try
        {
            //getting the text from specific fields
            String productNo = tprodNo.getText();
            String productName = tprodName.getText();
            String pricePerUser = tpPerUser.getText();
            if(productNo.equals("")||productName.equals("")||pricePerUser.equals(""))
            {
                JOptionPane.showMessageDialog(f,"Do not leave any field empty!");
            }
            else // checking for duplicate
            {
                //declaring the variables with its corresponding types
                int pnum = Integer.parseInt(productNo);
                String pname = tprodName.getText();
                float ppuser = Float.parseFloat(pricePerUser);
                boolean isDuplicate= false;
                //accessing all the list values
                for(MicrosoftProduct listItem:list)
                {
                    if(listItem.getProductNo() == pnum||listItem.getProductName() == pname)
                    {
                        isDuplicate = true;
                        break;
                    }
                }
                if(isDuplicate == true)
                {
                    JOptionPane.showMessageDialog(f,"The value already exist.Add new value!");                     
                }
                else
                {
                    EnterpriseEdition obj = new EnterpriseEdition(pnum,pname,ppuser);
                    list.add(obj); //adding object to the array list
                    JOptionPane.showMessageDialog(f,"The values are added!");
                }
            }
        }    
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(f,"Invalid values!");
        }
        
    }
    
    public void licenseActivate()
    {
        try
        {
            //getting the text from specific fields
            String productNo = tpnum1.getText();
            String ClientCompanyName = tCCompanyName.getText();
            String numberOfUser = tnoOfUser.getText();
            String activationDate = tlicenseActivationDate.getText();
            String licenseExpireDate = tExpireDate.getText();
            String activationKey = tActivationKey.getText();
            if(productNo.equals("")||ClientCompanyName.equals("")||numberOfUser.equals("")||activationDate.equals("")||licenseExpireDate.equals("")||activationKey.equals(""))
            {
                JOptionPane.showMessageDialog(f,"Please do not leave any field empty.");
            }
            else
            {
                //declaring the variables with its corresponding types
                float pno = Float.parseFloat(productNo);
                int numOfUser = Integer.parseInt(numberOfUser);
                boolean productFound = false;
                //accessing all the list values
                for(MicrosoftProduct listItem:list)
                {          
                    if(listItem.getProductNo() == pno)
                    {
                        EnterpriseEdition list = (EnterpriseEdition)listItem;//Downcasting
                        if(list.isactivated())
                        {
                            JOptionPane.showMessageDialog(f,"The product has already been activated.");
                        }
                        else
                        {
                            list.activateLicense(ClientCompanyName,numOfUser,activationDate,licenseExpireDate,activationKey);
                            JOptionPane.showMessageDialog(f,"The product is activated.");
                            productFound = true;
                            break;
                        }
                    }              
                }                  
                if(productFound == false)
                {
                    JOptionPane.showMessageDialog(f,"Product number not found!");
                }
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(f,"Invalid Value!");
        }
    }
    
    public void licenseTerminate()
    {
        try
            {
                //getting the text from specific fields
                String productNo = tpnum2.getText();
                if(productNo.equals(""))
                {
                    JOptionPane.showMessageDialog(f,"Invalid Value!");
                }
                else
                {
                    //declaring the variables with its corresponding types
                    float pnum2 = Float.parseFloat(productNo);
                    boolean prodFound = false;
                    //accessing all the list values
                    for(MicrosoftProduct listItem:list)
                    {
                        if(listItem.getProductNo() == pnum2)
                        {
                            EnterpriseEdition obj = (EnterpriseEdition)listItem;//Downcasting
                            obj.terminateLicense();
                            JOptionPane.showMessageDialog(f,"The license for this product is terminated.");
                            prodFound = true;
                            break;
                        }
                    }
                    if(prodFound == false)
                    {
                        JOptionPane.showMessageDialog(f,"Product not found.");
                    }
                }
            }
            catch(Exception own)
            {
                JOptionPane.showMessageDialog(f,"Enter valid value!");
            }
    }
    
    public void SetPrice()
    {
        try
            {
                //getting the text from specific fields
                String productNo = tpnum3.getText();
                String pricePerUser = tpPerUser.getText();
                if(productNo.equals("")||pricePerUser.equals(""))
                {
                    JOptionPane.showMessageDialog(f,"Do not leave any fields empty.");
                }
                else
                {
                    //declaring the variables with its corresponding types
                    float prodnum = Float.parseFloat(productNo);
                    float peruser =  Float.parseFloat(pricePerUser);
                    boolean pFound = false;
                    boolean isActive = true;
                    //accessing all the list values
                    for(MicrosoftProduct listItem:list)
                    {
                        if(listItem.getProductNo() == prodnum)
                        {
                            EnterpriseEdition ed = (EnterpriseEdition)listItem;//Downcasting
                            if(ed.isactivated())
                            {
                                JOptionPane.showMessageDialog(f,"License has been activated already. Now, price can not be set per user.");
                            }
                            else
                            {
                                ed.setPricePerUser(peruser);
                                JOptionPane.showMessageDialog(f,"Price per user has been set new value.");
                                pFound = true;
                                break;
                            }
                        }
                        if(pFound == false)
                        {
                            JOptionPane.showMessageDialog(f,"Product not found.");
                        }
                    }
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(f,"Invalid values!");
            }
    }
    
    public void display()
    {
        //accessing all the list values        
        for(MicrosoftProduct listItem:list)
        {
            EnterpriseEdition eed = (EnterpriseEdition)listItem; //Downcasting
            eed.displayInfo();
        }
    }
    
    //main method of ProductGUI class
    public static void main(String[]args)
    {
        new ProductGUI();
    }
}  