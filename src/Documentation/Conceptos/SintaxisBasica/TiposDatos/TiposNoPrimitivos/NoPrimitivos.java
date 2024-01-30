package Documentation.Conceptos.SintaxisBasica.TiposDatos.TiposNoPrimitivos;

import java.util.Random;

public class NoPrimitivos {
    public void firstExample() {
        /*
         * Los tipos no primitivos son aquellos que no son un tipo de dato básico, es decir, que no son un número,
         * un carácter, un booleano o un decimal.
         *
         * Los tipos no primitivos son aquellos que son objetos, como por ejemplo un String, un ArrayList, un
         * HashMap, etc.
         *
         * Para declarar un tipo no primitivo, lo que tenemos que hacer es declarar una variable del tipo de objeto
         * que queramos y luego instanciarlo.
         *
         * Por ejemplo, vamos a declarar un String:
         */
        String name = "Pepe";

        String secondName = new String("Pepe");

        /*
         * Para declarar un String, lo que tenemos que hacer es poner String, el nombre de la
         * variable y luego el valor que queramos que tenga.
         *
         * Ahora vamos a usarlo:
         */
        System.out.println("String:");
        name(name);

        /*
         * Ahora vamos a declarar un Integer:
         */
        Integer number = 0;

        /*
         * Para declarar un Integer, lo que tenemos que hacer es poner Integer, el nombre de la
         * variable y luego el valor que queramos que tenga.
         *
         * Ahora vamos a usarlo:
         */
        System.out.println("Integer:");
        number(number);

        /*
         * Ahora vamos a declarar un Double:
         */
        Double price = 1.4;

        /*
         * Para declarar un Double, lo que tenemos que hacer es poner Double, el nombre de la
         * variable y luego el valor que queramos que tenga.
         *
         * Ahora vamos a usarlo:
         */

        System.out.println("Double:");
        price(price);

        /*
         * Ahora vamos a declarar un Boolean:
         */
        Boolean isSold = false;

        /*
         * Para declarar un Boolean, lo que tenemos que hacer es poner Boolean, el nombre de la
         * variable y luego el valor que queramos que tenga.
         *
         * Ahora vamos a usarlo:
         */

        System.out.println("Boolean:");
        isSold(isSold);

        /*
         * Ahora vamos a declarar un Character:
         */
        Character character = 'a';

        /*
         * Ahora vamos a declarar un Float:
         */
        Float secondPrice = 1.5f;

        /*
         * Hay muchos tipos de datos no primitivos, pero de momento para ver que son distintos podemos
         * quedarnos con estos ejemplos. Más adelante veremos más tipos de datos no primitivos a medida
         * que vayamos necesitando usarlos.
         */
    }

    private void name(String name) {
        /*
         * Un String es una cadena de caracteres, es decir, una palabra o una frase.
         */
        System.out.println("Name: " + name);

        name = "Juan";
        System.out.println("Name: " + name);

        /*
         * Aquí podemos ver que podemos cambiar el valor de un String sin problemas.
         *
         * Los String los veremos más detenidamente en el apartado de Cadenas.
         */
    }

    private void number(Integer number) {
        /*
         * Un Integer es lo mismo que un int. Pero ahora tenemos otro tipo de funcionalidades añadidas con la
         * clase Integer.
         */

        number = number.compareTo(0);
        System.out.println("Number compared to 0: " + number);

        /*
         * Aquí podemos ver que podemos usar el método compareTo para comparar un Integer con otro Integer.
         *
         * Para poder ver las funcionalidades que tiene un Integer, lo que tenemos que hacer es poner el nombre
         * de la variable, un punto y luego pulsar Ctrl + Espacio.
         */

        /*
        * Podemos hacer muchas cosas, pero lo mejor es que vayamos usando las distintas funcionalidad
        * a medida que vayamos necesitando usarlas. De momento probar si queréis más de las funciones que
        * nos proporciona la clase Integer.
        */
    }

    private void price(Double price) {
        /*
         * Un Double es lo mismo que un double. Pero ahora tenemos otro tipo de funcionalidades añadidas con la
         * clase Double.
         *
         * No hay mucho más que hacer en esta función así que simplemente voy a crear un número, voy a convertirlo
         * a double y luego voy a usarlo para compararlos.
         */
        Integer number = 0;
        Double numberDouble = number.doubleValue();
        int comparison = price.compareTo(numberDouble);
        System.out.println("Price compared to number: " + comparison);

        /*
         * Aquí podemos ver que podemos usar el método compareTo para comparar un Double con un Integer.
         *
         * Para poder ver las funcionalidades que tiene un Double, lo que tenemos que hacer es poner el nombre
         * de la variable, un punto y luego pulsar Ctrl + Espacio.
         */
    }

    private void isSold(Boolean isSold) {
        /*
         * Un Boolean es lo mismo que un boolean. Pero ahora tenemos otro tipo de funcionalidades añadidas con la
         * clase Boolean.
         *
         * No hay mucho más que hacer en esta función así que simplemente voy a crear un número, voy a convertirlo
         * a boolean y luego voy a usarlo para compararlos.
         */
        Random random = new Random();
        Integer number = random.nextInt();
        Boolean numberBoolean = number.equals(0);
        int comparison = isSold.compareTo(numberBoolean);
        System.out.println("IsSold compared to number: " + comparison);

        /*
         * Aquí podemos ver que podemos usar el método compareTo para comparar un Boolean con un Integer.
         *
         * Para poder ver las funcionalidades que tiene un Boolean, lo que tenemos que hacer es poner el nombre
         * de la variable, un punto y luego pulsar Ctrl + Espacio.
         */

        /*
        * La clase Random la veremos más detenidamente más adelante, pero de momento lo que hace es generar
        * un número aleatorio.
        */
    }
}
