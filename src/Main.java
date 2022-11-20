public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 70;
        int height = 161;
        int bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}