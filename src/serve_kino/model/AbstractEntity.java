package serve_kino.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public abstract class AbstractEntity implements Serializable {

	private UUID id;

	public AbstractEntity() {

	}

	public UUID getId() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		AbstractEntity that = (AbstractEntity) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {

		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "AbstractEntity{" + "id=" + id + '}';
	}
}
