class Product{
    private String itemNo;
    private String name;
    private double price;
    private int qty;

    // constructors
    public Product(String ItemNo, String Name){
        itemNo = ItemNo;
        name = Name;
    }   

    public Product(String ItemNo, String Name, double Price, int Qty){
        itemNo = ItemNo;
        name = Name;
        price = Price;
        qty = Qty;
    }

    // getters
    public String getItemNo(){
        return itemNo;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }

    // setters 
    public void setPrice(double Price){
        price = Price;
    }
    public void setQty(int Qty){
        qty = Qty;
    }
}

class Customer{
    private String customer_id;
    private String customer_name;
    private String customer_address;
    private String customer_phone_no;

    // constructors
    public Customer(String customerId, String customerName){
        customer_id = customerId;
        customer_name = customerName;
    }

    public Customer(String customerId, String customerName, String customerAddress, String customerPhoneNo){
        customer_id = customerId;
        customer_name = customerName;
        customer_address = customerAddress;
        customer_phone_no = customerPhoneNo;
    }

    // getters
    public String getCustomerId(){
        return customer_id;
    } 
    public String getCustomerName(){
        return customer_name;
    }
    public String getCustomerAddress(){
        return customer_address;
    }
    public String getCustomerPhoneNo(){
        return customer_phone_no;
    }

    // setters
    public void setCustomerAddress(String address){
        customer_address = address;
    }
    public void setCustomerPhoneNo(String phone_no){
        customer_phone_no = phone_no;
    }
}

public class Product_and_Customer_Class {
    public static void main(String args[]){
        Product p1 = new Product("A001", "lamp");
        System.out.println("ItemNo: " + p1.getItemNo() + "\nname: " + p1.getName());

        Product p2 = new Product("B001", "Phone", 20000, 100);
        System.out.println("\nItemNo: " + p2.getItemNo() + "\nname: " + p2.getName() + "\nprice: " + p2.getPrice() + "\nQuantity: " + p2.getQty());

        Customer c1 = new Customer("AB009", "Vivek Sarade");
        Customer c2 = new Customer("GD007", "Vicky", "India", "+91 9999999999");

        System.out.println("\nCustomerId: "+ c1.getCustomerId() + "\nCustomerName: "+ c1.getCustomerName() + "\nCustomerAddress: "+ c1.getCustomerAddress() + "\nCustomerPhoneNo: "+ c1.getCustomerPhoneNo());
        System.out.println("\nCustomerId: "+ c2.getCustomerId() + "\nCustomerName: "+ c2.getCustomerName() + "\nCustomerAddress: "+ c2.getCustomerAddress() + "\nCustomerPhoneNo: "+ c2.getCustomerPhoneNo());
    }
}