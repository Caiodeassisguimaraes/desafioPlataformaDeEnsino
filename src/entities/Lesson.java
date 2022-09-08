package entities;

public abstract class Lesson {
	protected String title;

	public Lesson() {
		super();
	}

	public Lesson(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public abstract int duration();

}
