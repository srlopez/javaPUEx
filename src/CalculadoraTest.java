import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculadoraTest {

    // Mostramos como hacer este test parametrizado.
    // @Test
    @ParameterizedTest
    @DisplayName("UNO->1")
    @ValueSource(strings = { " uunNOo "," uNo", "UNO ", "  uNO  ", " 1 " })
    void deTextoAValor1(String txt) {
        // 1 - preracion del test
        Calculadora calc = new Calculadora();
        // 2 - Ejecutar lo que vamos a validar
        int result = calc.valorDeUnaPalabra(txt);
        // 3 - Aserciones
        assertEquals(1, result, result + "->" + txt);
    }

    //Similar para DOS, TRES, etc...

    @Test
    @DisplayName("De Texto a Lista de valores #1")
    void deTextoAValores1() {
        // 1 - preracion del test
        Calculadora calc = new Calculadora();
        // 2 - Ejecutar lo que vamos a validar
        String texto = " Hey  uNo  dOs  sEIs 3 santi ";
        List<Integer> result = calc.valoresDeVariasPalabras(texto);
        // 3 - Aserciones
        List<Integer> valoresEsperados = new
        ArrayList<Integer>(Arrays.asList(0,1,2,6,3,0));
        assertEquals(valoresEsperados, result);
    }

    @Test
    @DisplayName("De Lista de valores y total a Proporciones #1")
    void deValoresAProporciones1() {
        // 1 - preracion del test
        Calculadora calc = new Calculadora();
        // 2 - Ejecutar lo que vamos a validar
        List<Integer> valores = new ArrayList<Integer>(Arrays.asList(0, 7, 9, 3, 5));
        int total = 660;
        List<Double> result = calc.valoresProporcionalesDeUnaListaInteger(valores, total);
        // 3 - Aserciones
        List<Double> valoresEsperados = new ArrayList<Double>(Arrays.asList(0.66, 1.33, 4.0));
        assertEquals(valoresEsperados, result);
    }

    @Test
    @DisplayName("De Lista de valores y total a Proporciones #2")
    void deValoresAProporciones2() {
        // 1 - preracion del test
        Calculadora calc = new Calculadora();
        // 2 - Ejecutar lo que vamos a validar
        List<Integer> valores = new ArrayList<Integer>(Arrays.asList(6, 2, 1));
        int total = 60;
        List<Double> result = calc.valoresProporcionalesDeUnaListaInteger(valores, total);
        // 3 - Aserciones
        List<Double> valoresEsperados = new ArrayList<Double>(Arrays.asList(40d, 13.33, 6.66));

        assertEquals(valoresEsperados, result);
    }


    @Test
    @DisplayName("De Textos y total a Proporciones #1")
    void deTextosAProporciones1() {
        // 1 - preracion del test
        Calculadora calc = new Calculadora();
        // 2 - Ejecutar lo que vamos a validar
        String texto ="  2  Uno  sEIs  ";
        int total = 60;
        List<Double> result = calc.valoresProporcionalesDeVariasPalabras(texto,total);
        // 3 - Aserciones
        List<Double> valoresEsperados = new ArrayList<Double>(Arrays.asList( 13.33, 6.66, 40d));

        assertEquals(valoresEsperados, result);
    }

    
    @DisplayName("Parameterized Test con CSV")
    @ParameterizedTest(name = "run #{index}: '{0} -> {1}€/{2} monedas")
    // "String de textos, total, String del array resultado"
    @CsvSource (value = {
        "  1DAW3  SiEtE  nueeVVE  3 cinco : 660:  0, 192.5, 247.5, 82.5, 137.5",
        "  1 2 3 4: 100:  10, 20, 30, 40",
        "  unnoooo  dos 3 CUATRO fin  : 15:  1.5, 3.0, 4.5, 6.0, 0.0",
        "  UuunnnOOO  DOs  SSeiSS  : 60:  6.66, 13.33, 40.0 ",
        "  Cerooo  0  1  99: 60:  0, 0, 60, 0 ",
            }, delimiter = ':')
    void testEfectivoStringCSV(String  texto, int total, String doblesCSV) {
        Calculadora calc = new Calculadora();
        //
        String[] sdobles = doblesCSV.replaceAll("\\s+", "").split(",");
        List<Double> valoresEsperados = new ArrayList<Double>();
        for (int i = 0; i<sdobles.length; i++) valoresEsperados.add(Double.valueOf(sdobles[i]));
        //
        List<Double> result = calc.valoresProporcionalesDeVariasPalabras(texto,total);
        //
        assertEquals(valoresEsperados, result, valoresEsperados + "<-'"+texto+"'");
    }




}