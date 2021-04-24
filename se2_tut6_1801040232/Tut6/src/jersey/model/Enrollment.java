package jersey.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Enrollment {

	private Integer scId;
	private Integer stuId;
	private String cId;
	private Integer Mark;

	public Enrollment(Integer scId, Integer stuId, String cId, Integer mark) {
		super();
		this.scId = scId;
		this.stuId = stuId;
		this.cId = cId;
		Mark = mark;
	}

	public Enrollment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getScId() {
		return scId;
	}

	public void setScId(Integer scId) {
		this.scId = scId;
	}

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public Integer getMark() {
		return Mark;
	}

	public void setMark(Integer mark) {
		Mark = mark;
	}

}
