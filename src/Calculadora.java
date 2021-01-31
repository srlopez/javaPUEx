import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    // Devuelve el valor con 2 decimales
    private double to2dec(double valor) {
        return Math.floor(valor * 100) / 100d;
    }

    // f1
    // Devuelve el valor de una palabra
    // Uuunoo, UNO, 1, UnnnO ->
    // etc... hasta 9
    public int valorDeUnaPalabra(String text) {
        List<String> nombres = new ArrayList<>(
                List.of("cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"));

        int valor = 0;
        String textNormalizado = text.trim().toLowerCase();
        // Verificamos si es un numero entero
        try {
            valor = Integer.parseInt(textNormalizado);
            valor = valor > 9 ? 0 : valor;
        } catch (Exception e) {
            valor = 0;
        }
        if (valor == 0) {
            // verificamos que es un nombre reconocido
            // https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
            // https://stackoverflow.com/questions/106067/regular-expression-to-replace-two-or-more-consecutive-characters-by-only-one
            // reemplaza cualquier carácter que aparece más de una vez, por él mismo.
            textNormalizado = textNormalizado.replaceAll("(.)\\1+", "$1");
            valor = nombres.indexOf(textNormalizado);
            valor = valor < 0 ? 0 : valor;
        }
        return valor;
    }

    // f2: invoca a f1
    // Devuelve una Lista de Enteros
    // Obtenida por valorar cada palabra en un String
    // Unnooo dos 3 fin -> 1,2,3,0
    public List<Integer> valoresDeVariasPalabras(String text) {
        List<Integer> valores = new ArrayList<Integer>();

        String[] textos = text.trim().split("\\s+");
        for (int i = 0; i < textos.length; i++) {
            valores.add(valorDeUnaPalabra(textos[i]));
        }

        return valores;
    }

    // f3
    // Devuelve una Lista de valores dobles proporcionales a
    // Una Lista de Enteros y un valor Total entero
    public List<Double> valoresProporcionalesDeUnaListaInteger(List<Integer> valores, int total) {
        List<Double> proporciones = new ArrayList<Double>();

        int totalValores = 0;
        for (int v : valores)
            totalValores += v;

        for (int i = 0; i < valores.size(); i++) {
            double d = (total * valores.get(i)) / (double) totalValores;
            proporciones.add(to2dec(d));
        }

        return proporciones;
    }

    // f4: invoca a f3 y f2
    // Devuelve una Lista de valores dobles proporcionales a
    // Una Lista de Enteros obtenida por valorar cada palabra en un String, y un valor Total entero
    public List<Double> valoresProporcionalesDeVariasPalabras(String texto, int total) {
        List<Integer> valores = valoresDeVariasPalabras(texto);
        List<Double> proporciones = valoresProporcionalesDeUnaListaInteger(valores, total);
        return proporciones;
    }
}
