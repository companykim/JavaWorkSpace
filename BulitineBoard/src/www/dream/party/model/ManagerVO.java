package www.dream.party.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor

public class ManagerVO extends Party {

	public ManagerVO(String name, boolean sex) {
		super(name, sex);
	}
	
	@Override
	public String toString() {
		return "ManagerVO [" + super.toString() + "]";
	}
}
