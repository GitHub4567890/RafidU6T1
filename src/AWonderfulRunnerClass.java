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

        System.out.println();

        // 4
        double[] array1 = {7.5, 10.0};
        double[] array2 = {8.2, 14.8};
        double[] array3 = {array1[0] + array2[0], array1[1] * array2[1]};
        System.out.println(array3[0] + " " + array3[1]);

        System.out.println();

        // 5
        String[] animals = new String[4];
        System.out.println(animals[0] + " " + animals[1] + " " + animals[2] + " " + animals[3]);
        animals[0] = "dog";
        animals[1] = "camel";
        animals[2] = "aardvark";
        animals[3] = "bunny";
        System.out.println(animals[0] + " " + animals[1] + " " + animals[2] + " " + animals[3]);
        System.out.println(animals[3]);
        animals[2] += "s";
        System.out.println(animals[2]);
        System.out.println(animals.length);
        System.out.println(animals[2].length());

        System.out.println();

        // 6
        Dog dog1 = new Dog("Sparky", 4);
        Dog dog2 = new Dog("Toby", 7);
        Dog dog3 = new Dog("Fiona", 12);
        Dog[] dogs = {dog1, dog2, dog3};
        System.out.println(dogs[0].getName());
        System.out.println(dogs[1].getName());
        System.out.println(dogs[2].getName());

        // 7
        int[] ints1 = {2, 4, 6, 8, 10};
        int[] ints2 = ints1;
        ints2[3] = 15;
        System.out.println(ints1[3]);
        System.out.println(ints2[3]);

        System.out.println();

        // 8
        String[] myStrs = {"hi", "bye", "what", "purple"};
        int arrLen = myStrs.length;
        int strLen = myStrs[3].length();
        System.out.println(arrLen + strLen);

        String str = myStrs[2].substring(1, 3);
        System.out.println(str);
    }
}