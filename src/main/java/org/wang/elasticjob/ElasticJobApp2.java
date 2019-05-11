package org.wang.elasticjob;

import com.cxytiandi.elasticjob.annotation.EnableElasticJob;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * Created by VULCAN on 2018/11/23.
 */
@SpringBootApplication
@EnableElasticJob
@ComponentScan(basePackages = {"org.wang.elasticjob"})
public class ElasticJobApp2 {
    public static void main(String[] args) {

        SpringApplication.run(ElasticJobApp2.class,args);
    }
}