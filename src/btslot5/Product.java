package btslot5;
import java.util.Scanner;

public class Product {
    int id;
    String productName ;
    int qty ;
    float price;
    public void nhapSl() {
        System.out.println("Nhập số lượng hàng : ");
        Scanner sc = new Scanner(System.in);
        qty = sc.nextInt();
    }
    public void checkQty(){
        if (qty>0) {
            System.out.println("Còn hàng!");}
            else
            {
                System.out.println("Hết hàng !!!");
            }
        }
    }
