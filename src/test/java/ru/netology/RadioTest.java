package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void shouldSetStationNumber() {
        Radio station = new Radio();

        station.setCurrentStationNumber(5);

        int expected = 5;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberMax() {
        Radio station = new Radio();

        station.setCurrentStationNumber(9);

        int expected = 9;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberMin() {
        Radio station = new Radio();

        station.setCurrentStationNumber(0);

        int expected = 0;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberUnderLimit() {
        Radio station = new Radio();

        station.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberAboveLimit() {
        Radio station = new Radio();

        station.setCurrentStationNumber(10);

        int expected = 9;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStation() {
        Radio station = new Radio();

        station.setCurrentStationNumber(5);
        station.changeNextRadioStation();

        int expected = 6;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStationMax() {
        Radio station = new Radio();

        station.setCurrentStationNumber(9);
        station.changeNextRadioStation();

        int expected = 0;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSwitchToPreviousStation() {
        Radio station = new Radio();

        station.setCurrentStationNumber(5);
        station.changePreviousRadioStation();

        int expected = 4;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPreviousStationMin() {
        Radio station = new Radio();

        station.setCurrentStationNumber(0);
        station.changePreviousRadioStation();

        int expected = 9;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeSoundVolumeUp() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(5);
        volume.increaseSoundVolume();

        int expected = 6;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeSoundVolumeUpMax() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(10);
        volume.increaseSoundVolume();

        int expected = 10;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeSoundVolumeDown() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(5);
        volume.decreaseSoundVolume();

        int expected = 4;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeSoundVolumeDownMin() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(0);
        volume.decreaseSoundVolume();

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeUnderLimit() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeAboveLimit() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(11);

        int expected = 10;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}

