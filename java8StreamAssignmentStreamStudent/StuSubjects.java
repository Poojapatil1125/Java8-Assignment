package java8StreamAssignmentStreamStudent;

public class StuSubjects {
	private int maths, physics, chemistry, English, hindi;

	public StuSubjects(int maths, int physics, int chemistry, int english, int hindi) {
		super();
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		English = english;
		this.hindi = hindi;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getEnglish() {
		return English;
	}

	public void setEnglish(int english) {
		English = english;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	@Override
	public String toString() {
		return "StuSubjects [maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + ", English="
				+ English + ", hindi=" + hindi + "]";
	}

}
