## javaTDDEx

### Conceptos básicos necesarios
- Regla de 3
- Área de un rectángulo: 
  - Calcular el area sabiendo alto y ancho. 
  - Y calcular un lado sabiendo el otro y el área.

### Conceptos de programación
- Clase
- ArrayList
- Parametros en las funciones: tipos básicos, Objetos y/o ArrayLists
- Retorno de funciones: tipos básicos, Objetos y/o ArrayLists
- Recursividad

## Enunciado
Una aplicación de dibujo necesita calcular proporciones para presentar gráficos.
Crea una clase Calculadora que nos calcule valores proporcionales dados las siguientes escenarios:

Escenarios: 
Valores Lineales: 
  - Se trata mostrar porporcionalmente una lista de valores; el resultado de una determinada prueba ha sido 1.5, 2.5 y 1.0 para tres participantes. Hemos de representar esos valores en una barra que tiene 500px de alto.
  - El resultado debe ser otra lista, que para el ejemplos anterior sería 150, 250 y 100

Valor Área:
  - Esos misma lista de valores los hemos de representar en una superfice (h*w)  
  Si el área a dividir es más alta que ancha dividiremos horizontalmente, en caso contrario verticalmente. Empieza pensando que sólo tienes un valor a representar, continua pensando que tienes dos valores a representar, y si tienes tres ... tal vez lo puedas ver como dos valores.



Diseña los test a realizar al mismo tiempo que diseñas la clase. Tienes libertad para diseñar los métodos como te interese, y sea más sencillo. 
El tipo que representa valores, alto y ancho de las áreas es `double`.
Para que no tengamos problemas a la hora de comparar los valores esperados con los resultados, incorporamos un método a la clase para que siempre obtengamos valores con dos decimales.

```java
    // Devuelve el valor con 2 decimales
    double to2dec(double valor) {
        return Math.floor(valor * 100) / 100d;
    }
```
        List<Double> d = new ArrayList<Double>();

        List<Area> areas = new ArrayList<Area>();
        areas.add(a)
        areas.add(b)
        a0 = areas.get(0)
        a1 = areas.get(1)


