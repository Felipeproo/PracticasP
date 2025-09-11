class TryAnidado {
    public static void main(String args[]) {
        try {
            int c = args.length;
            int a = 10 / c;
            System.out.print("a = " + a);

            try {
                if (c == 1) a = a / (c - 1);
                if (c == 2) {
                    int[] b = {100, 5};
                    b[3] = 0; // fuera de límites
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Segunda excepción. Índice fuera de límites: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Primera excepción. División por cero: " + e);
        }
    }
}