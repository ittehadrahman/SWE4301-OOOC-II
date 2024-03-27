package assignment2.datacoupling;

public class DataCoupling {
    int num1, num2, num3;

    public DataCoupling(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void GetSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println("Sum: " + sum);
    }
}
//    Data coupling occurs when data are passed as arguments

