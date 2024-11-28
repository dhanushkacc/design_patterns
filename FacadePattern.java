class FacadePattern {

    // Subsystem 1- TV
static class TV {
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    public void setChannel(int channel) {
        System.out.println("TV is set to channel " + channel);
    }
}

// Subsystem 2- Sound System
static class SoundSystem {
    public void turnOn() {
        System.out.println("Sound system is turned ON");
    }

    public void setVolume(int level) {
        System.out.println("Sound system volume is set to " + level);
    }
}


// The Facade
static class  WatchingFacade {
    private TV tv;
    private SoundSystem soundSystem;

    public WatchingFacade(TV tv, SoundSystem soundSystem) {
        this.tv = tv;
        this.soundSystem = soundSystem;
    }

    public void startwatching() {
        System.out.println("Setting up all");
        tv.turnOn();
        tv.setChannel(1);
        soundSystem.turnOn();
        soundSystem.setVolume(10);
    }
}


    public static void main(String[] args) {
        // Subsystems
        TV tv = new TV();
        SoundSystem soundSystem = new SoundSystem();

        // Facade
        WatchingFacade facade = new WatchingFacade(tv, soundSystem);
        facade.startwatching();
    }


}