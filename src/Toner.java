/**
 * Created by Gustavo on 12/02/2016.
 */
public class Toner {
    private int tonerIntensityLevel;
    private String color;
    private int tank;

    public Toner(int tonerIntensityLevel, String color) {
        this.tonerIntensityLevel = tonerIntensityLevel;
        this.color = color;
        this.tank = tank;
    }

    public void setTank(int tank) {
        this.tank = 100;
    }

    public int getTonerIntensityLevel() {
        return tonerIntensityLevel;
    }

    public int getTank() {
        return tank;
    }

    public String getColor() {
        int level = getTonerIntensityLevel();

        if (level >= 0 && level <= 5)
            return "light " + color;
        else
            return "dark " + color;
    }

    public void tonerLeft(){
        System.out.println("Toner has " + tank + " left");
    }
}
