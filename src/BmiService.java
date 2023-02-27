public class BmiService {
    public int calculate(double meter, int kilogram) {
        double index = kilogram / (meter * meter);
        int bmi = (int) index;

        return bmi;
    }
}
