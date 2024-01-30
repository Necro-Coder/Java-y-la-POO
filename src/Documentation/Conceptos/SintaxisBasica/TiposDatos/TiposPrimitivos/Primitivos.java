package Documentation.Conceptos.SintaxisBasica.TiposDatos.TiposPrimitivos;

public class Primitivos {
    public void firstExample() {
        /*
         * Lo primero que vamos a declarar es una serie de variables para que veáis cómo se declaran.
         */
        int number = 0;
        char character = 'a';
        float price = 1.4F;
        double secondPrice;
        boolean isSold = false;

        /*
         * A parte de esto existen los tipos byte, short y long, que no vamos a tratar.
         */
        /*
         * Como podéis comprobar, las variables siempre se declaran con la primera letra en minúscula, quitando
         * escepciones.
         *
         * Estas variables cuando las declaráis podéis darle un valor o no (como podéis ver, secondPrice no tiene
         * valor por defecto). Si no especificáis el valor de una variable por defecto tenéis que aseguraros
         * de que le asignáis un valor más adelante, sino os dará un NullReferenceException de Java, lo que viene a
         * decir que estás intentando usar el contenido de un espacio en memoria donde no hay contenido.
         *
         * Ahora vamos a usar estas variables.
         */

        //Método para int
        System.out.println("int:");
        number(number);

        //Metodo para char
        System.out.println("char:");
        character(character);

        //Metodo para float
        System.out.println("float:");
        price(price);

        //Metodo para double
        System.out.println("double:");
        secondPrice = 1.5;
        secondPrice(secondPrice);

        //Metodo para boolean
        System.out.println("bool:");
        isSold(isSold);

    }

    private void number(int number) {
        /*
         * Un int es un número entero, es decir, no tiene decimales. Puede ser positivo o negativo.
         */
        number = number + 10;
        System.out.println("Number plus 10: " + number);

        number = 0;
        System.out.println("Number equals 0: " + number);
        number += 10;
        System.out.println("Number plus 10: " + number);
        number -= 4;
        System.out.println("Number minus 4: " + number);
        number /= 2;
        System.out.println("Number divided by 2: " + number);
        number %= 2;
        System.out.println("The remainder of dividing number by 2: " + number);

        number++;
        System.out.println("Number plus 1: " + number);
        number--;
        System.out.println("Number minus 1: " + number);

        /*
         * Aquí podemos ver el trato con los números, primero os enseño que llamando de nuevo a la variable
         * y sumando un número lo hace perfectamente.
         *
         * Pero luego nos vamos a complicarlo un poco más y os enseño cómo se puede hacer directamente sin
         * necesidad de volver a llamar a la variable.
         *
         * Esas son las operaciones básicas que se pueden hacer con este tipo de datos.
         *
         * Al final os explico cómo se puede también sumar o restar uno a una variable.
         */
    }

    private void character(char character) {
        /*
         * Un char es un carácter, es decir, una letra, un número o un símbolo. Solo puede ser la representación
         * de un caracter, no de una palabra.
         */
        System.out.println("Original character: " + character);
        character = 'b';
        System.out.println("Character changed to: " + character);
        /*
         * Aquí podemos ver el trato con los caracteres, primero os enseño el carácter original.
         * Luego, cambio el carácter a 'b' y lo muestro.
         */
    }

    private void price(float price) {
        /*
         * Un float es un número con decimales, es decir, puede ser positivo o negativo y puede tener decimales.
         * La F al final es para indicar que es un float, sino lo pones, Java lo considera un double.
         *
         * La pricipal diferencia con un double es que un float ocupa menos espacio en memoria, pero tiene menos
         * precisión de decimales.
         */
        System.out.println("Original price: " + price);
        price += 0.6F;
        System.out.println("Price after adding 0.6: " + price);
        /*
         * Aquí podemos ver el trato con los precios (float), primero os enseño el precio original.
         * Luego, añado 0.6 al precio y lo muestro.
         *
         * Las funcionalidades con los float son iguales que los number que tenéis en el ejemplo arriba.
         */
    }

    private void secondPrice(double secondPrice) {
        System.out.println("Original second price: " + secondPrice);
        secondPrice *= 2;
        System.out.println("Second price after doubling: " + secondPrice);
        /*
         * Aquí podemos ver el trato con los precios secundarios (double), primero os enseño el precio secundario original.
         * Luego, duplico el precio secundario y lo muestro.
         *
         * Las funcionalidades con los double son iguales que los number que tenéis en el ejemplo arriba.
         */
    }

    private void isSold(boolean isSold) {
        /*
         * Un boolean es un valor que solo puede ser true o false, es decir, verdadero o falso.
         *
         * La principal utilidad de los booleanos es para comprobar si algo es cierto o no.
         */
        System.out.println("Original isSold: " + isSold);
        isSold = !isSold;
        System.out.println("isSold after negation: " + isSold);
        /*
         * Aquí podemos ver el trato con los booleanos, primero os enseño el valor original de isSold.
         * Luego, niego el valor de isSold y lo muestro.
         */
    }
}
