package www.dream.party.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberVO extends Party {

	public MemberVO(String name, boolean sex) {
		super(name, sex);
	}

	@Override
	public String toString() {
		return "MemberVO [" + super.toString() + "]";
	}
	
}
