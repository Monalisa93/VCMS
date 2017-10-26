package sg.edu.nus.iss.vmcs.system;

import java.io.IOException;
import java.util.Properties;

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
			this.fileLoader.saveProperty((Properties)obj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
