class PruebaFraccion {
    public static void main(String[] args) {

        try { // unicamente da un error en caso de que sea 0
            Fraccion f1 = new Fraccion(3, 4);
            Fraccion f2 = new Fraccion(1, 0);
        } catch (FractionException e) {
            System.out.println(e.getMessage());
        }

        try { // sumar f1 con f2
            Fraccion f1 = new Fraccion(1, 2);
            Fraccion f2 = new Fraccion(3, 4);

            Fraccion resultado = f1.sumar(f2);

            System.out.println("La suma es: " + resultado); // 10/8

        } catch (FractionException e) {
            System.out.println(e.getMessage());
        }

        try {
            Fraccion f1 = new Fraccion(1, 2);
            Fraccion f2 = new Fraccion(3, 4);
            Fraccion f3 = f1.restar(f2);

            System.out.println("La resta es: " + f3);

        } catch (FractionException e) {
            System.out.println(e.getMessage());
        }

        try {
            Fraccion f1 = new Fraccion(1, 2);
            Fraccion f2 = new Fraccion(3, 4);
            Fraccion f3 = f1.multiplicar(f2);

            System.out.println("La multiplicación es: " + f3); // "3/8"

        } catch (FractionException e) {
            System.out.println(e.getMessage());
        }

        try {
            Fraccion f1 = new Fraccion(1, 2); // 0,5
            Fraccion f2 = new Fraccion(0, 1); // 0,5/0 = error

            Fraccion f3 = f1.dividir(f2);

            System.out.println("La división es: " + f3);

        } catch (FractionException e) {
            System.out.println(e.getMessage()); // Error de division no valida
        }
    }
}
