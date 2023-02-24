package ru.netology;

public class Radio {
    public int currentStationNumber;
    public int currentSoundVolume;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < 0) {
            currentStationNumber = 0;
            return;
        }
        if (newCurrentStationNumber > 9) {
            currentStationNumber = 9;
            return;
        }

        currentStationNumber = newCurrentStationNumber;
    }

    public void changeNextRadioStation() {
        if (currentStationNumber == 9) {
            currentStationNumber = 0;
            return;
        }
        currentStationNumber = currentStationNumber + 1;
    }

    public void changePreviousRadioStation() {
        if (currentStationNumber == 0) {
            currentStationNumber = 9;
            return;
        }
        currentStationNumber = currentStationNumber - 1;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            currentSoundVolume = 0;
            return;
        }
        if (newCurrentSoundVolume > 10) {
            currentSoundVolume = 10;
            return;
        }

        currentSoundVolume = newCurrentSoundVolume;
    }

    public void increaseSoundVolume() {
        if (currentSoundVolume == 10) {
            return;
        }
        currentSoundVolume = currentSoundVolume + 1;
    }

    public void decreaseSoundVolume() {
        if (currentSoundVolume == 0) {
            return;
        }
        currentSoundVolume = currentSoundVolume - 1;
    }
}



