package net.namelos.Command;

public class StereoOnWithCommand implements Command {
    Stero stero;

    public StereoOnWithCommand(Stero stero) {
        this.stero = stero;
    }

    @Override
    public void execute() {
        stero.on();
        stero.setCD();
        stero.setVolume(11);
    }
}
