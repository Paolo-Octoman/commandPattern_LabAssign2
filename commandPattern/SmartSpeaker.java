package commandPattern;

public class SmartSpeaker {
    boolean playback;
    private int vol;
    
    public SmartSpeaker() {
        playback = false;
        vol = 50;
    }

    public void playPlaylist() {
        playback = true;
        System.out.println("Now playing: Hits from 10 Years Ago Playlist");
    }

    public void stop() {
        playback = false;
        System.out.println("Playback stopped.");
    }

    public void spkVolUp() {
        if (vol < 100) {
            vol++;
            System.out.println("Volume increased.");
            System.out.println("Volume: " + vol);
        } else {
            System.out.println("Max volume reached");
        }
    }

    public void spkVolDown() {
        if (vol > 0) {
            vol--;
            System.out.println("Volume decreased.");
            System.out.println("Volume: " + vol);
        } else {
            System.out.println("Min volume reached");
        }
    }

    public void voiceCommand() {
        System.out.println("Smart speaker is listening for a voice command...");
    }
}
