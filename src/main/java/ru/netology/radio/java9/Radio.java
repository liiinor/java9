package ru.netology.radio.java9;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio(int numberOfStations) {
        maxStation = numberOfStations - 1;
    }

    public Radio() {
        maxStation = 9;
    }

    public void increaseStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void reduceStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setTheMinStation() {

        currentStation = 0;
    }

    public void setTheMaxStation() {

        currentStation = maxStation;
    }

    public void setTheMinVolume() {

        currentVolume = 0;
    }

    public void setTheMaxVolume() {

        currentVolume = 100;
    }
}
