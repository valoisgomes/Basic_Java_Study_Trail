public class UserIphone {
    public static void main(String[] args) throws Exception {
        System.out.println("Oba, meu Ipphone novo!");
        System.out.println("Vamos Testa-lo!");

        IphoneSeven ios = new IphoneSeven();

        System.out.println("Vamos fazer uma ligação para testar");
        ios.call();
        System.out.println("Opa! algúem está me ligando!");
        ios.answer();
        System.out.println("Minha caixa postal está lotada, vou ouvir as msg!");
        ios.voiceMail();
        System.out.println("Vou ouvir um pouco de musica");
        ios.playMusic();
        ios.selectMusic();
        ios.pauseMusic();
        System.out.println("Cansei... vou ver as notícas na internet");
        ios.displayWebPage();
        ios.reloadPage();
        ios.newTab();
    }
}
