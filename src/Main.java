import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Asking for the number of pages
        String pages = JOptionPane.showInputDialog("How many pages do you want to be printed ?");
        int npages = Integer.parseInt(pages);

        //Asking for the method for printing
        int option = JOptionPane.showOptionDialog(null, "How do you want to print ?", "choose a method",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                new String[]{"Simple - one page", "Double"}, "Double");
        String method;
        if (option == 0)
            method = "simple";
        else{
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
        else{
            intensity = 8;
        }

        //fixing toner's intensity level and color
        Toner toner = new Toner(intensity, color);

        //starting printing what the user wanted
        ComputerPrinter computerPrinter = new ComputerPrinter(toner);
        computerPrinter.print(npages, method);

    }
}
