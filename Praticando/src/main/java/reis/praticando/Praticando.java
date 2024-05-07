package reis.praticando;

public class Praticando {

    public static void main(String[] args) {

        Video video[] = new Video[3];
        Gafanhoto espectador[] = new Gafanhoto[2];

        video[0] = new Video("Vídeo UM");
        video[1] = new Video("Vídeo DOIS");
        video[2] = new Video("Vídeo TRÊS");
        
        

        espectador[0] = new Gafanhoto("Reis", "M", 34, "Logado");
        espectador[1] = new Gafanhoto("Aglemar", "M", 33, "Logado");
        
        
        
        

        System.out.println("\n--------- INFO VÍDEOS ---------\n");

        for (Video i : video) {
            System.out.println(i.toString());
        }

        System.out.println("\n--------- INFO USERS ---------\n");

        for (Gafanhoto i : espectador) {
            System.out.println(i.toString());
        }
        
        
        

        Visualizacao transmitir[] = new Visualizacao[2];
        
        transmitir[0] = new Visualizacao(espectador[0], video[0]);
        transmitir[0].avaliar(5);
        transmitir[1] = new Visualizacao(espectador[0], video[1]);
        transmitir[1].avaliar(2.5f);

        System.out.println("\n--------- INFO TRANSMI. ---------\n");
        
        for (Visualizacao i :transmitir){
            System.out.println(i.toString());
        }
        
        
        

        System.out.println("\n--------- INFO VÍDEOS ---------\n");

        for (Video i : video) {
            System.out.println(i.toString());
        }

        System.out.println("\n--------- INFO USERS ---------\n");

        for (Gafanhoto i : espectador) {
            System.out.println(i.toString());
        }

    }
}
