import java.util.Scanner;

public class operaciones {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int operando1, operando2,op=1;
        String cadena1;
        while (op!=0) {
            System.out.print("Captura operacion: ");
            cadena1 = reader.nextLine();
            op=0;
            if (cadena1.equals("SUMA")) {
                System.out.print("Operando 1: ");
                operando1 = reader.nextInt();
                System.out.print("Operando 2: ");
                operando2 = reader.nextInt();
                System.out.print(operando1 + " + " + operando2 + " = ");
                System.out.println(operando1 + operando2);
                op=1;
                reader.nextLine();
            }
             if (cadena1.equals("RESTA")) {
                System.out.print("Operando 1: ");
                operando1 = reader.nextInt();
                System.out.print("Operando 2: ");
                operando2 = reader.nextInt();
                System.out.print(operando1+" - "+operando2+" = ");
                System.out.println(operando1-operando2);
                 op=1;
                 reader.nextLine();
            }
            if (cadena1.equals("MULTIPLICACION")) {
                System.out.print("Operando 1: ");
                operando1 = reader.nextInt();
                System.out.print("Operando 2: ");
                operando2 = reader.nextInt();
                System.out.print(operando1 + " * " + operando2 + " = ");
                System.out.println(operando1 * operando2);
                op=1;
                reader.nextLine();
            }
            if (cadena1.equals("DIVISION")) {
                float operand1,operand2;
                System.out.print("Operando 1: ");
                operand1= reader.nextFloat();
                System.out.print("Operando 2: ");
                operand2= reader.nextFloat();
                System.out.print(operand1+" / "+operand2+" = ");
                System.out.println(operand1/operand2);
                op=1;
                reader.nextLine();
            }

        }
        System.out.println("Operacion no soportada" );
    }
}
