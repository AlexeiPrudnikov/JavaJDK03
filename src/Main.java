public class Main {
    public static void main(String[] args) {
        Pair<Integer, Double> pair = new Pair<>(1, 2.3);
        System.out.println(pair.toString());
        Employee employee = new RepoEmployee().getById(12);
    }
}