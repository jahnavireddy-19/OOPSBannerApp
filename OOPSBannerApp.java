/**
 * OOPSBannerApp
 *
 * UC3: Refactor banner creation using String.join()
 * to improve memory efficiency instead of using +
 *
 * @author Mahadev
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join("  ",
                " ***** ",
                " ***** ",
                " ***** ",
                " ***** "));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                "*     *",
                "*     *"));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                "*     *",
                "*      "));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                " ***** ",
                " ***** "));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                "*      ",
                "*      "));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                "*      ",
                "*     *"));

        System.out.println(String.join("  ",
                " ***** ",
                " ***** ",
                "*      ",
                " ***** "));
    }
}
