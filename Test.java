public class Test {
    private Persoon persoon;

    public static void main(String[] args) {
        Persoon persoon = new Persoon(748372947, "Test", "Tester", "13-05-2019", "M");
        System.out.println(persoon.getGeslacht());
    }
}
