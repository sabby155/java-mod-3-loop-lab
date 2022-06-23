public class Main {
    public static void main(String[] args) {
        // simulate the passing of time
        // USING WHILE LOOP: 

        // int startingYear = 2000;
        // int targetYear = 2011;
        // int currentYear = startingYear + 1;

        // while (currentYear < targetYear) {
        //     // conditional logic based on the current year
        //     if (currentYear - startingYear == 1) {
        //         System.out.println((currentYear - startingYear) + " year has passed");
        //     } else {
        //         System.out.println((currentYear - startingYear) + " year(s) have passed");
        //     }
        //     currentYear++;
        // }

        // simulate the passing of time
        // USING FOR LOOP:

        int startingYear = 2000;
        int targetYear = 2011;

        for (int currentYear = startingYear + 1; currentYear < targetYear ; currentYear++) {
            // conditional logic based on the current year
            if (currentYear - startingYear == 1) {
                System.out.println((currentYear - startingYear) + " year has passed");
            } else {
                System.out.println((currentYear - startingYear) + " year(s) have passed");
            }
        }
    }
}
