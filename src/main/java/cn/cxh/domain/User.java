package cn.cxh.domain;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
//@Table(name = "smbms_user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer userId; //id
	@Column(nullable = true)
	private String userName; //用户名
	@Column(nullable = true)
	private String password; //密码
	@Column(nullable = true)
	private String email; //邮箱
	@Column(nullable = true)
	private String state; //状态
	@Column(nullable = true)
	private String createDate;  //创建时间

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}



}
