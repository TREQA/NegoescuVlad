public class ElementeClasei {
    public double operand1;
    public double operand2;
    char operator;

    public double calculate(){
        double result;
        switch(this.operator){
            case '+':
                result = operand1 + operand2;
                break;

            case '-':
                result = operand1 - operand2;
                break;

            case '*':
                result = operand1 * operand2;
                break;

            case '/':
                result = operand1 / operand2;
                break;

            default:
                result = 0;
                break;
        }
        return result;
    }
}
