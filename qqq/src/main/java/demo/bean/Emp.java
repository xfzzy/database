package demo.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="empaaa")
public class Emp {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer eid;
private String ename;
private String sex;
@DateTimeFormat(pattern="yyyy-MM-dd")
private  Date hire;
private Integer did;
@ManyToOne(fetch=FetchType.EAGER)
@JoinColumn(name="did",insertable=false,updatable=false)
private Dept dept;
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public Date getHire() {
	return hire;
}
public void setHire(Date hire) {
	this.hire = hire;
}
public Integer getDid() {
	return did;
}
public void setDid(Integer did) {
	this.did = did;
}
public Dept getDept() {
	return dept;
}
public void setDept(Dept dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Emp [eid=" + eid + ", ename=" + ename + ", sex=" + sex + ", hire=" + hire + ", did=" + did + "]";
}

}
