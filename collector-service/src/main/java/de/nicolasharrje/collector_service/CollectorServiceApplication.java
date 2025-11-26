package de.nicolasharrje.collector_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.nicolasharrje.dtos.JobSearchResponse;

@SpringBootApplication
public class CollectorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectorServiceApplication.class, args);

		ArbeitsagenturClient client = new ArbeitsagenturClient();
		JobSearchResponse response = client.searchJobs("Data Engineer", "Hamburg", "Informatik", 50, "vz");
		System.out.println(response);
	}

}
