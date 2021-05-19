package com.globallogic.matrimony.bootstrap;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.globallogic.matrimony.dao.community.Community;
import com.globallogic.matrimony.dao.community.Community.CASTE;
import com.globallogic.matrimony.dao.community.Community.RELIGION;
import com.globallogic.matrimony.dao.community.Community.SUBCASTE;
import com.globallogic.matrimony.dao.credentials.Credentials;
import com.globallogic.matrimony.dao.familydetails.FamilyDetails;
import com.globallogic.matrimony.dao.horoscope.Horoscope;
import com.globallogic.matrimony.dao.horoscope.Horoscope.STAR;
import com.globallogic.matrimony.dao.horoscope.Horoscope.ZODIAC_SIGN;
import com.globallogic.matrimony.dao.location.Location;
import com.globallogic.matrimony.dao.location.Location.CITIZENSHIP;
import com.globallogic.matrimony.dao.location.Location.CITY;
import com.globallogic.matrimony.dao.location.Location.STATE;
import com.globallogic.matrimony.dao.user.User;
import com.globallogic.matrimony.dao.user.UserDetails;
import com.globallogic.matrimony.dao.user.UserDetails.EATING_HABITS;
import com.globallogic.matrimony.dao.user.UserDetails.MARITAL_STATUS;
import com.globallogic.matrimony.dao.user.UserDetails.MOTHER_TONGUE;
import com.globallogic.matrimony.repository.CommunityRepository;
import com.globallogic.matrimony.repository.CredentialsRepository;
import com.globallogic.matrimony.repository.FamilyDetailsRepository;
import com.globallogic.matrimony.repository.HoroscopeRepository;
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

	@Autowired
	HoroscopeRepository horoscopeRepository;

	@Autowired
	FamilyDetailsRepository familyDetailsRepository;

	@Autowired
	CommunityRepository communityRepository;

	private static final Logger LOG = LoggerFactory
			.getLogger(BootStrapData.class);

	@Override
	public void run(String... args) throws Exception {

		LOG.info("Provisioning data into the Tables...");
		saveCredentials();
		saveuser();
		saveLocation();
		saveUserDetails();
		saveHoroscope();
		saveFamilyDetails();
		saveCommunity();

	}

	private void saveCommunity() {
		Community community = new Community();
		community.setCaste(CASTE.CASTE1);
		community.setSubCaste(SUBCASTE.CASTE1_3);
		community.setId(1l);
		community.setReligion(RELIGION.HINDU);
		communityRepository.save(community);
	}

	private void saveHoroscope() {
		Horoscope horoscope = new Horoscope();
		horoscope.setId(1l);
		horoscope.setDoshamPresent(true);
		horoscope.setStar(STAR.BHARANI);
		horoscope.setZodiac(ZODIAC_SIGN.CANCER);
		horoscope.setGothram(null);
		horoscopeRepository.save(horoscope);
	}

	private void saveFamilyDetails() {
		FamilyDetails familyDetails = new FamilyDetails();
		familyDetails.setBrothers(2);
		familyDetails.setMarriedBrothers(1);
		familyDetails.setSisters(0);
		familyDetails.setMarriedSisters(0);
		familyDetails.setFatherName("MyFather");
		familyDetails.setMotherName("MyMother");
		familyDetails.setFatherOccupation("Doctor");
		familyDetails.setMotherOccupation(null);
		familyDetails.setId(1l);
		familyDetailsRepository.save(familyDetails);
	}

	private void saveUserDetails() throws ParseException {
		UserDetails userDetails = new UserDetails();
		userDetails.setAge(26);
		userDetails.setEatingHabits(EATING_HABITS.NON_VEGETARIAN);
		userDetails.setHeightInCms(171);
		userDetails.setId(1l);
		userDetails.setWeight(72);
		userDetails.setSalary(400000);
		userDetails.setMotherTongue(MOTHER_TONGUE.TAMIL);
		userDetails.setMaritalStatus(MARITAL_STATUS.SINGLE);
		userDetails.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy")
				.parse("22/11/1995"));
		userDetailsRepository.save(userDetails);
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
