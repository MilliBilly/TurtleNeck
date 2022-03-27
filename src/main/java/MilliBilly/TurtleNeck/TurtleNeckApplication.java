package MilliBilly.TurtleNeck;

import MilliBilly.TurtleNeck.controller.ProfileController;
import MilliBilly.TurtleNeck.domain.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TurtleNeckApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurtleNeckApplication.class, args);

		ProfileController profile = new ProfileController();
		Member skim = new Member(1L, "skim", "default" );
		Member hyospark = new Member(2L, "hyospark", "default" );
		Member hyoon = new Member(2L, "hyoon", "default" );
//		profile.getProfile(hyoon);
//		profile.getProfile(hyospark);
//		profile.getProfile(skim);
		System.out.println();
	}
}
