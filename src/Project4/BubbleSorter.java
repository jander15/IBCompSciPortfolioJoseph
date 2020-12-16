package Project4;

public class BubbleSorter implements Sorter {
    @Override
    public Double[] sort(Double[] values) {
        Double[] retArr = values;

        for (int i = 0; i < retArr.length - 1; i++) {
            for (int j = 0; j < retArr.length - 1 - i; j++) {
                if (retArr[i] > retArr[i + 1]) {
                    double temp = retArr[i];
                    retArr[i] = retArr[i + 1];
                    retArr[i + 1] = temp;
                }

            }
        }
        System.out.println("Bubble Sorted!");
        return retArr;
    }
}

