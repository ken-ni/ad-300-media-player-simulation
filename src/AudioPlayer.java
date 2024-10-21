public class AudioPlayer implements MediaPlayer{
    public String play(String media) {
        return "Song playing: " + media;
    }

    public String pause() {
        return "Music paused.";
    }

    public String stop() {
        return "Music ended. Please select the next track.";
    }

    // Prints type of player this object is when called
    @Override
    public String toString() {
        return "Audio";
    }
}
