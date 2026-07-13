package CompanyWise.TCS;

public class HappySadState {
    public static void main(String[] args) {
        int happy = 100;
        System.out.println(findSadPeople(happy));
    }

    private static String findSadPeople(int happy) {
        double sad = 0;
        double ogHappy = happy;
        for (int i = 0; i < 4; i++) {
            System.out.println(ogHappy);
            System.out.println(sad);
            sad = (0.35) * ogHappy;
            ogHappy = ogHappy - sad;
            // ogHappy = ogHappy + sad * (1 / 2);
            System.out.println("------------");
        }
        return ogHappy + " " + sad;
    }
}
