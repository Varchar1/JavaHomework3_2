public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.81;
        int weight = 73;
        int MyBmi = service.calculate(height, weight);
        System.out.println(MyBmi);
    }
}
