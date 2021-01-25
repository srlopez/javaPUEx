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
Una aplicación de estadística necesita calcular proporciones para presentar gráficos.
Crea una clase Calculadora que nos calcule valores proporcionales dados como en el siguiente ejemplo:
  - El resultado de una determinada prueba de estadística ha sido `'  Dos  UnO Tres CUATRO  '`.    Y debemos representar esos valores en una barra que tiene 100px de alto.
  - El resultado debe ser otra lista, que para el ejemplo anterior sería 20, 10, 30 y 40, y que la parte gráfica de la aplicación se encargará de presentar.

## SE PIDE
Construye y Verifica los métodos que estimes necesarios, en la clase Calculadora, pero entiendo que por lo menos existirán:

  - Uno que devuelve una lista/array para un texto que tiene varios nombres de números. ej `"uno DOS"-> 1,2`
  - Otro que obtiene una lista de valores proporcionales, respecto a una lista original de valores y un valor absoluto total. ej: 
   `1,2,3 t=60 -> 10,20,30`.  
   El resultado debe ser double/Doubles
  - Uno que dado un texto con varios nombres de numeros y un valor total, devuelve las proporciones.
  - Añade los métodos que creas necesarios, y/o que simplifiquen la lectura de tu código.

Escribe las pruebas unitarias para la clase que has diseñado. Tienes libertad para diseñar los métodos como te interese, y sea más sencillo. 

Para que no tengamos problemas a la hora de comparar los valores esperados con los resultados, incorporamos un método a la clase para que siempre obtengamos valores con 2 decimales.

```java
  // Devuelve el valor con 2 decimales
  double to2dec(double valor) {
      return Math.floor(valor * 100) / 100d;
  }
```


