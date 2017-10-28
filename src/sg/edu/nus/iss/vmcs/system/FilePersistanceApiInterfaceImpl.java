package sg.edu.nus.iss.vmcs.system;

import java.io.IOException;
import java.util.Properties;

import sg.edu.nus.iss.vmcs.store.StoreItem;

public class FilePersistanceApiInterfaceImpl implements PersistanceApiInterface{

	private FilePropertyLoader fileLoader;
	
	public FilePersistanceApiInterfaceImpl(FilePropertyLoader fileLoader) {
		super();
		this.fileLoader = fileLoader;
	}

	@Override
	public void persist(Object obj) {
		// TODO Auto-generated method stub
		try {
			this.fileLoader.saveProperty();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Object getItem(int id) {
		// TODO Auto-generated method stub
		return fileLoader.getItem(id);
	}

	@Override
	public void setItem(int id, Object object) {
		// TODO Auto-generated method stub
		fileLoader.setItem(id, (StoreItem) object);
	}
	
	

}
