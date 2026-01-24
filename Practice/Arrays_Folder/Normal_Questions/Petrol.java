package Arrays_Folder.Normal_Questions;

public class Petrol {
    public static void main(String[] args) {
        int[] pumpOpen = { 1, 1, 1, 1, 1 };
        int petrolPrices[] = { 1, 2, 3, 4, 5 };
        int interval = 2;
        int numOfVehicles = 5;
        int[] result = newPetrolPrices(pumpOpen, petrolPrices, interval, numOfVehicles);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    static int[] newPetrolPrices(int[] pumpOpen, int[] petrolPrices, int interval, int numOfVehicles) {
        for (int j = 0; j < petrolPrices.length; j++) {
            if (pumpOpen[j] == 1) {
                petrolPrices[j] = petrolPrices[j] * 2;
            }
            if (j == petrolPrices.length - 1) {
                interval--;
            }
            if (j == petrolPrices.length - 1 && interval > 0) {
                j = -1;
            }
        }
        return petrolPrices;
    }
}
