package lr4;

public class Example4 {
    public static void main(String[] args) {
        int j;
        int i;
        int[][]array = new int[5][10];

        for (i = 0; i < 5; i++) {
            for (j = 0; j < i+1; j++) {
                array[i][j] = 1;

                    System.out.print(array[i][j] + "  ");
                }
                System.out.println();

            }
    }

}

