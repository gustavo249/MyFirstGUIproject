import javax.swing.*;

/**
 * Created by Gustavo on 12/02/2016.
 */
public class ComputerPrinter {
    private Toner toner;
    private String statut;

    public ComputerPrinter(Toner toner, String statut) {
        this.toner = toner;
        this.statut = statut;
    }

    public Toner getToner() {
        return toner;
    }

    public void print(int pages, String s, String method) {
        if (method.matches("simple"))
            JOptionPane.showMessageDialog(null, pages + " have been printed in " + toner.getColor() +
                    " for " + this.statut,
                    "Printer", JOptionPane.PLAIN_MESSAGE);
        else {
            JOptionPane.showMessageDialog(null, pages + " have been printed back and forth in " +
            toner.getColor() + " for " + this.statut, "Printer",  JOptionPane.PLAIN_MESSAGE);
            toner.setTank(toner.getTank() - pages);
        }
        toner.setTank(toner.getTank() - pages);
    }
}

