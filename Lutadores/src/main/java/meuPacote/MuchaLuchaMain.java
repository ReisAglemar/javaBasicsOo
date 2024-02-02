package meuPacote;

/**
 *
 * @author reis
 */
public class MuchaLuchaMain {

    public static void main(String[] args) {
        
        LutadoresClasse l1 = new LutadoresClasse("Pretty Boy", 
                "França", 31, 1.75f, 68.9f, 11, 2, 1);
        
        LutadoresClasse l2 = new LutadoresClasse("Putsscript", 
                "Barsil", 29, 1.68f, 57.8f, 14, 2, 3);
        
        LutadoresClasse l3 = new LutadoresClasse("Snapshadow", 
                "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        
        LutadoresClasse l4 = new LutadoresClasse("Dead Code",
                "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        
        LutadoresClasse l5 = new LutadoresClasse("Ufocobol",
                "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        
        LutadoresClasse l6 = new LutadoresClasse("Nerdaard", 
                "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        l1.apresentar();
        l2.apresentar();
        l3.apresentar();
        l4.apresentar();
        l5.apresentar();
        l6.apresentar();
        
    }
}
