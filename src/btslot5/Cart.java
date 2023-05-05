package btslot5;

import java.util.Scanner;
public class Cart {
    int id,i;
    String customer ;
    String[] productList ={ "quan" , "ao"};
    String city;
    double grandTotal;
    public void nhapId() {
        System.out.println("Id : ");
        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();

    }
    public void dienCustomer() {
        System.out.println("Customer Name : ");
        Scanner sc = new Scanner(System.in);
        city = sc.nextLine();

    }
    public void hienProductList() {
        System.out.println("ProductList : ");

  for (i=0 ; i< productList.length;i++)
      System.out.println(  productList[i]);
    }

    public void nhapCity() {
        System.out.println("City : ");
        Scanner sc = new Scanner(System.in);
        city = sc.nextLine();

    }
    public void nhapGrandTotal() {
        System.out.println("Grandtotal : ");
        Scanner sc = new Scanner(System.in);
        grandTotal = sc.nextInt();

    }
    public void checkCity() {
        if (city == "HN" || city == "HCM"){
            grandTotal = grandTotal + grandTotal / 100 ;

        } else {
            grandTotal = grandTotal + grandTotal / 50;
        }
        System.out.println("GrandTotal : " + grandTotal);
    }



}
