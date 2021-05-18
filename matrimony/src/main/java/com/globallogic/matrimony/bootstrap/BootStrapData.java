package com.globallogic.matrimony.bootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.globallogic.matrimony.dao.address.Location;
import com.globallogic.matrimony.dao.address.Location.CITIZENSHIP;
import com.globallogic.matrimony.dao.address.Location.CITY;
import com.globallogic.matrimony.dao.address.Location.STATE;
import com.globallogic.matrimony.dao.credentials.Credentials;
import com.globallogic.matrimony.dao.user.User;
import com.globallogic.matrimony.repository.CredentialsRepository;
import com.globallogic.matrimony.repository.LocationRepository;
import com.globallogic.matrimony.repository.UserDetailsRepository;
import com.globallogic.matrimony.repository.UserRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	@Autowired
	CredentialsRepository credentialsRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserDetailsRepository userDetailsRepository;

	@Autowired
	LocationRepository locationRepository;

	private static final Logger LOG = LoggerFactory
			.getLogger(BootStrapData.class);

	@Override
	public void run(String... args) throws Exception {

		LOG.info("Provisioning data into the Tables...");
		saveCredentials();
		saveuser();
		saveLocation();

	}

	private void saveCredentials() {
		credentialsRepository.save(new Credentials(1l, "user", "user123"));
	}

	private void saveLocation() {
		Location location = new Location(1l, CITY.CHENNAI, STATE.TAMIL_NADU,
				CITIZENSHIP.INDIAN);
		locationRepository.save(location);
	}

	private void saveuser() {
		User user = new User();
		user.setId(1l);
		user.setMailId("user@user.com");
		user.setMobileNumber("9898989898");
		user.setName("UserOne");
		user.setPreferenceId("5");
		userRepository.save(user);
	}

}
