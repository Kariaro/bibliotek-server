package nu.ssis.a18mosu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.MongoClient;

@Configuration
public class MongoDBConfiguration extends AbstractMongoConfiguration {
  
    @Override
    protected String getDatabaseName() {
        return "library";
    }
  
    @Override
    protected String getMappingBasePackage() {
        return "nu.ssis.a18mosu.model";
    }

	@Override @Bean
	public MongoClient mongoClient() {
		return new MongoClient("127.0.0.1", 27017);
	}
}