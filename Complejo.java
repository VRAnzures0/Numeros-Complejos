public class Complejo implements ServiciosComplejo{
    private double real;
    private double imag;
    //Método constructor.
    public Complejo (double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    //Metodo de acceso para la parte real.
    public double getReal(){
        return this.real;
    }
    //Metodo mutante para la parte real.
    public void setReal (double real){
        this.real = real;
    }
    //Metodo de acceso para el imaginario.
    public double getImag(){
        return this.imag;
    }
    //Metodo mutante para el imaginario.
    public void setImag(double imag){
        this.imag = imag;
    }
    //Metodo de suma
    public Complejo suma (Complejo otro){
        double parteReal = this.real + otro.real;
        double parteImag = this.imag + otro.imag;
        return new Complejo (parteReal, parteImag);
    }
    //Metodo de multiplicación.
    public Complejo multiplica (Complejo otro){
        double a = this.real;
        double b = this.imag;
        double c = otro.real;
        double d = otro.imag;
        double parteReal = (a * c) - (b * d);
        double parteImag = (a * d) + (b * c);
        return new Complejo (parteReal, parteImag);
    }
    //Método para el cuadrado.
    public Complejo cuadrado (){
        double a = this.real;
        double b = this.imag;
        double parteReal = (a * a) - ((b * b));
        double parteImag = (a * b) + (a * b);
        return new Complejo (parteReal, parteImag);
    }
    // Método para el cubo.
    public Complejo cubo (){
        double a = this.real;
        double b = this.imag;
        double parteReal = (a * a * a) - (3 * a * (b * b));
        double parteImag = (3*(a * a) * b) - (b * b * b);
        return new Complejo (parteReal, parteImag);
    }
    //Método para el complejo conjugado.
    public Complejo conjugado (){
        double parteReal = this.real;
        double parteImag = this.imag * (-1);
        return new Complejo (parteReal, parteImag);
    }
    //Metodo para el inverso multiplicativo.
    public Complejo inverso (){
        double a = this.real;
        double b = this.imag;
        double parteReal = (a) / ((a*a)+(b*b));
        double parteImag = - (b) / ((a*a)+(b*b));
        return new Complejo (parteReal, parteImag);
    }
    //Metodo para la división de dos complejos.
    public Complejo divide (Complejo otro){
        Complejo inversoOtro = otro.inverso();
        double a = this.real;
        double b = this.imag;
        double c = inversoOtro.real;
        double d = inversoOtro.imag;
        double parteReal = (a * c) - (b * d);
        double parteImag = (a * d) + (b * c);
        return new Complejo (parteReal, parteImag);
    }
    //Método para el módulo de un complejo.
    public double modulo (){
        double a = this.real;
        double b = this.imag;
        return Math.sqrt((a*a)+(b*b));
    }
    //Método para ver si dos complejos son iguales.
    public boolean esIgual (Complejo otro){
        double a = this.real;
        double b = this.imag;
        double c = otro.real;
        double d = otro.imag;
        return a == c && b == d;
    }
    //Método muestra para que se vea bien las cosas.
    public String muestra(){
    if (imag >= 0) {
        return real + " + " + imag + "i";
    } else {
        return real + " - " + imag + "i";
    }
}
    public static void main (String[] args){
        //Creación de dos objetos de tipo Complejo.
        Complejo complejo1 = new Complejo (-12, 10);
        Complejo complejo2 = new Complejo (19, 4);
        System.out.println ("Los complejos que se utilizarán son: " + complejo1.muestra() + " y " + complejo2.muestra());
        System.out.println ("----------------------------------------------------------------");

        Complejo suma = complejo1.suma(complejo2);
        System.out.println ("LA SUMA DE ESTOS ES:");
        System.out.println (suma.muestra());
        System.out.println (" ");

        Complejo multiplicacion = complejo1.multiplica(complejo2);
        System.out.println ("LA MULTIPLICACIÓN DE ESTOS ES:");
        System.out.println (multiplicacion.muestra());
        System.out.println (" ");

        Complejo cuadrado = complejo1.cuadrado();
        System.out.println ("EL CUADRADO DE " + complejo1.muestra() + " ES:");
        System.out.println (cuadrado.muestra());
        System.out.println (" ");

        Complejo cubo = complejo1.cubo();
        System.out.println ("EL CUBO DE " + complejo1.muestra() + " ES:");
        System.out.println (cubo.muestra());
        System.out.println (" ");

        Complejo conjugado = complejo1.conjugado();
        System.out.println ("EL CONJUGADO DE " + complejo1.muestra() + " ES:");
        System.out.println (conjugado.muestra());
        System.out.println (" ");

        Complejo inverso = complejo1.inverso();
        System.out.println ("EL INVERSO MULTIPLICATIVO DE " + complejo1.muestra() + " ES:");
        System.out.println (inverso.muestra());
        System.out.println (" ");

        Complejo division = complejo1.divide(complejo2);
        System.out.println ("LA DIVISIÓN DE ESTOS ES:");
        System.out.println (division.muestra());
        System.out.println (" ");

        double modulo = complejo1.modulo();
        System.out.println ("EL MÓDULO DE " + complejo1.muestra() + " ES:");
        System.out.println (modulo);
        System.out.println (" ");

        boolean esIgual = complejo1.esIgual(complejo2);
        System.out.println ("¿ESTOS DOS COMPLEJOS SON IGUALES?");
        System.out.println (esIgual);
        System.out.println (" ");

    }
}