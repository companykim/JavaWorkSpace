package www.dream.party.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import www.dream.framework.model.MasterEntity;

@Getter
@NoArgsConstructor

public abstract class Party extends MasterEntity {
	private String name;
	private boolean sex;
	private List<ContactPointVO> listContactPoint = new ArrayList<>();

	public Party(String name, boolean sex) {
		this.name = name;
		this.sex = sex;
	}
	
	public void addCP(ContactPointVO cp) {
		// null pointer
		listContactPoint.add(cp);
	}
	@Override
	public String toString() {
		return super.toString() + ", name=" + name + ", sex=" + sex + ", 연락처들=" + listContactPoint;
	}
	
	
}
