package sg.edu.nus.iss.vmcs.system;

public interface PersistanceMappingInterface {
	
	public Object fetch(int id);

	public void set(int id, Object object);
	
	public abstract void save(Object object);

}
