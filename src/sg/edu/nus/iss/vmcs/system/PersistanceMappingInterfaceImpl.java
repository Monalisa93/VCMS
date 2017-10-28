package sg.edu.nus.iss.vmcs.system;

public class PersistanceMappingInterfaceImpl implements PersistanceMappingInterface {
	
	private PersistanceApiInterface api;
	
	public PersistanceMappingInterfaceImpl(PersistanceApiInterface api) {
		this.api = api;
	}

	@Override
	public void save(Object object) {
		// TODO Auto-generated method stub
		api.persist(object);
	}

	@Override
	public Object fetch(int id) {
		// TODO Auto-generated method stub
		return api.getItem(id);
	}

	@Override
	public void set(int id, Object object) {
		// TODO Auto-generated method stub
		api.setItem(id, object);
	}
	
	

}
