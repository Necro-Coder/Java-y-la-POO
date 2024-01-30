package Documentation;

import Documentation.Conceptos.SintaxisBasica.TiposDatos.TiposPrimitivos.Primitivos;
import Documentation.Conceptos.SintaxisBasica.Variables.TiposVariables.VariablesDeInstancia;
import Documentation.Conceptos.SintaxisBasica.Variables.TiposVariables.VariablesEstaticas;

public class MainClass {
    public static void main(String[] args) {
        Primitivos primitivos = new Primitivos();
        primitivos.firstExample();

        VariablesDeInstancia variablesDeInstancia = new VariablesDeInstancia();
        String example = variablesDeInstancia.instanceVariable;

        VariablesDeInstancia variablesDeInstancia2 = new VariablesDeInstancia();
        example = variablesDeInstancia2.instanceVariable;

        VariablesEstaticas.staticVariable = "Hola";

    }
}
