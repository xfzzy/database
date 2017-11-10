package demo.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="deptaaa")
public class Dept {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer did;
private String dname;
@OneToMany(fetch=FetchType.EAGER,mappedBy="dept")
private Set<Emp> emps=new HashSet<Emp>();
public Integer getDid() {
	return did;
}
public void setDid(Integer did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public Set<Emp> getEmps() {
	return emps;
}
public void setEmps(Set<Emp> emps) {
	this.emps = emps;
}
@Override
public String toString() {
	return "Dept [did=" + did + ", dname=" + dname + "]";
}

}
