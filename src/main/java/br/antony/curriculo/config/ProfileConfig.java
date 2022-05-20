package br.antony.curriculo.config;

import br.antony.curriculo.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class ProfileConfig {

    @Autowired
    private DBService dbService;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String dll;

    @Bean
    public boolean dbInstance(){
        if(dll.equals("create")){
            this.dbService.dbInstance();
        }
        return false;
    }
}
