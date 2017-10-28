package sg.edu.nus.iss.vmcs.system;

import sg.edu.nus.iss.vmcs.store.StoreItem;

public class DBPersistanceApiInterfaceImpl implements PersistanceApiInterface{

	@Override
	public void persist(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Persisted using DBPersistanceApiInterfaceImpl");
	}
	
	@Override
	public Object getItem(int id) {
		// TODO Auto-generated method stub
		System.out.println("get Item using DBPersistanceApiInterfaceImpl");
		return null;
	}

	@Override
	public void setItem(int id, Object object) {
		// TODO Auto-generated method stub
		System.out.println("set Item using DBPersistanceApiInterfaceImpl");
	}
}
