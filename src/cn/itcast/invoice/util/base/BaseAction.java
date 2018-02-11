package cn.itcast.invoice.util.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.itcast.invoice.auth.emp.vo.EmpModel;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * this class extends ActionSupport and is the base for many classes
 *
 */
public class BaseAction extends ActionSupport{
	/**
	 * this public element is a public element
	 *
	 */
	public static final String LIST = "list";
	/**
	 * this public element is a public element
	 *
	 */
	public static final String TO_LIST = "toList";
	/**
	 * this public element is a public element
	 *
	 */
	public static final String INPUT = "input";
	
	//Ã©Â¡ÂµÃ§Â ï¿½Ã¥â‚¬Â¼
	/**
	 * this public element is a public element
	 *
	 */
	public Integer pageNum = 1;
	//Ã¦Â¯ï¿½Ã©Â¡ÂµÃ¦ËœÂ¾Ã§Â¤ÂºÃ¦â€¢Â°Ã¦ï¿½Â®Ã¦â‚¬Â»Ã©â€¡ï¿½
	/**
	 * this public element is a public element
	 *
	 */
	public Integer pageCount = 10;
	//Ã¦Å“â‚¬Ã¥Â¤Â§Ã©Â¡ÂµÃ§Â ï¿½Ã¥â‚¬Â¼
	/**
	 * this public element is a public element
	 *
	 */
	public Integer maxPageNum ;
	//Ã¦â€¢Â°Ã¦ï¿½Â®Ã¦â‚¬Â»Ã©â€¡ï¿½
	/**
	 * this public element is a public element
	 *
	 */
	public Integer dataTotal;
	
	/**
	 * this public element is a public element
	 *
	 */ 
	private String actionName;
	
	/**
	 * this public element is a public element
	 *
	 */
	public String getActionName() {
		//Ã¦Â Â¹Ã¦ï¿½Â®Ã¥Â½â€œÃ¥â€°ï¿½Ã¦â€°Â§Ã¨Â¡Å’Ã§Å¡â€žActionÃ§Â±Â»Ã¨Å½Â·Ã¥ï¿½â€“ActionÃ§Â±Â»Ã§Å¡â€žÃ¥ï¿½ï¿½Ã§Â§Â°Ã¤Â¸Â­Ã§Å¡â€žÃ¥Â±â‚¬Ã©Æ’Â¨Ã¥Â­â€”Ã§Â¬Â¦Ã¤Â¸Â²
		String actionName =getClass().getSimpleName();	//DepAction
		String subName = actionName.substring(0,actionName.length()-6);
		return subName.substring(0,1).toLowerCase()+subName.substring(1);
	} 
	/*
	public static void main(String[] args) {
		String s = "StoreDetailAction";
		String a = s.substring(0,s.length()-6);
		//Ã¥ï¿½â€“Ã¥â€¡ÂºÃ§Â¬Â¬Ã¤Â¸â‚¬Ã¤Â¸ÂªÃ¥Â­â€”Ã¦Â¯ï¿½
		String first = a.substring(0,1).toLowerCase();
		System.out.println(first+a.substring(1));
	}
	*/
	
	protected void setDataTotal(Integer dataTotal){
		this.dataTotal = dataTotal;
		maxPageNum = (dataTotal + pageCount -1) / pageCount; 
	}
	
	protected void put(String name,Object obj){
		ActionContext.getContext().put(name, obj);
	}
	
	protected void putSession(String name,Object obj){
		ActionContext.getContext().getSession().put(name, obj);
	}

	protected EmpModel getLogin(){
		return (EmpModel) ActionContext.getContext().getSession().get("loginEm");
	}
	
	protected HttpServletRequest getRequest(){
		return ServletActionContext.getRequest();
	}
	
	protected HttpServletResponse getResponse(){
		return ServletActionContext.getResponse();
	}
}
