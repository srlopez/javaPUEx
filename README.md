## javaTDDEx

### Conceptos básicos necesarios
- Regla de 3

### Conceptos de programación
- Clase
- Método y/o Función. Publico y privado.
- Parametros en las funciones: tipos básicos, Objetos y/o ArrayLists
- Retorno de funciones: tipos básicos, Objetos y/o ArrayLists
- Condicionales if/switch, ternario ?; y ciclos for/while
- ArrayList/Array <- Conversiones y Definiciones
- Manejo de strings; split, toLower, ...
- Recursividad

## Enunciado
   Se nos contrata para desarrollar una aplicación de educación estadística encargada de presentar gráficos proporcionales a unos datos iniciales. Los datos originales a representar vienen escritos por niños, y pueden venir representados con el **dígito** de **0** a **9**, o con su el nombre del número en **mayúsculas, minúsculas, con caracteres repetidos y separados por uno o varios espacios**.

   La aplicación debe proporcionar una utilidad que calcule valores proporcionales a los datos originales de forma análoga al siguiente ejemplo:

   El resultado de una determinada prueba estadística obtenida por los niños ha sido un string; `" Doos   1  TrRes   CUAaaaTRO  "`. Se indica también que se deben representar esos valores en una barra que tiene `100px` de alto.  El resultado debe ser otra lista, que este ejemplo sería; `[ 20, 10, 30 y 40 ]`, que la parte gráfica de la aplicación se encargará de presentar.   
  Otro ejemplos:
```
"  1 2 3 4 ",  100m -> [ 10, 20, 30, 40]
"  UuunnnOOO  DOs  SSeiSS  ",  60px -> [ 6.66, 13.33, 40.0 ]
"  1DAW3  SiEtE  nueeVVE  3 cinco ", 660px  ->  [ 0, 192.5, 247.5, 82.5, 137.5]
"  unnoooo  dos 3 CUATRO fin", 15cm ->  [ 1.5, 3.0, 4.5, 6.0, 0.0 ]
"  Cerooo  0  1  99", 60 ->  [ 0, 0, 60, 0 ]
```
## Se pide
  Construye y Verifica una utilidad/clase con los métodos que estimes necesarios, pero idealmente por lo menos existirán:

- Un método que devuelve un valor entero dado el nombre de un número. ej `" unnO "-> 1`. Un texto/digito no reconocido devuelve 0.
- Un método que devuelve una lista/array para la entrada de un texto que tiene varios nombres de números. ej `" uUno  DoOS "->[ 1, 2 ]`
- Otro que obtiene una lista de valores proporcionales, respecto a una lista original de valores y un valor absoluto total. ej: `1,2,3 total=60 -> [ 10d, 20d , 30d ]`
- Un método que dado un texto con varios nombres de números y un valor total, devuelve las proporciones finales.

Los nombres de los números sólo para las unidades, y el cero.  

Añade los métodos que creas necesarios, y/o que simplifiquen la lectura de tu código.

Escribe las pruebas unitarias para cada uno de los métodos de la clase que has diseñado. Tienes libertad para diseñar los métodos cómo te interese, y sea más sencillo.  

Incluye con test los 5 ejemplos anteriores 

## P.D:
  Para que no tengas problemas a la hora de verificar en los test los valores esperados con los resultados, incorpora este método a la clase para que siempre obtengas valores con 2 decimales. 
```
  // Devuelve el valor con 2 decimales
  double to2dec(double valor) {
      return Math.floor(valor * 100) / 100d;
  }
```

### Entrega del examen en Moode
https://elearning6.hezkuntza.net/012108/course/view.php?id=427#module-49806)  
Elabora un documento en el que `copy/paste` el código de tu aplicación, que incluya:
- Un enlace al repositorio Git donde lo has subido, y sea públicamente accesible.
- El App.java, que has usado para invocara a los métodos. Incluye la salida que emite por la terminal.
- La Clase que has diseñado para los métodos que se te pide.
- La Clase que has creado para pruebas unitarias.