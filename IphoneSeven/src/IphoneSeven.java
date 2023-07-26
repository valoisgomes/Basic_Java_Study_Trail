
public class IphoneSeven implements Phone, MuiscPlay, Browser {

    public void call(){
        System.out.println("Ligando para...");
    }

    public void answer(){
        System.out.println("Chamada atendida!");
    }

    public void voiceMail(){
        System.out.println("Iniciando Correio de Voz");
    }

    public void displayWebPage(){
        System.out.println("Página Web exibida");
    }
    
    public void newTab(){
        System.out.println("Nova Aba Aberta");
    }
    
    public void reloadPage(){
        System.out.println("Página atualizada");
    }

    public void playMusic() {
        System.out.println("Tocando Música!");
    }

    public void pauseMusic() {
        System.out.println("Música Pausada");
    }

    public void selectMusic() {
        System.out.println("Música Selecionada");
    }
    
}
