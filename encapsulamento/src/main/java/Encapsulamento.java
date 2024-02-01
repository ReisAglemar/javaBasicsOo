/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 * 
 * Encapsulamento -- criar padrão para capsula, proteção e liberdade para a  parte interna do código, interface e
 * comunicação por mensagens. produção de classes eficiêntes
 * métodos abstratos - são definos na interface e desenvolvidos em outro local, geralmente na classe
 * classe implementa interface
 * classe parte interna da capsula...
 * interface parte externa da capsula...
 *      vantagens -- 1)torna mudanças invisíveis, 2)facilita a reutilização de códigos 3)reduz os efeitos colaterais
 * 
 * 
 *      
 * 
 * Polimorfismo
 * 
 * Herança
 * 
 * Abstração -- tirar aquilo que importa para a solução pensada abstrair == filtrar, são os atributos
 * 
 * Encapsulamento
 * Polimorfismo
 * Herança
 * Abstração
 * 
 * EPHA
 * 
 * @author reis
 */
public class Encapsulamento {

    public static void main(String[] args) {
        ControleRemoto controle1 = new ControleRemoto();
        
        controle1.ligar();
        controle1.play();
        controle1.aumentarVolume();
        
        System.out.println("");
        controle1.abrirMenu();
        System.out.println("");
        
        controle1.fecharMenu();        
        controle1.ativarMudo();
        
        System.out.println("");
        controle1.abrirMenu();
        System.out.println("");
        
        controle1.fecharMenu();
        controle1.desativarMudo();
        controle1.desligar();
        
    }
}
