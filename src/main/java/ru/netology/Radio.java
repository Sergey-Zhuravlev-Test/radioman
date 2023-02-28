package ru.netology;

public class Radio {
    protected int currentStationNumber;
    protected int minStationNumber;
    protected int maxStationNumber = 9;
    protected int currentSoundVolume;
    protected int minSoundVolume;
    protected int maxSoundVolume = 100;
    protected int quantity = 10;

    public Radio(int quantity) {
        maxStationNumber = minStationNumber + quantity;
    }

    public Radio() {

    }


    public Radio(int currentStationNumber, int minStationNumber, int maxStationNumber, int currentSoundVolume, int minSoundVolume, int maxSoundVolume) {
        this.currentStationNumber = currentStationNumber;
        this.minStationNumber = minStationNumber;
        this.maxStationNumber = maxStationNumber;
        this.currentSoundVolume = currentSoundVolume;
        this.minSoundVolume = minSoundVolume;
        this.maxSoundVolume = maxSoundVolume;
    }


    public int getQuantity() {
        return quantity;
    }

    public int getMinStationNumber() {
        return minStationNumber;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < minStationNumber) {
            currentStationNumber = 0;
            return;
        }
        if (newCurrentStationNumber > maxStationNumber) {
            currentStationNumber = 9;
            return;
        }

        currentStationNumber = newCurrentStationNumber;
    }

    public void changeNextRadioStation() {
        if (currentStationNumber == maxStationNumber) {
            currentStationNumber = 0;
            return;
        }
        currentStationNumber = currentStationNumber + 1;
    }

    public void changePreviousRadioStation() {
        if (currentStationNumber == minStationNumber) {
            currentStationNumber = 9;
            return;
        }
        currentStationNumber = currentStationNumber - 1;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < minSoundVolume) {
            currentSoundVolume = minSoundVolume;
            return;
        }
        if (newCurrentSoundVolume > maxSoundVolume) {
            currentSoundVolume = maxSoundVolume;
            return;
        }

        currentSoundVolume = newCurrentSoundVolume;
    }

    public void increaseSoundVolume() {
        if (currentSoundVolume == maxSoundVolume) {
            return;
        }
        currentSoundVolume = currentSoundVolume + 1;
    }

    public void decreaseSoundVolume() {
        if (currentSoundVolume == minSoundVolume) {
            return;
        }
        currentSoundVolume = currentSoundVolume - 1;
    }
}



