/**
 * OOPSBannerApp
 *
 * UC4: Refactor using String Array and Loop
 * for better modularity and reusability
 *
 * @author Mahadev
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

                String.join("  ", " ***** ", " ***** ", " ***** ", " ***** "),
                String.join("  ", "*     *", "*     *", "*     *", "*     *"),
                String.join("  ", "*     *", "*     *", "*     *", "*      "),
                String.join("  ", "*     *", "*     *", " ***** ", " ***** "),
                String.join("  ", "*     *", "*     *", "*      ", "*      "),
                String.join("  ", "*     *", "*     *", "*      ", "*     *"),
                String.join("  ", " ***** ", " ***** ", "*      ", " ***** ")

        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
