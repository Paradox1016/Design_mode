package Command;

public class LightOnCommand implements Command {
	
	Light light;
	
	public LightOnCommand(Light light) {
		this.light=light;
	}
	@Override
	public void execute() {
		// TODO 自动生成的方法存根
		light.on();
	}

}
