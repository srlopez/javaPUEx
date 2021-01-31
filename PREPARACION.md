
### Conceptos básicos necesarios
- Regla de 3
  y su inversa

### Conceptos de programación
- Clase
```java
  // Definición
  public class Calculadora {
     // constructor <- inicializa la clase
  }
  // Instanciación
  Calculadora calc = new Calculadora();
```
- Método y/o Función. Publico y privado.
```java
  // Devuelve el valor con 2 decimales
  // Metodo 
  private double to2dec(double valor) {
    return Math.floor(valor * 100) / 100d;
  }
```
- Parametros en las funciones: tipos básicos, Objetos y/o ArrayLists
```java
    void metod1 (int i, String s, Fraccion f, int[] enteros, List<Doubles> dobles){

    }
```
- Retorno de funciones: tipos básicos, Objetos y/o ArrayLists
```java
    return ...
```
- Condicionales if/switch, ternario ?; y ciclos for/while
```java
  if(){...}
  if(){...}else{...}
  if(){...}else if(){...}
  String valor =  1<4?"cierto":"falso";
  for(int i=0, j=0; (?) ;i++, j++ ){...}, while(){...}
  for (int v : valores) t += v;
  try{···}catch(e){···}
```
- ArrayList/Array <- Conversiones y Declaraciones, Metodos
```java
  // Declaraciones e inicialización
  List<Double> nds; //nulo
  List<Double> nds = new ArrayList<Double>(); // creado
  List<Double> nds = new ArrayList<Double>(List.of(5d,6d,7d)); // establecido con valores
  List<String> dias = new ArrayList<>(
                List.of("lunes", "martes", ..., "domingo")); //Estblecido con strings
  
  // Conversion
  // De array a List
  int[] ints = {1, 2, 3};
  List<Integer> intList = new ArrayList<Integer>(ints.length);
  for (int i : ints) intList.add(i);

  // De List a array
  List<Integer> list = new ArrayList<Integer>(List.of(5,6,7));;
  int[] array = new int[list.size()];
  for(int i = 0; i < list.size(); i++) array[i] = list.get(i);

  // Metodos sobre List
  list.size()
  list.add(v)
  v = list.get(i)
  b = list.isEmpty()
  list.clear()
  b = list.contains(v)
  i = list.indexOf(v)

```
- Manejo de strings; split, toLower, ...
```java
  text.toLowerCase()
  text.trim();  //trip()
  text.substring(3,6);
  text.replace("bb", "DGDG")
  String[] strs = text.split(";")  // obtenemos los textos que se separan por ";"
  text.length()
  String[] textos = text.trim().split("\\s+");
  textNormalizado = textNormalizado.replaceAll("(.)\\1+", "$1");
  i = Integer.parseInt(textNormalizado)

```
- Recursividad
```java
static int sumar(int[] valores) {
    if (valores.length < 1) return 0;
    if (valores.length == 1) return valores[0];

    int[] copia = new int[valores.length - 1];
    System.arraycopy(valores, 1, copia, 0, copia.length);

    return valores[0] + sumar(copia);
}
```

### JUnit5

````java
@Test
@DisplayName("texto bonito")
void funcionNombre() {
    // 1 - preracion del test
    Calculadora calc = new Calculadora();
    // 2 - Ejecutar lo que vamos a validar
    resultado = 
    // 3 - Aserciones
    assertEquals(loEsperado, resultado);
}

@ParameterizedTest
@DisplayName("multiplo 3")
@ValueSource(ints = {3,6,33,99 })
//@ValueSource(strings = { "a", "b", "c" })
void deTextoAValor1(int parametro) {
    // 1 - preracion del test
    Calculadora calc = new Calculadora();
    // 2 - Ejecutar lo que vamos a validar
    int result = 
    // 3 - Aserciones
    assertEquals(3, result, result + "->" + parametro);
}

@Before
public void init() {
    list = new ArrayList<>(Arrays.asList("test1", "test2"));
}

@BeforeEach 
void init() {
    list.add("teste3");
}
```

## plantilla

```
ARCHIVO Calculadora.java
public class Calculadora {

    // Devuelve el valor del parámetro con 2 decimales
    private double to2dec(double valor) {
        return Math.floor(valor * 100) / 100d;
    }

    // Dado una palabra devuelve el valor de su nombre: De cero a nueve
    // cero ->0, uno->, etc...
    // el nombre podrá estar escrito de cualquier manera, mayúsculas, minusculas, etc
    // Una palabra no reconocida tiene el valor de 0.
    public int valorDeUnTexto(String text) {
        int valor
        ...
        return valor;
    }

    // De un texto con varias palabras devuelve el valos de cada palabra en forma de
    // Lista de enteros
    public List<Integer> valoresDelTexto(String text) {
        List<Integer> valores = new ArrayList<Integer>();
        ...
        return valores;
    }

    // Dada una lista de enteros, dado un total, obtiene una lista de valores
    // proporcionales respecto al total proporcionado
    // ej: valores 1,2,3;  total 120px  --> 20,40,60  <-- double
        public List<Double> valoresProporcionalesDeLista(List<Integer> valores, int total) {
        List<Double> proporciones = new ArrayList<Double>();
        ...
        return proporciones;
    }

    // Idem que el anterior, pero en lugar de una lista de enteros 
    // se pasa un String con varias palabras
    public List<Double> valoresProporcionalesDeTexto(String texto, int total) {
        List<Double> proporciones = new ArrayList<Double>();
        ...
        return proporciones;
    }
}

ARCHIVO CalculadoraTest.java

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculadoraTest {

    @Test
    @DisplayName("De Texto a Lista de valores1")
    void nombreFuncionN() {
       
    }


    @ParameterizedTest
    @DisplayName("Valoración de varios parámetros")
    @ValueSource(strings = { "s1", " S2  ", " s3   " })
    void nombreFuncionN(String param) {

        bool result = param.contains("");
        assertEquals(1, result, result + "->" + param);
    }

}
```