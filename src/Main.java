
public class Main {
    public static void main(String[] args) throws Exception {
        // Create new media players
        AudioPlayer audioplayer = new AudioPlayer();
        StreamingPlayer streamplayer = new StreamingPlayer();
        VideoPlayer videoplayer = new VideoPlayer();

        // Initialize media players with their respective media in the GUI
        new GUI("Don't Stop Me Now by Queen", audioplayer);
        new GUI("Staring at a Wall for 10 hours livestream", streamplayer);
        new GUI("How to bake delicious chocolate chip cookies", videoplayer);
    }
}
