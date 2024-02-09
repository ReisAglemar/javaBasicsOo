package meuPacote;


/**
 *
 * @author reis
 */
public class MuchaLuchaMain {
    
    public static void main(String[] args) {
        
   //  A clase é vetor   nome do vetor   tamanho do vetor
       LutadoresClasse[] lutadores = new LutadoresClasse[6];
       LutaClasse combate = new LutaClasse();
       
        
        lutadores[0] = new LutadoresClasse("Pretty Boy", 
                "França", 31, 1.75f, 68.9f, 11, 2, 1);
        
        lutadores[1] = new LutadoresClasse("Putsscript", 
                "Barsil", 29, 1.68f, 57.8f, 14, 2, 3);
        
        lutadores[2] = new LutadoresClasse("Snapshadow", 
                "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        
        lutadores[3] = new LutadoresClasse("Dead Code",
                "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        
        lutadores[4] = new LutadoresClasse("Ufocobol",
                "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        
        lutadores[5] = new LutadoresClasse("Nerdaard", 
                "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        
              //tipo     nomeControle : nomeVetor
        /*for (LutadoresClasse objeto : lutadores) {
            //System.out.println(objeto);
            objeto.apresentar();
            objeto.status();       
        }*/
        
       
       
        combate.marcarLuta(lutadores[2], lutadores[3]);
        combate.lutar(3);
                      
    }
}
