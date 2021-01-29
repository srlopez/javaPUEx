import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculadoraTest {

    // Mostramos como hacer este test parametrizado.
    // @Test
    @ParameterizedTest
    @DisplayName("UNO->1")
    @ValueSource(strings = { " uNo", "UNO ", "  uNO  " })
    void deTextoAValor1(String txt) {
        // 1 - preracion del test
        Calculadora calc = new Calculadora();
        // 2 - Ejecutar lo que vamos a validar
        int result = calc.valorDeUnaPalabra(txt);
        // 3 - Aserciones
        assertEquals(1, result, result + "->" + txt);
    }

    //Similara para DOS, TRES, etc...

    @Test
    @DisplayName("De Texto a Lista de valores1")
    void deTextoAValores1() {
        // 1 - preracion del test
        Calculadora calc = new Calculadora();
        // 2 - Ejecutar lo que vamos a validar
        String texto = "Hey uNo dOs sEIs santi";
        List<Integer> result = calc.valoresDeVariasPalabras(texto);
        // 3 - Aserciones
        List<Integer> valoresEsperados = new
        ArrayList<Integer>(Arrays.asList(0,1,2,6,0));
        assertEquals(valoresEsperados, result);
    }

    @Test
    @DisplayName("De Lista de valores y total a Proporciones1")
    void deValoresAProporciones1() {
        // 1 - preracion del test
        Calculadora calc = new Calculadora();
        // 2 - Ejecutar lo que vamos a validar
        List<Integer> valores = new ArrayList<Integer>(Arrays.asList(1, 2, 6));
        int total = 6;
        List<Double> result = calc.valoresProporcionalesDeUnaListaInteger(valores, total);
        // 3 - Aserciones
        List<Double> valoresEsperados = new ArrayList<Double>(Arrays.asList(0.66, 1.33, 4.0));
        assertEquals(valoresEsperados, result);
    }

    @Test
    @DisplayName("De Lista de valores INT y total a Proporciones2 DOUBLES")
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
    @DisplayName("De Textos y total a Proporciones1")
    void deTextosAProporciones() {
        // 1 - preracion del test
        Calculadora calc = new Calculadora();
        // 2 - Ejecutar lo que vamos a validar
        String texto ="  DOS  Uno  sEIs  ";
        int total = 60;
        List<Double> result = calc.valoresProporcionalesDeVariasPalabras(texto,total);
        // 3 - Aserciones
        List<Double> valoresEsperados = new ArrayList<Double>(Arrays.asList( 13.33, 6.66, 40d));

        assertEquals(valoresEsperados, result);
    }
}