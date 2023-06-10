package chapter5.sealed_stuff;

public sealed class AudioBook implements Book permits SimpleAudioBook {
    @Override
    public void print() {

    }
}
