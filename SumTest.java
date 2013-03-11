public class SumTest {

public static void main(String[] args) {
System.out.println("Running positive test case...");
positiveTest();
System.out.println("Running negative test case...");
negativeTest();

}
public static void positiveTest() {

 Sum s = new Sum();

        int sum = s.add(1,2);

        if(sum == 1+2) {
                System.out.println("Test Pass");
        }
        else {
                System.out.println("Test Fail");
        }


}

public static void negativeTest() {

 Sum s = new Sum();

        int sum = s.add(1,2);

        if(sum != 1 && sum != 2) {
                System.out.println("Test Pass");
        }
        else {
                System.out.println("Test Fail");
        }

}

}
