package www.dream.framework.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor

public abstract class MasterEntity extends Entity {
	private Date regDt;
	private Date uptDt;


	public MasterEntity(String id, Date regDt, Date uptDt) {
		super(id);
		this.regDt = regDt;
		this.uptDt = uptDt;
	}

	@Override
	public String toString() {
		return super.toString() + ", regDt=" + regDt + ", uptDt=" + uptDt;
	}
	
}
