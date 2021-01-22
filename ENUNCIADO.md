## javaTDDEx

### Conceptos básicos necesarios
- Regla de 3
- Área de un rectángulo: 
  - Calcular el area sabiendo alto y ancho. 
  - Y calcular un lado sabiendo el otro y el área.

### Conceptos de programación
- Clase
- Método y/o Función. Publico y privado.
- Parametros en las funciones: tipos básicos, Objetos y/o ArrayLists
- Retorno de funciones: tipos básicos, Objetos y/o ArrayLists
- Condicionales, ternario y ciclos
- ArrayList/Array <- Conversiones y Definiciones
- manejo de strings, split. toLower, replace,
- Recursividad

## Enunciado
Una aplicación de dibujo necesita calcular proporciones para presentar gráficos.
Crea una clase Calculadora que nos calcule valores proporcionales dados el siguiente ejemplo:
  - El resultado de una determinada prueba de Covid19 ha sido `'Dos  UnO Tres CUATRO'`.   Hemos de representar esos valores en una barra que tiene 100px de alto.
  - El resultado debe ser otra lista, que para el ejemplo anterior sería 20, 10, 30 y 40

## SE PIDE
Construye y Verifica los métodos que estimes necesarios pero:

  - Uno devuelve una lista/array para un texto que tiene varios nombres de números. ej "uno DOS"-> 1,2
  - Otro que obtiene una lista de valores proporcionales, respecto a una lista original de valores y un valor absoluto total. ej: 
   1,2,3 t=60 -> 10,20,30 El resultado debe ser double/Doubles
  - uno que dado un texto con varios nombres de numeros y un valor total, devuelve las proporciones.
  - Añade los métodos que creas necesarios

Escribe las pruebas unitarias para la clase que has diseñado. Tienes libertad para diseñar los métodos como te interese, y sea más sencillo. 

Para que no tengamos problemas a la hora de comparar los valores esperados con los resultados, incorporamos un método a la clase para que siempre obtengamos valores con dos decimales.

```java
    // Devuelve el valor con 2 decimales
    double to2dec(double valor) {
        return Math.floor(valor * 100) / 100d;
    }
```


