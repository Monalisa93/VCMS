package sg.edu.nus.iss.vmcs.system;

public interface Observable {
	
	public void addObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notify(int eventType);

}
