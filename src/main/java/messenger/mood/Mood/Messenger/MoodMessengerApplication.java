package messenger.mood.Mood.Messenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoodMessengerApplication {

	public static void main(String[] args) {
		System.out.println("Mood Messenger Starting");
		SpringApplication.run(MoodMessengerApplication.class, args);
	}

}
