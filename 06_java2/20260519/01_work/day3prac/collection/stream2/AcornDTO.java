package day3prac.collection.stream2;

public class AcornDTO {

	String id;
	String name;

	public AcornDTO(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public AcornDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AcornDTO [id=" + id + ", name=" + name + "]";
	}

}
