public class AWonderfulRunnerClass {
    public static void main(String[] args) {
        // 1
        int[] heights = new int[3];
        int count = 0;
        for (int i = 0; i <= heights.length - 1; i++) {
            System.out.print(heights[i]);
            count++;
            if (count <= 2) {
                System.out.print(", ");
            }
        }
        System.out.println();
        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;
        int count2 = 0;
        for (int i = 0; i <= heights.length - 1; i++) {
            System.out.print(heights[i]);
            count2++;
            if (count2 <= 2) {
                System.out.print(", ");
            }
        }

        System.out.println("\n");
        // 2
        boolean[] bools = {true, false, true, false, true, false};
        bools[0] = bools[3];
        System.out.println("Length: " + bools.length);
        System.out.println(bools[0] + "\n" + bools[bools.length - 1]);

        System.out.println();
        // 3
        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};
        String temp = alphabeticalNames[1];
        alphabeticalNames[1] = alphabeticalNames[2];
        alphabeticalNames[2] = temp;
        System.out.println(alphabeticalNames[0]);
        System.out.println(alphabeticalNames[1]);
        System.out.println(alphabeticalNames[2]);
        System.out.println(alphabeticalNames[3]);

    }
}