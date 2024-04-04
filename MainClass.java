public class MainClass {

    public static void main(String args[]){
        System.out.println("Hello world");
        Calculator cal = new Calculator();
        System.out.println("My calculation is "+ cal.calculate(5,6));
        System.out.println(CompoundInterest.calculateCompoundInterest(9,20,200000));
    }
}
