package Documentation.Conceptos.SintaxisBasica.Variables.TiposVariables;

public class VariablesLocales {
    public void firstExample() {
        /*
         * Las variables locales son aquellas que se declaran dentro de un método, es decir, que solo se pueden usar
         * dentro de ese método.
         *
         * Por ejemplo, vamos a declarar una variable local:
         */
        int number = 0;

        System.out.println("Number:");
        number(number);
    }

    private void number(int number) {
        /*
         * Como podéis ver, la variable number solo se puede usar dentro de este método, si intentamos usarla fuera
         * de este método nos dará un error.A
         */
        number = number + 10;
        System.out.println("Number plus 10: " + number);

        number = 0;
        System.out.println("Number equals 0: " + number);
    }
}
