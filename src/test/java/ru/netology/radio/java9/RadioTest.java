package ru.netology.radio.java9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldIncreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.increaseStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.reduceStation();
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(66);
        radio.increaseVolume();
        int expected = 67;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(33);
        radio.reduceVolume();
        int expected = 32;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelow0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.reduceStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAbove9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelow0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAbove100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(83);
        int expected = 83;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTheMinStation() {
        Radio radio = new Radio();
        radio.setTheMinStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTheMaxStation() {
        Radio radio = new Radio();
        radio.setTheMaxStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTheMinVolume() {
        Radio radio = new Radio();
        radio.setTheMinVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTheMaxVolume() {
        Radio radio = new Radio();
        radio.setTheMaxVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
