public class CommanderPattern {
    // Receiver- Light
static class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }
}
// Command-TurnOnLightCommand
static class TurnOnLightCommand {
    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}

// RemoteControl
static class RemoteControl {
    private TurnOnLightCommand command;

    public void setCommand(TurnOnLightCommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

    public static void main(String[] args) {
 
        Light kitchenLight = new Light();

        TurnOnLightCommand turnOnCommand = new TurnOnLightCommand(kitchenLight);
        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOnCommand);
        remote.pressButton();
    }


    
}
