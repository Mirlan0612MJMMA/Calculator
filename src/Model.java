import java.text.NumberFormat;

public class Model {
    private Viewer viewer;
    private String temp;
    private char action;
    private String leftValue;
    private String rightValue;

    Model(Viewer viewer) {

        this.viewer = viewer;


        temp = "";
        action = '@';
        leftValue = "";
        rightValue = "";
    }
    public void doAction(String value) {
        if (value.equals("1")) {
            temp = temp + "1";
        } else if (value.equals("2")) {
            temp = temp + "2";
        } else if (value.equals("3")) {
            temp = temp + "3";
        } else if (value.equals("4")) {
            temp = temp + "4";
        } else if (value.equals("5")) {
            temp = temp + "5";
        } else if (value.equals("6")) {
            temp = temp + "6";
        } else if (value.equals("7")) {
            temp = temp + "7";
        } else if (value.equals("8")) {
            temp = temp + "8";
        } else if (value.equals("9")) {
            temp = temp + "9";
        } else if (value.equals("0")) {
            temp = temp + "0";
        } else if (value.equals("Backspace")){
            temp = temp.substring(0,temp.length() -1);
        } else if (value.equals("C")){
            temp = "";
            action = '@';
            leftValue = "";
            rightValue = "";
        } else if(value.equals(",")){
            temp = temp + ',';
        }
        else if (value.equals("+")) {
            action = '+';
            if (!temp.isEmpty()) {
                leftValue = temp;
            }
            temp = "";
            return;
        } else if (value.equals("-")) {
            action = '-';
            if (!temp.isEmpty()) {
                leftValue = temp;
            }
            temp = "";
            return;
        } else if (value.equals("*")) {
            action = '*';
            if (!temp.isEmpty()) {
                leftValue = temp;
            }
            temp = "";
            return;
        } else if (value.equals("(" + ")")) {
            action = '(' + ')';
            if (!temp.isEmpty()) {
                leftValue = temp;
            }
            temp = "";
            return;
        } else if (value.equals("%")) {
            action = '%';
            if (!temp.isEmpty()) {
                leftValue = temp;
            }
            temp = "";
            return;
        } else if (value.equals("/")) {
            action = '/';
            if (!temp.isEmpty()) {
                leftValue = temp;
            }
            temp = "";
            return;
        } else if (value.equals("=")) {
            rightValue = temp;
            double anwser = 0;

            double leftNumber;
            double rightNumber;
            try {
                leftNumber = Double.parseDouble(leftValue);
            } catch (Exception e) {
                // 4,5 => 4.5
                String oneNumber = leftValue.replace(",", ".");
                leftNumber = Double.parseDouble(oneNumber);
            }
            try {
                rightNumber = Double.parseDouble(rightValue);
            } catch (Exception e) {
                String twoNumber = rightValue.replace(",", ".");
                rightNumber = Double.parseDouble(twoNumber);
            }
            switch (action) {
                case '+':
                    anwser = leftNumber + rightNumber;
                    break;
                case '-':
                    anwser = leftNumber - rightNumber;
                    break;
                case '*':
                    anwser = leftNumber * rightNumber;
                    break;
                case '%':
                    anwser = (leftNumber * rightNumber) / 100;
                    break;
                case '/':
                    anwser = leftNumber / rightNumber;
                    break;
            }
            temp = "" + anwser;
            char a = temp.charAt(temp.length() -1);
            char b = temp.charAt(temp.length() -2);
            if ((a == '0') && (b == '.')){
                String text = "";
                for (int i = 0; i < temp.length() -2; i++) {
                    char symbol = temp.charAt(i);
                    text = text + symbol;
                }
                temp = text;
            }
        }
        viewer.update(temp);
    }
}
