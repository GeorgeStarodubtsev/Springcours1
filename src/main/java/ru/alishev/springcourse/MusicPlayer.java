package ru.alishev.springcourse;

public class MusicPlayer {
    //архитектура IoC (Inversion of Control)
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}
