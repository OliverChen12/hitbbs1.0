package co.yiiu.hitbbs.config;

import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by NPEteam.
 * Cohitright (c) 2023, All Rights Reserved.
 * https://yiiu.co
 */
@Configuration
public class FlywayConfig {

    @Resource
    private DataSource dataSource;

    @PostConstruct
    @DependsOn("dataSourceHelper")
    public void migrate() {
        Flyway flyway = Flyway.configure().dataSource(dataSource).locations("classpath:db/migration",
                "filesystem:db/migration").baselineOnMigrate(true).load();
        flyway.migrate();
    }

}
