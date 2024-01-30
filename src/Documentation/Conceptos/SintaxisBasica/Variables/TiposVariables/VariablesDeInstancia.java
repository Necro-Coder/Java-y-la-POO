package Documentation.Conceptos.SintaxisBasica.Variables.TiposVariables;

public class VariablesDeInstancia {
    public String instanceVariable;
    public int numericInstanceVariable;

    public void firstExample() {
        /*
         * Las variables de instancia son aquellas que se declaran dentro de una clase, pero fuera de un método, es
         * decir, que se pueden usar en cualquier método de la clase.
         *
         * Por ejemplo, vamos a declarar una variable de instancia:
         */
        instanceVariable = "Hola";
        numericInstanceVariable = 0;
    }
}
