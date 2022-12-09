public class Main {
    public static void main(String[] args) {
        double[] aLotOfNumbers = {-1.24, -2.45, 1.23, 3.4, -4.5, 3.45, 0.12, 1.43, 5.6, 0.67, 0.34, 0.66, 9.23, 4.55, 1.34};
        double avarage = 0.0;
        int count = 0;
        for (double numbers: aLotOfNumbers) {
                    if (numbers > 0){
                        avarage += numbers;
                       count++;
                    }
            }
        System.out.println("average  " + avarage);
        System.out.println("count  " + count);
        System.out.println("average/count " + avarage / count);

    }
}
