
### Conceptos básicos necesarios
- Regla de 3

  y la inversa

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
  if(){...}elseif(){...}
  String valor =  1<4?"cierto":"falso";
  for(int i=0, j=0; (?) ;i++, j++ ){...}, while(){...}
  for (int v : valores) t += v;
```
- ArrayList/Array <- Conversiones y Declaraciones, Metodos
```java
  // Declaraciones e inicialización
  List<Double> nds = new ArrayList<Double>();
  List<Double> nds = new ArrayList<Double>(List.of(5d,6d,7d));
  List<String> dias = new ArrayList<>(
                List.of("lunes", "martes", ..., "domingo"));
  
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
  text.trim();  
  text.substring(3,6);
  text.replace("bb", "DGDG")
  String[] strs = text.split(";")
  text.length()
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