package cn.itcast.invoice.auth.emp.vo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import cn.itcast.invoice.auth.dep.vo.DepModel;
import cn.itcast.invoice.auth.role.vo.RoleModel;
import cn.itcast.invoice.util.format.FormatUtil;
/**
 * this class implements Serializable
 *
 */
public class EmpModel implements Serializable{
	/**
	 * public field
	 */
	public static final Integer EMP_GENDER_OF_MAN = 1;
	/**
	 * public field
	 */
	public static final Integer EMP_GENDER_OF_WOMAN = 0;
	/**
	 * public field
	 */
	public static final String EMP_GENDER_OF_MAN_VIEW = "ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½Ãƒâ€šÃ‚Â·";
	/**
	 * public field
	 */
	public static final String EMP_GENDER_OF_WOMAN_VIEW = "ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â¥Ãƒâ€šÃ‚Â³";
	
	/**
	 * public field
	 */
	public static Map<Integer, String> genderMap;
	
	static{
		genderMap = new HashMap<Integer, String>();
		genderMap.put(EMP_GENDER_OF_MAN, EMP_GENDER_OF_MAN_VIEW);
		genderMap.put(EMP_GENDER_OF_WOMAN, EMP_GENDER_OF_WOMAN_VIEW);
	}
	
	private Long segreto;
	//ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬ ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½Ãƒâ€šÃ‚Â¨ÃƒÆ’Ã‚Â¦Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â·ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¯Ã‚Â¿Ã‚Â½
	private String userName;
	//ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â¯ÃƒÂ¢Ã¢â€šÂ¬ ÃƒÆ’Ã‚Â§Ãƒâ€š ÃƒÂ¯Ã‚Â¿Ã‚Â½
	private String pwd;
	//ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã¢â‚¬Å“Ãƒâ€¦Ã‚Â¸ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â®Ãƒâ€¦Ã‚Â¾ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â§ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¯Ã‚Â¿Ã‚Â½
	private String name;
	
	private String email;
	private String tele;
	private String address;
	private String lastLoginIp;
	
	private Long birthday;
	private Long lastLoginTime;

	private Integer gender;
	private Integer loginTimes;
	
	//ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â§ÃƒÂ¢Ã¢â€šÂ¬ ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒâ€šÃ‚Â¾ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â¼
	private String birthdayView;
	private String lastLoginTimeView;
	private String genderView;
	
	//ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦Ãƒâ€šÃ‚Â³ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â³Ãƒâ€šÃ‚Â»
	private DepModel dm;
	private Set<RoleModel> roles;
	
	//ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¦Ãƒâ€š Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â©Ãƒâ€šÃ‚ÂªÃƒâ€¦Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¾ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦ÃƒÆ’Ã‚Â¥Ãƒâ€¦ Ãƒâ€šÃ‚Â©ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â­ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬ï¿½ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â®Ãƒâ€šÃ‚Âµ
	private String resValue;
	
	/**
	 * public field
	 */
	public String getResValue() {
		return resValue;
	}

	/**
	 * public field
	 */
	public void setResValue(String resValue) {
		this.resValue = resValue;
	}

	/**
	 * public field
	 */
	public Set<RoleModel> getRoles() {
		return roles;
	}

	/**
	 * public field
	 */
	public void setRoles(Set<RoleModel> roles) {
		this.roles = roles;
	}

	/**
	 * public field
	 */
	public Long getUuid() {
		return segreto;
	}

	/**
	 * 
	 * @param check insert 0 to get birthdayView, 1 to get genderView, 2 to get lastLoginTimeView
	 * @return a string with the desidered value
	 */
	public String getView(int check) {
		String toReturn = null;
		if (check == 0) {
			toReturn= birthdayView;
		}
		if (check == 1) {
			toReturn= genderView;
		}
		if (check == 2) {
			toReturn =lastLoginTimeView;
		}
			
		return toReturn;
	}
	

	/**
	 * public field
	 */
	public void setSegreto(Long segreto) {
		this.segreto = segreto;
	}

	/**
	 * public field
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * public field
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	/**
	 * public field
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * 
	 * @param check insert 0 to get name, 1 to get email, 2 to get tele, 3 to get address
	 * @return a string with the desidered value
	 */
	public String getPersonalInformation(int check) {
		String toReturn = null;
		if (check == 0) {
			toReturn= name;
		} else
		if (check == 1) {
			toReturn= email;
		} else
		if (check == 2) {
			toReturn =tele;
		}else
		if (check == 3) {
			toReturn =address;
		} else {
			toReturn = "The Value is not correct, please read documentation!";
		}
			
		return toReturn;
	}

	/**
	 * public field
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * public field
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * public field
	 */
	public void setTele(String tele) {
		this.tele = tele;
	}

	/**
	 * public field
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * public field
	 */
	public String getLastLoginIp() {
		return lastLoginIp;
	}

	/**
	 * public field
	 */
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	/**
	 * public field
	 */
	public Long getBirthday() {
		return birthday;
	}

	/**
	 * public field
	 */
	public void setBirthday(Long birthday) {
		this.birthday = birthday;
		this.birthdayView = FormatUtil.formatDate(birthday);
	}

	/**
	 * public field
	 */
	public Long getLastLoginTime() {
		return lastLoginTime;
	}

	/**
	 * public field
	 */
	public void setLastLoginTime(Long lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
		this.lastLoginTimeView = FormatUtil.formatDate(lastLoginTime);
	}

	/**
	 * public field
	 */
	public Integer getGender() {
		return gender;
	}

	/**
	 * public field
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
		this.genderView = genderMap.get(gender);
	}

	/**
	 * public field
	 */
	public Integer getLoginTimes() {
		return loginTimes;
	}

	/**
	 * public field
	 */
	public void setLoginTimes(Integer loginTimes) {
		this.loginTimes = loginTimes;
	}

	/**
	 * public field
	 */
	public DepModel getDm() {
		return dm;
	}

	/**
	 * public field
	 */
	public void setDm(DepModel dm) {
		this.dm = dm;
	}
	
}
