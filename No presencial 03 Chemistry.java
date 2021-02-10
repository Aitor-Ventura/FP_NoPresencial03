package es.ulpgc.eii.strings;
import java.util.HashMap;

class Chemistry {
    /**
     * @param s - símbolo de elmento químico
     * @return peso atómico del elemento s
     */
    public static double atomWeigth(String s) {
        double result = 0.0;
        
        HashMap<String, Double> elements = new HashMap<String, Double>();
        
        elements.put("H", 1.0079);
        elements.put("He", 4.0026);
        elements.put("Li", 6.941);
        elements.put("Be", 9.0122);
        elements.put("B", 10.811);
        elements.put("C", 12.0107);
        elements.put("N", 14.0067);
        elements.put("O", 15.9994);
        elements.put("F", 18.9984);
        elements.put("Ne", 20.1797);
        elements.put("Na", 22.9897);
        elements.put("Mg", 24.305);
        elements.put("Al", 26.9815);
        elements.put("Si", 28.0855);
        elements.put("P", 30.9738);
        elements.put("S", 32.065);
        elements.put("Cl", 35.453);
        elements.put("K", 39.0983);
        elements.put("Ar", 39.948);
        elements.put("Ca", 40.078);
        elements.put("Sc", 44.9559);
        elements.put("Ti", 47.867);
        elements.put("V", 50.9415);
        elements.put("Cr", 51.9961);
        elements.put("Mn", 54.938);
        elements.put("Fe", 55.845);
        elements.put("Ni", 58.6934);
        elements.put("Co", 58.9332);
        elements.put("Cu", 63.546);
        elements.put("Zn", 65.39);
        elements.put("Ga", 69.723);
        elements.put("Ge", 72.64);
        elements.put("As", 74.9216);
        elements.put("Se", 78.96);
        elements.put("Br", 79.904);
        elements.put("Kr", 83.8);
        elements.put("Rb", 85.4678);
        elements.put("Sr", 87.62);
        elements.put("Y", 88.9059);
        elements.put("Zr", 91.224);
        elements.put("Nb", 92.9064);
        elements.put("Mo", 95.94);
        elements.put("Tc", 98.00);
        elements.put("Ru", 101.07);
        elements.put("Rh", 102.9055);
        elements.put("Pd", 106.42);
        elements.put("Ag", 107.8682);
        elements.put("Cd", 112.411);
        elements.put("In", 114.818);
        elements.put("Sn", 118.71);
        elements.put("Sb", 121.76);
        elements.put("I", 126.9045);
        elements.put("Te", 127.6);
        elements.put("Xe", 131.293);
        elements.put("Cs", 132.9055);
        elements.put("Ba", 137.327);
        elements.put("La", 138.9055);
        elements.put("Ce", 140.116);
        elements.put("Pr", 140.9077);
        elements.put("Nd", 144.24);
        elements.put("Pm", 145.00);
        elements.put("Sm", 150.36);
        elements.put("Eu", 151.964);
        elements.put("Gd", 157.25);
        elements.put("Tb", 158.9253);
        elements.put("Dy", 162.5);
        elements.put("Ho", 164.9303);
        elements.put("Er", 167.259);
        elements.put("Tm", 168.9342);
        elements.put("Yb", 173.04);
        elements.put("Lu", 174.967);
        elements.put("Hf", 178.49);
        elements.put("Ta", 180.9479);
        elements.put("W", 183.84);
        elements.put("Re", 186.207);
        elements.put("Os", 190.23);
        elements.put("Ir", 192.217);
        elements.put("Pt", 195.078);
        elements.put("Au", 196.9665);
        elements.put("Hg", 200.59);
        elements.put("Tl", 204.3833);
        elements.put("Pb", 207.2);
        elements.put("Bi", 208.9804);

        if (elements.containsKey(s)) {
            result = elements.get(s);
        }
        
        return result;
    }
}