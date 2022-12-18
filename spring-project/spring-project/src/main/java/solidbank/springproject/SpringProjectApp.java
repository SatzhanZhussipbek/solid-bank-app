package solidbank.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class SpringProjectApp {

	public static void main(String[] args) {
		System.out.print("""
				Welcome to CLI bank service
				Enter operation number:
				1 - show accounts
				2 - create account
				3 - deposit
				4 - withdraw
				5 - transfer
				6 - this message
				7 - exit
				""");
		ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");
		SpringApplication.run(SpringProjectApp.class, args);
		Scanner scan = new Scanner(System.in);
		MyCLI myCLI = context.getBean(MyCLI.class);
		AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);
		while (true) {
			String userResponse = scan.nextLine();
			if (userResponse.equals("1")) {
				accountBasicCLI.getAccounts("1");
			}
			if(userResponse.equals("2")) {
				System.out.println("Choose the account type you would like to have");
				//myCLI.setType(scanner.nextLine());
				myCLI.requestAccountType();
				accountBasicCLI.createAccountRequest("1");
			}
			if(userResponse.equals("7")) {
				System.out.println("The application is closed now.");
				break;
			}
			else {
				System.out.println("The wrong key! Try again.");
			}
		}
		((ClassPathXmlApplicationContext) context).close();

	}

}
