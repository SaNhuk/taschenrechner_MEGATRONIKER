public class Main {
    public static void main(String[] args) {
        TaschenrechnerModel model = new TaschenrechnerModel();

        model.setErsterOperand(29);
        model.setZweiterOperand(3);
        model.setOperator("+");
        System.out.println(model.getErgebnis());
        model.setOperator("-");
        System.out.println(model.getErgebnis());
        model.zurücksetzen();
        System.out.println(model.getErgebnis());
    }
}
