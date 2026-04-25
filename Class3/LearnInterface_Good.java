package Class3;

interface MusicSystem
{
    public void play();
    public void pause();
}
    static class SonyMusicSystem implements MusicSystem
    {
        public void play()
        {
            System.out.println("Song MS Play the Song");
        }
        public void pause()
        { 
            System.out.println("Song MS Pause the Song");
        }
    }
    static class BoatMusicSystem implements MusicSystem
    {
        public void play()
        {
            System.out.println("Boat MS Play the Song");
        }
        public void pause()
        {
            System.out.println(" Boat MS Pause the Song");
        }
    }
    static class Car
    {
        int age;
        // SonyMusicSystem ms;
        // BoatMusicSystem ms;
        MusicSystem ms;
        Car(MusicSystem ms)
        {
            age=10;
            this.ms=ms;
        }
        void play()
        {
            // ms.play();
            ms.play();
        }
        void pause()
        {
            // ms.pause();
            // ms.songPause();
            ms.pause();
        }
    }
public class LearnInterface_Good {
    public static void main(String[] args) {
        SonyMusicSystem sms =new SonyMusicSystem();
        MusicSystem smc=new SonyMusicSystem();
        // MusicSystem obj = new MusicSystem();
        BoatMusicSystem bms = new BoatMusicSystem();
        Car cobj = new Car(sms);
        cobj.play();
        cobj.pause();
    }
}
