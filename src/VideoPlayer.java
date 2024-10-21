public class VideoPlayer implements MediaPlayer{
    public String play(String media) {
        return "Video playing: " + media;
    }

    public String pause() {
        return "Video paused.";
    }

    public String stop() {
        return "Video stopped. Please click another video.";
    }

    // Prints type of player this object is when called
    @Override
    public String toString() {
        return "Video";
    }
}
