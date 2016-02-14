import javax.swing.*;

/**
 * Created by Gustavo on 12/02/2016.
 */
public class ComputerPrinter {
    private Toner toner;

    public ComputerPrinter(Toner toner) {
        this.toner = toner;
    }

    public Toner getToner() {
        return toner;
    }

    public void print(int pages, String method) {
        if (method.matches("simple"))
            JOptionPane.showMessageDialog(null, pages + " have been printed in " + toner.getColor(),
                    "Printer", JOptionPane.PLAIN_MESSAGE);
        else {
            JOptionPane.showMessageDialog(null, pages + " have been printed back and forth in " +
            toner.getColor(), "Printer",  JOptionPane.PLAIN_MESSAGE);
            toner.setTank(toner.getTank() - pages);
        }
        toner.setTank(toner.getTank() - pages);
    }
}

