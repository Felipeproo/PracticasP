class PruebaFinally {
    static void metodo1() {
        try {
            System.out.println("En el método1");
            throw new RuntimeException("metodo1");
        } finally {
            System.out.println("finally del método1");
        }
    }

    static void metodo2() {
        try {
            System.out.println("En el método2");
            return;
        } finally {
            System.out.println("finally del método2");
        }
    }

    static void metodo3() {
        try {
            System.out.println("En el método3");
        } finally {
            System.out.println("finally del método3");
        }
    }

    public static void main(String args[]) {
        try {
            metodo1();
        } catch (Exception e) {
            System.out.println("Excepción capturada");
        }
        metodo2();
        metodo3();
    }
}