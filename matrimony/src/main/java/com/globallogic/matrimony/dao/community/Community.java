package com.globallogic.matrimony.dao.community;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Community")
@Getter
@Setter
@NoArgsConstructor
public class Community {

	@Id
	@Column(name = "USER_ID")
	Long id;

	@Enumerated(EnumType.STRING)
	CASTE caste;

	@Enumerated(EnumType.STRING)
	SUBCASTE subCaste;

	@Enumerated(EnumType.STRING)
	RELIGION religion;

	public enum CASTE {
		CASTE1, CASTE2, CASTE3
	}

	public enum SUBCASTE {
		CASTE1_1, CASTE1_2, CASTE1_3, CASTE2_1, CASTE2_2, CASTE3_1, CASTE3_2
	}

	public enum RELIGION {
		HINDU, CHRISTIAN, MUSLIM
	}
}
