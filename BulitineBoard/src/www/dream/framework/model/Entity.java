package www.dream.framework.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor

public abstract class Entity { // 자식 클래스에서 반드시 오버라이딩 해야만 사용할 수 있는 메소드
	private String id; // 외부에서 사용불가

	public Entity(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "id=" + id;
	}
	
}
