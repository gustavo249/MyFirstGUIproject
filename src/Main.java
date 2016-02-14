import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Statutul
        String statut = JOptionPane.showInputDialog("What is your rank among the mobsters ?");
        if (statut != null && !statut.isEmpty()) {
            //Asking for the number of pages
            int ok = 1;
            int npages = 0;
            while (ok == 1) {
                String pages = JOptionPane.showInputDialog("How many pages do you want to be printed ?");
                try {
                    npages = Integer.parseInt(pages);
                    ok = 0;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input");
                }
            }

            //Asking for the method for printing
            int option = JOptionPane.showOptionDialog(null, "How do you want to print ?", "choose a method",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"Simple - one page", "Double"}, "Double");
            String method;
            if (option == 0)
                method = "simple";
            else {
                method = "double";
            }

            //asking for color and nuance
            String color = JOptionPane.showInputDialog("In what color do you want to print ?");
            int option2 = JOptionPane.showOptionDialog(null, "Do you want a darker color or a ligher one ?",
                    "Intensity", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"Lighter", "Darker"}, "Darker");
            int intensity;
            if (option2 == 0)
                intensity = 2;
            else {
                intensity = 8;
            }

            //fixing toner's intensity level and color
            Toner toner = new Toner(intensity, color);

            //starting printing what the user wanted
            ComputerPrinter computerPrinter = new ComputerPrinter(toner, statut);
            computerPrinter.print(npages, method, statut);
        }

    }
}
