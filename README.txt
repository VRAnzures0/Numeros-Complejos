Nombre: Romero Anzures Victor.
Estructura:
El proyecto está estructurado con dos archivos .java.

    1. La interfaz con el nombre ServiciosComplejo.java.
    Que consta de 10 encabezados de métodos que se debían implementar en la clase Complejo.java

    2. La clase que implementa la interfaz con el nombre Complejo.java
    En este segundo se implementaron los metodos que marcaba la intefaz.
        -Primero se creó la clase Complejo para -Cubo (Calcula el cubo de un solo número complejo).poder implementar la intefaz, con los atributos real, imag:
            -Privados para que sus atributos no puedan ser modificados directamente desde otra clase y se utilice algún metodo get/set
            -Double: Pues los números complejos pueden tener decimales.
            -Con esos nombres para denotar la parte real y la parte imaginaria (a la imaginaria se le concatena una "i").
        -Después se tienen los métodos de acceso y mutantes publicos para real, imag.
        -Luego se tienen los métodos pedidos por la interfaz.
            -Suma (utiliza dos complejos).
            -Multiplicación (utiliza dos complejos).
            -Cuadrado (calcula el cuadrado de un solo número complejo).
            -Cubo (Calcula el cubo de un solo número complejo).
            -Conjugado (Calcula el conjugado de un solo número complejo).
            -Inverso (Calcula el inverso multiplicativo de un solo número complejo).
            -Divide (Divide dos números complejos).
            -Módulo (Calcula el módulo de un solo número complejo).
            -esIgual (Si dos números complejos son iguales).
            -muestra (Como el método toString devuele una cadena que se pueda leer).
        -Finalmente se tiene el método main.
            -Con ayuda del método constructor se crean dos objetos.
            -Luego se mandan a llamar los métodos con el primer objeto, y los que necesitan un segundo se le pasa como parámetro.
             y ese resultado se guarda en una variable del tipo que devuelve, ya sea Complejo, boolean o double.
            -Finalmente se imprime.

Inconvenientes:
    -El primer conveniente fue empezar, pues no sabía ni por donde.
    -El segundo inconveniente fue entender el funcionamiento de la intefaz, pues no entendía muy bien de que forma se tenían que
     incluir los encabezados en la clase.
    -El tercer inconveniente fue en los métodos que requieren de mucho cálculo para la parte real y la imaginaria como el cuadrado
     o el cubo, pues en una primera versión del método no cree variables para representar "a", "b", etc, por lo que tenía que escribir
     todo.
    -El utlimo inconveniente fue para el método muestra pues creí que funcionaba igual que el método toString.

Instrucciones para ejecutar:
    -Tener en una sola carpeta los dos archivos Complejo.java y ServiciosComplejo.java
    -En la terminal.
        -Dirigirse a la ruta donde este la carpeta con estos dos archivos.
        -Complilar ambos archivos con el comando:
            javac *.java
        -Ejecutar con el comando.
            java Complejo

AL principio no se utilizó IDE para la realización del proyecto, se estaba editando directamente en Nano de Fedora.
Pero me estaba llevando demasiado tiempo y se cambió a VS Code.
