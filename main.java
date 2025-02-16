class Product {
    String pname,pcode;
    int price;
public Product(String pname,String pcode,int price)
{
    this.pname=pname;
    this.pcode=pcode;
    this.price=price;
}
public Product(){

}
public String getPname(){
    return pname;
}
public void setpname(String pname){
    this.pname=pname;

}
public String getPcode(){
    return pcode;
}
public void setpcode (String pcode){
    this.pcode=pcode;
}
public int getprice(){
    return price;
}
public void display(){
    System.out.println("pcode="+this.pcode);
    System.out.println("pname="+this.pname);
    System.out.println("price="+this.price);
    
}
}
public class main {
    public static void main(String[] args){
        Product p1=new Product("Benz","car123",10000);
        System.out.println("# Display p1");
        p1.display();

        Product p2=new Product("Jagwar","car426",250000);
        System.out.println("# Display p2");
        p2.display();

        Product p3=new Product("Mauthi","car800",50000);
        System.out.println("# Display p3");
        p3.display();

    Product p=new Product();
    if (p1.getprice()<p2.getprice() && p1.getprice()<p3.getprice())
    {
        p=p1;
    }
    else if(p2.getprice()<p3.getprice()){
        p=p2;
    }
    else{
        p=p3;
    }
    System.out.println("\n------Display product with lowest price------");
    p.display();

    }   
}
