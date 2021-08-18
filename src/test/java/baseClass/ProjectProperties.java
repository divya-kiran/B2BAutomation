package baseClass;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProjectProperties {
	  public String envname;
	  private Properties properties; 
	  
	    
	  
	    public String PropertiesReader()  {
	        
	    	InputStream is = getClass().getClassLoader()
	            .getResourceAsStream("project.properties");
	        this.properties = new Properties();
	        try {
				this.properties.load(is);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return this.properties.getProperty("envname");
	    }
	 
	    
	  
	
}
