package Test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CustomerUserBean implements Serializable
{
   private long phno;
   private String name,city,mid;
   public CustomerUserBean()
   {
   }
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getMid() {
	return mid;
}
public void setMid(String mid) {
	this.mid = mid;
}
   
   
}
