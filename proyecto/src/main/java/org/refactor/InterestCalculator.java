package refactor;

public class InterestCalculator {
    final static int numMagic=365;
    double calculateInterest(double principal, double rate, int time) {

        return principal * Math.pow(1 + (rate / numMagic), time * numMagic);
    }
}