package testiranje;

public class Test extends Start{
    public static void main(String[] args) {
        String r=Calculator.Run("2*2-5+6");
        if (r.compareTo("5")>0){
            System.out.println("Test prosao");
        }else System.out.println("Test pao");
    }
}
