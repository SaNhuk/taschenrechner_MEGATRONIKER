public class TaschenrechnerModel {
    int ersterOperand;
    int zweiterOperand;
    String operator;

    public TaschenrechnerModel() {
    }

    public void setErsterOperand(int ersterOperand) {
        this.ersterOperand = ersterOperand;
    }

    public void setZweiterOperand(int zweiterOperand) {
        this.zweiterOperand = zweiterOperand;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void zurücksetzen() {
        this.operator = null;
    }

    public int getErgebnis(){
        if (this.operator == "+") {
            return this.ersterOperand + this.zweiterOperand;
        } else if (this.operator == "-") {
            return this.ersterOperand - this.zweiterOperand;
        } else if (this.operator == "*") {
            return this.ersterOperand * this.zweiterOperand;
        } else if (this.operator == "/") {
            return (int) (this.ersterOperand / this.zweiterOperand);
        } else return this.zweiterOperand;
    }
}
