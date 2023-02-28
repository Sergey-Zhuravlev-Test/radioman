package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    Radio station = new Radio(5, 0, 9, 55, 0, 100);

    @Test
    public void shouldSetRadioStationQuantity() {

        Radio station = new Radio(30);

        Assertions.assertEquals(0, station.getMinStationNumber());
        Assertions.assertEquals(30, station.getMaxStationNumber());
        Assertions.assertEquals(0, station.getCurrentStationNumber());
    }

    @Test
    public void shouldDefaultRadioStationQuantity() {

        Radio station = new Radio();

        Assertions.assertEquals(0, station.getMinStationNumber());
        Assertions.assertEquals(10, station.getQuantity());
        Assertions.assertEquals(0, station.getCurrentStationNumber());
    }

    @Test
    public void shouldSetStationNumber() {

        station.setCurrentStationNumber(station.currentStationNumber);

        int expected = 5;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberMax() {

        station.setCurrentStationNumber(station.maxStationNumber);

        int expected = 9;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberMin() {

        station.setCurrentStationNumber(station.minStationNumber);

        int expected = 0;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberUnderLimit() {

        station.setCurrentStationNumber(-1);

        int expected = station.getMinStationNumber();
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberAboveLimit() {

        station.setCurrentStationNumber(10);

        int expected = station.getMaxStationNumber();
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStation() {

        station.setCurrentStationNumber(station.currentStationNumber);
        station.changeNextRadioStation();

        int expected = 6;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStationMax() {

        station.setCurrentStationNumber(station.maxStationNumber);
        station.changeNextRadioStation();

        int expected = station.getMinStationNumber();
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSwitchToPreviousStation() {

        station.setCurrentStationNumber(station.currentStationNumber);
        station.changePreviousRadioStation();

        int expected = 4;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPreviousStationMin() {

        station.setCurrentStationNumber(station.minStationNumber);
        station.changePreviousRadioStation();

        int expected = station.getMaxStationNumber();
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeSoundVolumeUp() {

        station.setCurrentSoundVolume(station.currentSoundVolume);
        station.increaseSoundVolume();

        int expected = 56;
        int actual = station.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeSoundVolumeUpMax() {

        station.setCurrentSoundVolume(station.maxSoundVolume);
        station.increaseSoundVolume();

        int expected = station.getMaxSoundVolume();
        int actual = station.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeSoundVolumeDown() {

        station.setCurrentSoundVolume(station.currentSoundVolume);
        station.decreaseSoundVolume();

        int expected = 54;
        int actual = station.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeSoundVolumeDownMin() {

        station.setCurrentSoundVolume(station.minSoundVolume);
        station.decreaseSoundVolume();

        int expected = station.getMinSoundVolume();
        int actual = station.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeUnderLimit() {

        station.setCurrentSoundVolume(-1);

        int expected = station.getMinSoundVolume();
        int actual = station.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeAboveLimit() {

        station.setCurrentSoundVolume(105);

        int expected = station.getMaxSoundVolume();
        int actual = station.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}

