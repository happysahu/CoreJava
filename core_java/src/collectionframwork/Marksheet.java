package collectionframwork;

public class Marksheet implements Comparable<Marksheet> {
	
	private String RollNo;
	private String fName;
	private String lName;
	private int phy;
	private int ch;
	private int mat;
	public String getRollNo() {
		return RollNo;
	}
	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	@Override
	public int compareTo(Marksheet m) {
		
		return this.RollNo.compareTo(m.RollNo);
	}

}
