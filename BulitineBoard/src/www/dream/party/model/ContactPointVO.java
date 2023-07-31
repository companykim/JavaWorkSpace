package www.dream.party.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ContactPointVO {
	private String cpType;
	private String cpVal;

	@Override
	public String toString() {
		return "[cpType=" + cpType + ", cpVal=" + cpVal + "]";
	}
	
}
