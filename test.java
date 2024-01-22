

    public class MedianaAritmetica {

        public static void main(String[] args) {
            // Ejemplo de llamada al método para obtener la mediana aritmética de tres números
            double resultado = calcularMedianaAritmetica(5, 12, 8);
            System.out.println("La mediana aritmética es: " + resultado);
        }

        // Método para calcular la mediana aritmética de tres números
        public static double calcularMedianaAritmetica(double num1, double num2, double num3) {
            // Crear un array y ordenarlo para facilitar la obtención de la mediana
            double[] numeros = {num1, num2, num3};
            Arrays.sort(numeros);

            // La mediana es el valor del medio en el array ordenado
            return numeros[1];
        }
    }
}

