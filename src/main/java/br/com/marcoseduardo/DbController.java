package br.com.marcoseduardo;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author marcos.eduardo
 *
 */
@RestController
@RequestMapping("/db")
public class DbController {

    @Autowired
    private HikariDataSource dataSource;

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }    
    
    @GetMapping("/pool/name")
    public String getPoolName() {
        return dataSource.getHikariConfigMXBean().getPoolName();
    }

    @GetMapping("/pool/size")
    public String getPoolSize() {
        return String.valueOf(dataSource.getHikariConfigMXBean().getMaximumPoolSize());
    }
}
