import es.ulpgc.eii.strings.StringUtils;

public class Main {
    /**
     * Prueba el método StringUtils.molWeigt
     * @param mol - fórmula molecular
     * @param expected - resultado esperado
     */
    static void test(String mol, double expected) {
    	// Se informa del caso que se está probando
    	System.out.println("probando: span(\"" + mol + "\")");
    	
        // Llamada al método a probar
        double result = StringUtils.molWeigth(mol);
        
        // Comprobación de los resultados
        if (Math.abs(result - expected) > 0.00001) {
            System.out.print(">> Resultado erróneo, deberia ser: " + expected);
            System.out.println(" y es: " + result);
        } else {
            System.out.println(">> Resultado correcto: " + result);
        }        
    }

    /**
     * @param args
     */
    /**
     * Invoca a test para realizar múltiples pruebas de StringUtils.molWeigth
     * @param args
     */
    public static void main(String[] args) {
        test("CO2", 44.0095);
        test("C6H12",84.158999);
    }
}
