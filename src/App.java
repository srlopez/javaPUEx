
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(sumaValores(new int[] { 1, 2, 3 }));
        System.out.println(sumaValores(new int[] { 2, 4, 6 }));
        System.out.println(sumar(new int[] { 2, 4, 6 }));
    }

    //1.- Suma array recursiva + index
    static int sumaValores(int[] valores) {
        return suma(valores, 0);
    }

    static int suma(int[] valores, int idx) {
        if (idx == valores.length - 1)
            return valores[idx];
        return valores[idx] + suma(valores, idx + 1);
    }

    //2.- Suma array recursiva + copy
    static int sumar(int[] valores) {
        if (valores.length < 1)
            return 0;
        if (valores.length == 1)
            return valores[0];

        int[] copia = new int[valores.length - 1];
        System.arraycopy(valores, 1, copia, 0, copia.length);

        return valores[0] + sumar(copia);
    }

}
