/**
 * creat by zhaochen on 2018/12/27 15:48
 */
public class Demo {
    public static void main(String[] args) {
        /*boolean flag = true;
        if (flag) System.out.println("Hello, Java!");
        if (flag == true) System.out.println("Hello, JVM!");*/
        NaiveMerchant naiveMerchant = new NaiveMerchant();
        Number number = naiveMerchant.actionPrice(1d, null);
    }
}

interface Customer {
    boolean isVIP();
}

class Merchant {
    public Number actionPrice(double price, Customer customer) {
        System.out.println("Number");
        return null;
    }
}

class NaiveMerchant extends Merchant {
    @Override
    public Double actionPrice(double price, Customer customer) {
        System.out.println("Double");
        return null;
    }
}
