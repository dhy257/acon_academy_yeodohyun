package 실습;

public class 회원조회 {
	private String member_id;
	private String name;
	private String age;
	private String reg_date;
	private String trainer_id;

	private int chest;
	private int back;
	private int arm;
	private int shoulder;
	private int leg;

	public 회원조회() {
	}

	public 회원조회(String member_id, String name, String age, String reg_date, String trainer_id, int chest, int back,
			int arm, int shoulder, int leg) {
		this.member_id = member_id;
		this.name = name;
		this.age = age;
		this.reg_date = reg_date;
		this.trainer_id = trainer_id;
		this.chest = chest;
		this.back = back;
		this.arm = arm;
		this.shoulder = shoulder;
		this.leg = leg;
	}

	public String getMember_id() {
		return member_id;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public String getReg_date() {
		return reg_date;
	}

	public String getTrainer_id() {
		return trainer_id;
	}

	public int getChest() {
		return chest;
	}

	public int getBack() {
		return back;
	}

	public int getArm() {
		return arm;
	}

	public int getShoulder() {
		return shoulder;
	}

	public int getLeg() {
		return leg;
	}
}
