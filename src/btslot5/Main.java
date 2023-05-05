package btslot5;

public class Main {
public static void main (String[]  args) {
    Product p = new Product();
    p.nhapSl();
    p.checkQty();
    Cart a = new Cart();
    a.nhapId();
    a.dienCustomer();
    a.hienProductList();
    a.nhapCity();
    a.nhapGrandTotal();
    a.checkCity();
}

}

