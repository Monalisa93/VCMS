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
	
	

}
