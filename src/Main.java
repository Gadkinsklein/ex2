public class Main {
    public static void main(String[] args) {
        String[] cityNames = {"Columbus", "Cleveland", "Cincinnati", "Dayton"};
        int[] currentTemperatures = {45, 29, 10, 22, 41, 28, 33};
        System.out.println("Cities with negative temperatures:");

        for (int i = 0; i < cityNames.length; i++) {
            if (currentTemperatures[i] >= 0) {
                continue;
            }
            System.out.println(cityNames[i]);
        }
    }
}