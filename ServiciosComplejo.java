/**
* Los servicios que debe ofrecer un número complejo
* de la forma a + bi
*/
public interface ServiciosComplejo{
/**
* Suma dos números complejos y entrega el resultado .
*
* @param otro El segundo complejo (El primero es el
* objeto con que se invoca ).
* @return El complejo que corresponde a:
*
* (a + bi) + (c + di) = (a + c) + (b + d)i
*/
public Complejo suma ( Complejo otro );
/**
* Multiplica dos números complejos y entrega el resultado .
*
* @param otro El segundo complejo (El primero es el
* objeto con que se invoca ).
* @return El complejo que corresponde a:
*
* (a + bi) ∗ (c + di) = (ac − bd) + (ad + bc)i
*/
public Complejo multiplica ( Complejo otro );
/**
* Calcula el cuadrado del complejo con que se invoca .
*
* @return El complejo que corresponde a:
*
* (a + bi)²
*/
public Complejo cuadrado ();
/**
* Calcula el cubo del complejo con que se invoca .
*
* @return El complejo que corresponde a:
*
* (a + bi)³
*/
public Complejo cubo ();
/**
* // * Calcula el conjugado del complejo con que se invoca .
*
* @return El complejo que corresponde a:
*
* a + bi = a − bi
*/
public Complejo conjugado ();
/**
* Calcula el inverso multiplicativo del complejo con que se
* invoca .
*
* @return El complejo que corresponde a:
*
* (a + bi)^-1 = a + bi / a² + b²
*/
public Complejo inverso ();
/**
* Divide dos números complejos y entrega el resultado .
*
* @param otro El segundo complejo (El primero es el
* objeto con que se invoca ).
* @return El complejo que corresponde a:
*
*  a + bi / c + di = (a + bi) ∗ (c + di)^−1
*/
public Complejo divide ( Complejo otro );
/**
* Calcula el módulo del complejo con que se invoca .
*
* @return El complejo que corresponde a:
*
* |a + bi| = √(a² + b²)
*
* Puedes utilizar el método de clase Math . sqrt ( double )
*/
public double modulo ();
/**
* Compara dos números complejos para saber si son iguales .
*
* @param otro El segundo complejo (El primero es el
* objeto con que se invoca ).
* @return true si son iguales , false en otro caso .
*
* a = c y b = d ⇒ (a + bi) = (c + di)
*/
public boolean esIgual ( Complejo otro );
/**
* Devuelve una cadena en formato adecuado que representa al
* complejo que invoca el método .
*
* @return Una cadena con formato adecuado .
*/
public String muestra ();
}