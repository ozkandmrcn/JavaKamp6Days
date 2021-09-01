package entities.concretes;

import java.time.LocalDate;

public class CourseTaken extends Course {

	private int id;
	private int stepCompleted;
	private LocalDate localDateStart;
	private LocalDate localDateFinish;
	
	
	public CourseTaken(int id, int stepCompleted, LocalDate localDateStart, LocalDate localDateFinish ,int courseId, Category category, String courseName, String description, String imagePath,
			Teacher teacher, int stepNumber) {
		super(courseId, category, courseName, description, imagePath, teacher, stepNumber);
		this.id = id;
		this.stepCompleted = stepCompleted;
		this.localDateStart = localDateStart;
		this.localDateFinish = localDateFinish;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStepCompleted() {
		return stepCompleted;
	}

	public void setStepCompleted(int stepCompleted) {
		this.stepCompleted = stepCompleted;
	}

	public LocalDate getLocalDateStart() {
		return localDateStart;
	}

	public void setLocalDateStart(LocalDate localDateStart) {
		this.localDateStart = localDateStart;
	}

	public LocalDate getLocalDateFinish() {
		return localDateFinish;
	}

	public void setLocalDateFinish(LocalDate localDateFinish) {
		this.localDateFinish = localDateFinish;
	}
	
}
