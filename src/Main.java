public class Main {
    public static void main(String[] args) {
        BodyMassIndexCalculator service = new BodyMassIndexCalculator();


        double IBM = service.calculate(76, 1.96);
        System.out.println(IBM);
    }
}


