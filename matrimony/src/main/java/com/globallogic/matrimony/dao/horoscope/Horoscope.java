package com.globallogic.matrimony.dao.horoscope;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import ch.qos.logback.core.subst.Token.Type;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Horoscope")
@Getter
@Setter
@NoArgsConstructor
public class Horoscope {

	@Id
	@Column(name = "USER_ID")
	Long id;

	@Enumerated(EnumType.STRING)
	STAR star;
	@Enumerated(EnumType.STRING)
	ZODIAC_SIGN zodiac;
	boolean isDoshamPresent;

	GOTHRAM gothram;

	public enum STAR {
		ANUSHAM, BHARANI, REVATHI, MOOLAM
	}

	public enum ZODIAC_SIGN {
		SCORPIO, TAURUS, GEMINI, CANCER
	}

	public enum GOTHRAM {
		SIVAGOTHRAM, VISHNUGOTHRAM
	}

}
