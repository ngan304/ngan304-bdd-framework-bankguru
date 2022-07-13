package commons_Bankguru;

import com.github.javafaker.Faker;

public class DataHelper {
	private Faker faker;

	public static DataHelper getData() {
		return new DataHelper();
	}

	public DataHelper() {
		faker = new Faker();
	}

	public String getEmailAddress() {
		return faker.internet().emailAddress();
	}
}
