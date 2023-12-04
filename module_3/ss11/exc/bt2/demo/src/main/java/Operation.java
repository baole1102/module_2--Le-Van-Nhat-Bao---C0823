public class Operation {
    public static float calculator (float txtFirst, float txtSecond, char operation){
        switch (operation) {
            case '+':
                return txtFirst+txtSecond;
            case '-':
                return txtFirst-txtSecond;
            case '*':
                return txtFirst*txtSecond;
            case '/':
                if (txtSecond != 0){
                    return txtFirst/txtSecond;
                }else {
                    throw new RuntimeException("Cant divide by zero");
                }
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
