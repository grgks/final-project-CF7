package gr.aueb.cf.final_project_CF7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FinalProjectCf7Application {

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectCf7Application.class, args);
	}

}
