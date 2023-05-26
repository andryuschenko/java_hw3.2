public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kg = 97;
        int cm = 187;
        int index = service.calculate(kg, cm);
        System.out.println(index);
    }
}