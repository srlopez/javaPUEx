import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    // Devuelve el valor con 2 decimales
    private double to2dec(double valor) {
        return Math.floor(valor * 100) / 100d;
    }

    public int valorDeUnaPalabra(String text) {
        List<String> nombres = new ArrayList<>(
                List.of("cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"));

        String textValid = text.toLowerCase().trim();
        int idx = nombres.indexOf(textValid);
        return idx < 0 ? 0 : idx;
    }

    public List<Integer> valoresDeVariasPalabras(String text) {
        List<Integer> valores = new ArrayList<Integer>();

        String[] textos = text.trim().split("\\s+");
        for (int i = 0; i < textos.length; i++) {
            valores.add(valorDeUnaPalabra(textos[i]));
        }

        return valores;
    }

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

    public List<Double> valoresProporcionalesDeVariasPalabras(String texto, int total) {
        List<Integer> valores = valoresDeVariasPalabras(texto);
        List<Double> proporciones = valoresProporcionalesDeUnaListaInteger(valores, total);
        return proporciones;
    }
}
