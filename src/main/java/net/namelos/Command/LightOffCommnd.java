package net.namelos.Command;

public class LightOffCommnd implements Command {
    Light light;

    public LightOffCommnd(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
