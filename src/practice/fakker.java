package practice;

import com.github.javafaker.Faker;

public class fakker {
	
	  public static void main(String[] args) {
	        // Create a new instance of Faker
	        Faker faker = new Faker();

	        // Generate random data
	        String firstName = faker.name().firstName();
	        String lastName = faker.name().lastName();
	        String streetAddress = faker.address().streetAddress();
	        String city = faker.address().city();
	        String email = faker.internet().emailAddress();
	        String phoneNumber = faker.phoneNumber().cellPhone();

	        // Print the generated data
	        System.out.println("First Name: " + firstName);
	        System.out.println("Last Name: " + lastName);
	        System.out.println("Street Address: " + streetAddress);
	        System.out.println("City: " + city);
	        System.out.println("Email: " + email);
	        System.out.println("Phone Number: " + phoneNumber);
	        
	        
	        // Generate random data
	        String firstName1 = faker.name().firstName();
	        String lastName11 = faker.name().lastName();
	        String streetAddress1 = faker.address().streetAddress();
	        String city1= faker.address().city();
	        String email1 = faker.internet().emailAddress();
	        String phoneNumber1 = faker.phoneNumber().cellPhone();

	        // Print the generated data
	        System.out.println("First Name: " + firstName1);
	        System.out.println("Last Name: " + lastName11);
	        System.out.println("Street Address: " + streetAddress1);
	        System.out.println("City: " + city1);
	        System.out.println("Email: " + email1);
	        System.out.println("Phone Number: " + phoneNumber1);
	        
	        System.out.println(faker.name().firstName());
	        System.out.println(faker.name().firstName());
	        System.out.println(faker.name().firstName());
	        System.out.println(faker.name().firstName());
	        System.out.println(faker.name().firstName());
	        System.out.println(faker.name().firstName());
	        System.out.println(faker.name().firstName());
	    }
	

}
