package Calculator;

public class Main {
    public static void main(String[] args) {
        DesignCalculator calculator=new DesignCalculator();
        calculator.prepareGUI();
        calculator.addComponents();
        calculator.addActionevents();
    }
}
