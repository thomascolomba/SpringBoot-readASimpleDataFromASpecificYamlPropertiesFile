package readASimpleDataFromASpecificYamlPropertiesFile.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:fileWithAFancyName.yaml")
@ConfigurationProperties
public class MyConfigurationBean {
    private String myString;
	public String getMyString() {
		return myString;
	}
	public void setMyString(String myString) {
		this.myString = myString;
	}
}