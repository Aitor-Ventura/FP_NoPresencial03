package es.ulpgc.eii.strings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*  Aitor Ventura Delgado
    22.02.2019
    
    Crearemos un método al que se le pasará una fórmula química y devolverá
    el peso molecular. **El peso molecular se halla sumando los pesos atómicos
    de cada elemento multiplicado por el número de átomos del elemento presentes
    en la molécula del compuesto. */

public class StringUtils {
    
    public static double molWeigth (String s1){
        double res = 0.0;   //variable que almacenará el peso molecular
        /*Creamos la expresión regular que tomará en cuenta valores desde la A hasta
        la Z, desde la a hasta la z, con un máximo de 2 caracteres, y también tomará
        en cuenta cualquier número (dígito) con un máximo de 2 caracteres (12,24,...)*/
        String s = "([A-Z][a-z]{0,2})(\\d{0,2})"; 
        double a = 0;   //variable que almacenará el peso atómico
        int x = 0;  //variable que almacenará el num de átomos
        
        Pattern n = Pattern.compile(s); //que compile la expresión regular
        Matcher m = n.matcher(s1);  //y la encuentre en el parámetro
        
        //Mientras se encuentren los carácteres hacer
        while(m.find()){
            //Por un lado que 'a' tome el peso atómico del elemento que se le da
            a = Chemistry.atomWeigth(m.group(1));
            //Y por el otro, que 'x' tome el valor del número de átomos
                
                /*Y aquí hay un dato a destacar, intenté hacerlo con == null, == "",
                y no hubo resultado, incluso intenté hacerlo de otra manera, con un
                método auxiliar que devolviera un booleano, y a pesar de no haber dado
                isEmpty(), es lo que parece ser que funciona (si es vacío supuestamente
                debería de ser "" o null, pero no, es literalmente vacío cuando no se
                encuentra el átomo en ejemplos como CO2, grupo 1 sería C y O, pero grupo
                2 sería 'vacío' y 2, en distintas ocasiones). Sin embargo, que esté
                'vacío' significa que la cadena tiene un tamaño de 0, es decir, no caben
                caracteres, luego se podría utilizar cualquiera de las dos siguientes 
                líneas.*/
                
            if (m.group(2).isEmpty()){  
            //if (m.group(2).length() == 0){
                x = 1;
            } else {
                x = Integer.parseInt(m.group(2));
            }
            res += a * x;
        }
        
        return res;
    }
}