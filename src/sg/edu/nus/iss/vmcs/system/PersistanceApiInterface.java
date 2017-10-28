package sg.edu.nus.iss.vmcs.system;

public interface PersistanceApiInterface {
	
	public Object getItem(int id);
	
	public void setItem(int id, Object object);

	public void persist(Object obj);
}
