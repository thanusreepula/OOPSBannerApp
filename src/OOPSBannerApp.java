public class OOPSBannerApp {
    public static void main(String[] args) {

        // Step 1: Create array
        String[] banner = new String[7];

        // Step 2: Store banner lines
        banner[0] = " *****    *****   ******   ***** ";
        banner[1] = "*     *  *     *  *     *  *     ";
        banner[2] = "*     *  *     *  *     *  *     ";
        banner[3] = "*     *   *****   ******   ***** ";
        banner[4] = "*     *  *        *             * ";
        banner[5] = "*     *  *        *             *    ";
        banner[6] = " *****   *        *       *****";

        // Step 3: Loop to print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}