package WithoutCreatingBean;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;  
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phones
	 */
	public List<Integer> getPhones() {
		return phones;
	}
	/**
	 * @param phones the phones to set
	 */
	public void setPhones(List<Integer> phones) {
		this.phones = phones;
	}
	@Value("0011")
private int id;
	@Value("Vikash")
private String name;
	@Value("#{456678}")
private List<Integer>phones;
}
