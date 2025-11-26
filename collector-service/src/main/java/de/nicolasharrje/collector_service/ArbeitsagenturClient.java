package de.nicolasharrje.collector_service;  
  
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import de.nicolasharrje.dtos.JobSearchResponse;
  
@Service  
public class ArbeitsagenturClient {
    private final RestClient restClient;  
  
    public ArbeitsagenturClient() {  
        this.restClient = RestClient.builder()  
                .baseUrl("https://rest.arbeitsagentur.de")  
                .defaultHeader("X-API-Key", "jobboerse-jobsuche")  
                .build();  
    }

	/**
	 * Search for open job offerings using the Arbeitsagentur API.
	 * @param jobTitle the job title or keywords to search for
	 * @param location the location (e.g., city name)
	 * @param field the job field (e.g., "Informatik" for IT jobs)
	 * @param radius in km around the location
	 * @param workingHours can have these values: vz=VOLLZEIT, tz=TEILZEIT, snw=SCHICHT_NACHTARBEIT_WOCHENENDE, ho=HEIM_TELEARBEIT
	 * @return the API response as a String
	 */
	public JobSearchResponse searchJobs(String jobTitle, String location, String field, int radius, String workingHours) {
		// Implement the method to call the Arbeitsagentur API and return the response
		return restClient.get()
			.uri(uriBuilder -> uriBuilder
				.path("/jobboerse/jobsuche-service/pc/v4/jobs")
				.queryParam("was", jobTitle)
				.queryParam("wo", location)
				.queryParam("berufsfeld", field)
				// Angebotsart: 1=ARBEIT; 2=SELBSTAENDIGKEIT; 4=AUSBILDUNG/Duales Studium; 34=Praktikum/Trainee
				.queryParam("angebotsart", 1)
				.queryParam("umkreis", radius)
				.queryParam("arbeitszeit", workingHours)
				.build())
			.retrieve()
			.onStatus(status -> !status.is2xxSuccessful(),  
                          (request, response) -> {  
                              // hier könntest du Fehler loggen, Exception werfen etc.  
                          })  
                .body(JobSearchResponse.class); // wird über Jackson gemappt
	}
}