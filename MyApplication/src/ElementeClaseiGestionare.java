public class ElementeClaseiGestionare {
    public static void main (String[]args){

        ElementeClasei c = new ElementeClasei();
        c.operand1 = 5;
        c.operand2 = 2;
        c.operator = '/';
        System.out.println(c.calculate());
    }
}
