package ru.netology.radio.java9;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void increaseStation() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void reduceStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
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
        currentStation = 9;
    }

    public void setTheMinVolume() {
        currentVolume = 0;
    }

    public void setTheMaxVolume() {
        currentVolume = 100;
    }
}
