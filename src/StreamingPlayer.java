public class StreamingPlayer implements MediaPlayer{
    public String play(String media) {
        return "Stream playing: " + media;
    }

    public String pause() {
        return "Stream paused.";
    }

    public String stop() {
        return "Stream stopped. Click on another stream to watch.";
    }

    // Prints type of player this object is when called
    @Override
    public String toString() {
        return "Streaming";
    }
}
