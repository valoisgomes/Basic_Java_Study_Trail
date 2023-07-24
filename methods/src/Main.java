public class Main {
    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        System.out.println("Initial status of turn on TV: " + smartTV.turnedTV);
        System.out.println("Initial Chennal of TV: " + smartTV.channelTV);
        System.out.println("Initial Volume of TV: " + smartTV.volumeTV);

        smartTV.turnOn();
        smartTV.turnOff();
        smartTV.turnOn();

        smartTV.lowerVolume();
        smartTV.lowerVolume();
        smartTV.lowerVolume();
        smartTV.turnUpVolume();
        smartTV.turnUpVolume();      
        smartTV.lowerVolume();

        smartTV.changeChannel(10);
        smartTV.lowerChannel();
        smartTV.lowerChannel();
        smartTV.changeChannel(4);
        smartTV.turnUpChannel();
        
    }
}
