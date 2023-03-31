class Fraccion {
    private int numerador;
    private int denominador;


    public Fraccion (int numerador, int denominador) throws FractionException {
        if (denominador == 0) {
            throw new FractionException("No se puede crear una instancia de una fracción con denominador 0");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion sumar ( Fraccion dos) throws FractionException {
        int comun = denominador * dos.denominador;
        int num = numerador * dos.denominador + denominador * dos.numerador;
        return new Fraccion(num, comun);
    }

    public Fraccion restar (Fraccion dos) throws FractionException {
        int comun = denominador * dos.denominador;
        int num = numerador * dos.denominador - denominador * dos.numerador;
        return new Fraccion(num, comun);
    }

    public Fraccion multiplicar(Fraccion otra) throws FractionException {
        int num = numerador * otra.numerador;
        int den = denominador * otra.denominador;
        return new Fraccion(num, den);
    }

    public Fraccion dividir(Fraccion otra) throws FractionException {
        if (otra.numerador == 0) {
            throw new FractionException("Esta operación da como resultado una fracción no válida");
        }
        int num = numerador * otra.denominador;
        int den = denominador * otra.numerador;
        return new Fraccion(num, den);
    }

    public String toString() {
        return numerador + "/" + denominador;
    }
}