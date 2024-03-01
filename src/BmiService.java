public class BmiService {

    public double calculate(int height, double weight) {
        double bmi = weight / Math.pow(height, 2);
        return bmi;
    }
}
