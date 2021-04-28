package com.example.demo.infrastructure.configuration;

import com.example.demo.application.ports.in.CalculateHoursUseCase;
import com.example.demo.application.ports.out.ServicesRepository;
import com.example.demo.application.services.CalculateHoursService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfiguration {

    @Bean
    public DataSource dataSourceBean() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("datasource/schema.sql")
                .addScript("datasource/data.sql")
                .build();
    }

    @Bean
    public CalculateHoursUseCase calculateHoursUseCase(
            ServicesRepository repository
    ) {
        return new CalculateHoursService(repository);
    }
}
