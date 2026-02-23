package com.debs;

public interface Camera {
    void takePhoto();
    public static void main(String[] args) {
        Phone myPhone = new Phone();

        myPhone.takePhoto();
        myPhone.playMusic();
    }
}

interface MusicPlayer {
    void playMusic();
}

class Phone implements Camera, MusicPlayer {

    public void takePhoto() {
        System.out.println("Photo taken using phone camera");
    }

    public void playMusic() {
        System.out.println("Playing music on phone");
    }

    
}
