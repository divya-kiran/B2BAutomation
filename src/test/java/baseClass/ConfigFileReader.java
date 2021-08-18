package baseClass;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader{

	private Properties properties;
	private final String propertyFilePath= System.getProperty("user.dir") + "/src/main/resources/config.properties";
	ProjectProperties Pp = new ProjectProperties();
	
	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	public String getApplicationUrl()  {
		String envname = Pp.PropertiesReader();
		String url = properties.getProperty(envname+"_URL");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file");
	}
	
	public String getBrowserName(){
		String browsername = properties.getProperty("BROWSER");
		if(browsername != null) return browsername;
		else throw new RuntimeException("No Browser name specifiec");
	}
	
	public String getReportConfigPath(){
		String reportConfigPath = System.getProperty("user.dir")+"\\src\\main\\resources\\extent-config.xml";
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
}
