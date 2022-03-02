package MilliBilly.TurtleNeck;

import MilliBilly.TurtleNeck.entity.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TurtleNeckApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurtleNeckApplication.class, args);


		Member skim = new Member(1L, "skim", "default" );
		Member hyospark = new Member(2L, "hyospark", "default" );
		Member hyoon = new Member(2L, "hyoon", "default" );
	}
}
