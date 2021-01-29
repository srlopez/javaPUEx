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
Se nos contrata para desarrollar una aplicación de estadística encargada de convertir unos valores en proporciones para presentar gráficos. Los valores iniciales a representar vienen escritos por niños, y pueden tener venir representados en mayusculas, minúsculas y seprados por uno o varios espacios.

Se nos pide que creemos una clase que nos calcule valores proporcionales dados de forma análoga al siguiente ejemplo:
  - El resultado de una determinada prueba de estadística ha sido `'  Dos  UnO Tres CUATRO  '`. Y debemos representar esos valores en una barra que tiene 100px de alto.
  - El resultado debe ser otra lista, que para el ejemplo anterior sería 20, 10, 30 y 40, y que la parte gráfica de la aplicación se encargará de presentar.

## SE PIDE
Construye y Verifica los métodos que estimes necesarios, en la clase, pero se estima que por lo menos existirán:

  - Un método que devuelve un valor entero dado el nombre de un número. ej `" unO "-> 1`
  - Un método que devuelve una lista/array para la entrada de un texto que tiene varios nombres de números. ej `"uno DOS"-> 1,2`
  - Otro que obtiene una lista de valores proporcionales, respecto a una lista original de valores y un valor absoluto total. ej: 
   `1,2,3 total=60 -> 10,20,30`.  
   El resultado debe ser `double`/`Doubles`. Decide lo que más te interese.
  - Un método que dado un texto con varios nombres de numeros y un valor total, devuelve las proporciones.

Los nombres de números restringidos a la unidades y el cero.
Añade los métodos que creas necesarios, y/o que simplifiquen la lectura de tu código.

Escribe las pruebas unitarias para cada uno de los métodos de la clase que has diseñado. Tienes libertad para diseñar los métodos como te interese, y sea más sencillo. 

Para que no tengamos problemas a la hora de comparar en los test los valores esperados con los resultados, incorporamos un método a la clase para que siempre obtengamos valores con 2 decimales.

```java
  // Devuelve el valor con 2 decimales
  double to2dec(double valor) {
      return Math.floor(valor * 100) / 100d;
  }
```

## ENTREGA
[Moodle](https://elearning6.hezkuntza.net/012108/course/view.php?id=427#module-49806)
Elabora un documento en el que copy/paste el código de tu aplicación, que incluya:
- El App.java, que has usado para invocara a los métodos. Incluye la salida que emite por la terminal.
- La Clase que has diseñado para los métodos que se te pide.
- La Clase que has creado para pruebas unitarias.

