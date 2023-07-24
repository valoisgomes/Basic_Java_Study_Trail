public class SmartTV {
    
    boolean turnedTV = false;
    int channelTV = 12;
    int volumeTV = 25;

   public void turnOn() {
        System.out.println("Turn On TV");
        turnedTV = true;
   }

   public void turnOff() {
        System.out.println("Turn Off TV");
        turnedTV = false;
   }

   public void turnUpVolume() {
        volumeTV++;
        System.out.println("Turn Up Volume for: " + volumeTV);
   }

   public void lowerVolume() {
        volumeTV--;
        System.out.println("Lower Volume for: " + volumeTV);
   }

   public void turnUpChannel() {
        channelTV++;
        System.out.println("New Channel is: " + channelTV);
   }

   public void lowerChannel() {
        channelTV--;
        System.out.println("New Channel is: " + channelTV);
   }

   public void changeChannel(int newChannel) {
        channelTV = newChannel;
        System.out.println("The new Channel is: " + channelTV);
   }

}
