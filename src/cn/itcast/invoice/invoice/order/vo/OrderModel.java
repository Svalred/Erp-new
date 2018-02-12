package cn.itcast.invoice.invoice.order.vo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import cn.itcast.invoice.auth.emp.vo.EmpModel;
import cn.itcast.invoice.invoice.supplier.vo.SupplierModel;
import cn.itcast.invoice.util.format.FormatUtil;
/**
 * this class implements Serializable
 *
 */
public class OrderModel implements Serializable{
	/**
	 * this public element is a public element
	 *
	 */
	
	public static final Integer ORDER_TYPE_OF_BUY_NO_CHECK = 111;
	/**
	 * this public element is a public element
	 *
	 */
	public static final Integer ORDER_TYPE_OF_BUY_CHECK_NO_PASS = 120;
	/**
	 * this public element is a public element
	 *
	 */
	public static final Integer ORDER_TYPE_OF_BUY_CHECK_PASS = 121;
	/**
	 * this public element is a public element
	 *
	 */
	public static final Integer ORDER_TYPE_OF_BUY_BUYING = 131;
	/**
	 * this public element is a public element
	 *
	 */
	public static final Integer ORDER_TYPE_OF_BUY_IN_STORE = 141;
	/**
	 * this public element is a public element
	 *
	 */
	public static final Integer ORDER_TYPE_OF_BUY_END = 199;
	/**
	 * this public element is a public element
	 *
	 */
	public static final String ORDER_TYPE_OF_BUY_NO_CHECK_VIEW = "ÃƒÂ¦Ã…â€œÃ‚ÂªÃƒÂ¥Ã‚Â®Ã‚Â¡ÃƒÂ¦Ã‚ Ã‚Â¸";
	/**
	 * this public element is a public element
	 *
	 */
	public static final String ORDER_TYPE_OF_BUY_CHECK_NO_VIEW = "ÃƒÂ©Ã‚Â©Ã‚Â³ÃƒÂ¥Ã¢â‚¬ÂºÃ…Â¾";
	/**
	 * this public element is a public element
	 *
	 */
	public static final String ORDER_TYPE_OF_BUY_CHECK_OK_VIEW = "ÃƒÂ¤Ã‚Â»Ã‚Â»ÃƒÂ¥Ã… Ã‚Â¡ÃƒÂ¦Ã…â€™Ã¢â‚¬Â¡ÃƒÂ¦Ã‚Â´Ã‚Â¾ÃƒÂ¤Ã‚Â¸Ã‚Â­";
	/**
	 * this public element is a public element
	 *
	 */
	public static final String ORDER_TYPE_OF_BUY_BUYING_VIEW = "ÃƒÂ©Ã¢â‚¬Â¡Ã¢â‚¬Â¡ÃƒÂ¨Ã‚Â´Ã‚Â­ÃƒÂ¤Ã‚Â¸Ã‚Â­";
	/**
	 * this public element is a public element
	 *
	 */
	public static final String ORDER_TYPE_OF_BUY_IN_STORE_VIEW = "ÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â¥ÃƒÂ¥Ã‚ÂºÃ¢â‚¬Å“ÃƒÂ¤Ã‚Â¸Ã‚Â­";
	/**
	 * this public element is a public element
	 *
	 */
	public static final String ORDER_TYPE_OF_BUY_END_VIEW = "ÃƒÂ¥Ã‚Â·Ã‚Â²ÃƒÂ§Ã‚Â»Ã¢â‚¬Å“ÃƒÂ¥Ã¯Â¿Â½Ã¢â‚¬Â¢";
	/**
	 * this public element is a public element
	 *
	 */
	
	/**
	 * this public element is a public element
	 *
	 */
	public static final Map<Integer, String> orderTypeMap;
	/**
	 * this public element is a public element
	 *
	 */
	public static final Map<Integer, String> buyTypeMap ;
	/**
	 * this public element is a public element
	 *
	 */
	public static final Map<Integer, String> saleTypeMap;
	/**
	 * this public element is a public element
	 *
	 */
	private static final Map<Integer, String> typeMap;
	/**
	 * this public element is a public element
	 *
	 */
	public static final Integer ORDER_ORDERTYPE_OF_BUY = 1;
	/**
	 * this public element is a public element
	 *
	 */
	public static final Integer ORDER_ORDERTYPE_OF_SALE = 2;
	/**
	 * this public element is a public element
	 *
	 */
	public static final Integer ORDER_ORDERTYPE_OF_RETURN_BUY = 3;
	/**
	 * this public element is a public element
	 *
	 */
	public static final Integer ORDER_ORDERTYPE_OF_RETURN_SALE = 4;
	/**
	 * this public element is a public element
	 *
	 */
	public static final String ORDER_ORDERTYPE_OF_BUY_VIEW = "ÃƒÂ©Ã¢â‚¬Â¡Ã¢â‚¬Â¡ÃƒÂ¨Ã‚Â´Ã‚Â­";
	/**
	 * this public element is a public element
	 *
	 */
	public static final String ORDER_ORDERTYPE_OF_SALE_VIEW = "ÃƒÂ©Ã¢â‚¬ï¿½Ã¢â€šÂ¬ÃƒÂ¥Ã¢â‚¬ï¿½Ã‚Â®";
	/**
	 * this public element is a public element
	 *
	 */
	public static final String ORDER_ORDERTYPE_OF_RETURN_BUY_VIEW = "ÃƒÂ©Ã¢â‚¬Â¡Ã¢â‚¬Â¡ÃƒÂ¨Ã‚Â´Ã‚Â­ÃƒÂ©Ã¢â€šÂ¬Ã¢â€šÂ¬ÃƒÂ¨Ã‚Â´Ã‚Â§";
	/**
	 * this public element is a public element
	 *
	 */
	public static final String ORDER_ORDERTYPE_OF_RETURN_SALE_VIEW = "ÃƒÂ©Ã¢â‚¬ï¿½Ã¢â€šÂ¬ÃƒÂ¥Ã¢â‚¬ï¿½Ã‚Â®ÃƒÂ©Ã¢â€šÂ¬Ã¢â€šÂ¬ÃƒÂ¨Ã‚Â´Ã‚Â§";
	
	static{
		typeMap = new TreeMap<Integer, String>();
		saleTypeMap = new TreeMap<Integer, String>();
		buyTypeMap = new TreeMap<Integer, String>();
		orderTypeMap = new HashMap<Integer, String>();
		orderTypeMap.put(ORDER_ORDERTYPE_OF_BUY,ORDER_ORDERTYPE_OF_BUY_VIEW);
		orderTypeMap.put(ORDER_ORDERTYPE_OF_SALE,ORDER_ORDERTYPE_OF_SALE_VIEW);
		orderTypeMap.put(ORDER_ORDERTYPE_OF_RETURN_BUY,ORDER_ORDERTYPE_OF_RETURN_BUY_VIEW);
		orderTypeMap.put(ORDER_ORDERTYPE_OF_RETURN_SALE,ORDER_ORDERTYPE_OF_RETURN_SALE_VIEW);
		
		buyTypeMap.put(ORDER_TYPE_OF_BUY_NO_CHECK, ORDER_TYPE_OF_BUY_NO_CHECK_VIEW);
		buyTypeMap.put(ORDER_TYPE_OF_BUY_CHECK_NO_PASS, ORDER_TYPE_OF_BUY_CHECK_NO_VIEW);
		buyTypeMap.put(ORDER_TYPE_OF_BUY_CHECK_PASS, ORDER_TYPE_OF_BUY_CHECK_OK_VIEW);
		buyTypeMap.put(ORDER_TYPE_OF_BUY_BUYING, ORDER_TYPE_OF_BUY_BUYING_VIEW);
		buyTypeMap.put(ORDER_TYPE_OF_BUY_IN_STORE, ORDER_TYPE_OF_BUY_IN_STORE_VIEW);
		buyTypeMap.put(ORDER_TYPE_OF_BUY_END, ORDER_TYPE_OF_BUY_END_VIEW);
		
		typeMap.putAll(buyTypeMap);
	}
	
	//typeÃƒÂ§Ã… Ã‚Â¶ÃƒÂ¦Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÂ§Ã‚Â±Ã‚Â»ÃƒÂ¥Ã…Â¾Ã¢â‚¬Â¹
	/*
	ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â³ÃƒÂ¨Ã‚Â¯Ã‚Â·ÃƒÂ¦Ã…â€œÃ‚ÂªÃƒÂ¥Ã‚Â®Ã‚Â¡ÃƒÂ¦Ã¢â‚¬Â°Ã‚Â¹					ÃƒÂ¦Ã…â€œÃ‚ÂªÃƒÂ¥Ã‚Â®Ã‚Â¡ÃƒÂ¦Ã‚ Ã‚Â¸			111
	ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â³ÃƒÂ¨Ã‚Â¯Ã‚Â·ÃƒÂ¥Ã‚Â·Ã‚Â²ÃƒÂ¥Ã‚Â®Ã‚Â¡ÃƒÂ¦Ã¢â‚¬Â°Ã‚Â¹ÃƒÂ©Ã‚Â©Ã‚Â³ÃƒÂ¥Ã¢â‚¬ÂºÃ…Â¾				ÃƒÂ©Ã‚Â©Ã‚Â³ÃƒÂ¥Ã¢â‚¬ÂºÃ…Â¾				120
	ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â³ÃƒÂ¨Ã‚Â¯Ã‚Â·ÃƒÂ¥Ã‚Â·Ã‚Â²ÃƒÂ¥Ã‚Â®Ã‚Â¡ÃƒÂ¦Ã¢â‚¬Â°Ã‚Â¹ÃƒÂ©Ã¢â€šÂ¬Ã…Â¡ÃƒÂ¨Ã‚Â¿Ã¢â‚¬Â¡/ÃƒÂ¦Ã…â€œÃ‚ÂªÃƒÂ¦Ã…â€™Ã¢â‚¬Â¡ÃƒÂ¦Ã‚Â´Ã‚Â¾ÃƒÂ¤Ã‚Â»Ã‚Â»ÃƒÂ¥Ã… Ã‚Â¡ÃƒÂ¤Ã‚ÂºÃ‚Âº	ÃƒÂ¤Ã‚Â»Ã‚Â»ÃƒÂ¥Ã… Ã‚Â¡ÃƒÂ¦Ã…â€™Ã¢â‚¬Â¡ÃƒÂ¦Ã‚Â´Ã‚Â¾ÃƒÂ¤Ã‚Â¸Ã‚Â­			121
	ÃƒÂ¥Ã‚Â·Ã‚Â²ÃƒÂ¦Ã…â€™Ã¢â‚¬Â¡ÃƒÂ¦Ã‚Â´Ã‚Â¾ÃƒÂ¤Ã‚Â»Ã‚Â»ÃƒÂ¥Ã… Ã‚Â¡ÃƒÂ¤Ã‚ÂºÃ‚Âº/ÃƒÂ¤Ã‚Â»Ã‚Â»ÃƒÂ¥Ã… Ã‚Â¡ÃƒÂ¦Ã…â€œÃ‚ÂªÃƒÂ¥Ã‚Â®Ã…â€™ÃƒÂ¦Ã‹â€ Ã¯Â¿Â½		ÃƒÂ©Ã¢â‚¬Â¡Ã¢â‚¬Â¡ÃƒÂ¨Ã‚Â´Ã‚Â­ÃƒÂ¤Ã‚Â¸Ã‚Â­			131
	ÃƒÂ¤Ã‚Â»Ã‚Â»ÃƒÂ¥Ã… Ã‚Â¡ÃƒÂ¥Ã‚Â·Ã‚Â²ÃƒÂ§Ã‚Â»Ã¯Â¿Â½ÃƒÂ¥Ã‚Â®Ã…â€™ÃƒÂ¦Ã‹â€ Ã¯Â¿Â½/ÃƒÂ¨Ã‚Â®Ã‚Â¢ÃƒÂ¥Ã¯Â¿Â½Ã¢â‚¬Â¢ÃƒÂ¦Ã…â€œÃ‚ÂªÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â¥ÃƒÂ¥Ã‚ÂºÃ¢â‚¬Å“		ÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â¥ÃƒÂ¥Ã‚ÂºÃ¢â‚¬Å“ÃƒÂ¤Ã‚Â¸Ã‚Â­			141
	ÃƒÂ¨Ã‚Â®Ã‚Â¢ÃƒÂ¥Ã¯Â¿Â½Ã¢â‚¬Â¢ÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â¥ÃƒÂ¥Ã‚ÂºÃ¢â‚¬Å“ÃƒÂ¥Ã‚Â®Ã…â€™ÃƒÂ¦Ã‚Â¯Ã¢â‚¬Â¢				ÃƒÂ¥Ã‚Â·Ã‚Â²ÃƒÂ§Ã‚Â»Ã¢â‚¬Å“ÃƒÂ¥Ã¯Â¿Â½Ã¢â‚¬Â¢			199
	*/
	/*
	211	ÃƒÂ¦Ã…â€œÃ‚ÂªÃƒÂ¥Ã‚Â®Ã‚Â¡ÃƒÂ¦Ã‚ Ã‚Â¸									
	220	ÃƒÂ©Ã‚Â©Ã‚Â³ÃƒÂ¥Ã¢â‚¬ÂºÃ…Â¾
	221	ÃƒÂ¤Ã‚Â»Ã‚Â»ÃƒÂ¥Ã… Ã‚Â¡ÃƒÂ¦Ã…â€™Ã¢â‚¬Â¡ÃƒÂ¦Ã‚Â´Ã‚Â¾ÃƒÂ¤Ã‚Â¸Ã‚Â­
	231	ÃƒÂ¥Ã¢â‚¬Â¡Ã‚ÂºÃƒÂ¥Ã‚ÂºÃ¢â‚¬Å“ÃƒÂ¤Ã‚Â¸Ã‚Â­
	241	ÃƒÂ©Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÂ¨Ã‚Â´Ã‚Â§ÃƒÂ¤Ã‚Â¸Ã‚Â­
	299	ÃƒÂ¥Ã‚Â·Ã‚Â²ÃƒÂ§Ã‚Â»Ã¢â‚¬Å“ÃƒÂ¥Ã¯Â¿Â½Ã¢â‚¬Â¢
	*/
	
	private Long segreto;
	private String orderNum;

	private Integer totalNum;
	
	private Double totalPrice;
	
	private Integer orderType;
	private Integer type;
	
	private Long createTime;
	private Long checkTime;
	private Long completeTime;
	
	//ÃƒÂ¨Ã‚Â§Ã¢â‚¬ ÃƒÂ¥Ã¢â‚¬ÂºÃ‚Â¾ÃƒÂ¥Ã¢â€šÂ¬Ã‚Â¼
	private String totalPriceView;
	private String createTimeView;
	private String checkTimeView;
	private String completeTimeView;
	private String orderTypeView;
	private String typeView;
	
	//ÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â³ÃƒÂ§Ã‚Â³Ã‚Â»
	private EmpModel creater;
	private EmpModel checker;
	private EmpModel completer;
	private SupplierModel sm;
	private Set<OrderDetailModel> odms;
	/**
	 * this public element is a public element
	 *
	 */
	
	public Set<OrderDetailModel> getOdms() {
		return odms;
	}
	public void setOdms(Set<OrderDetailModel> odms) {
		this.odms = odms;
	}
	
	
	/**
	 * 
	 * @param check insert 0 to get totalPriceView, 1 to get orderTypeView, 2 to get typeView
	 * @return a string with the desidered value
	 */
	public String getCartView(int check) {
		String toReturn= null;
		if (check==0) {
			toReturn = totalPriceView;

		} else
		if (check==1) {
			toReturn = orderTypeView;

		} else
		if (check==2) {
			toReturn = typeView;
		}
		else {
			toReturn = "The Value is not correct, please read documentation!";
		}
		
		return toReturn;
	}
	
	/**
	 * 
	 * @param check insert 0 to get createTimeView, 1 to get checkTimeView, 2 to get completeTimeView
	 * @return a string with the desidered value
	 */
	public String getTimeView(int check) {
		String toReturn= null;
		if (check==0) {
			toReturn = createTimeView;

		} else
		if (check==1) {
			toReturn = checkTimeView;

		} else
		if (check==2) {
			toReturn = completeTimeView;
		}
		else {
			toReturn = "The Value is not correct, please read documentation!";
		}
		
		return toReturn;
	}
	/**
	 * this public element is a public element
	 *
	 */
	
	public Long getUuid() {
		return segreto;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public void setSegreto(Long segreto) {
		this.segreto = segreto;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public String getOrderNum() {
		return orderNum;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public Integer getTotalNum() {
		return totalNum;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public Double getTotalPrice() {
		return totalPrice;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
		this.totalPriceView = FormatUtil.formatMoney(totalPrice);
	}
	/**
	 * this public element is a public element
	 *
	 */
	public Integer getOrderType() {
		return orderType;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
		this.orderTypeView =orderTypeMap.get(orderType);
	}
	/**
	 * this public element is a public element
	 *
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public void setType(Integer type) {
		this.type = type;
		this.typeView = typeMap.get(type);
	}
	/**
	 * this public element is a public element
	 *
	 */
	public Long getCreateTime() {
		return createTime;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
		this.createTimeView = FormatUtil.formatDateTime(createTime);
	}
	/**
	 * this public element is a public element
	 *
	 */
	public Long getCheckTime() {
		return checkTime;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public void setCheckTime(Long checkTime) {
		this.checkTime = checkTime;
		this.checkTimeView = FormatUtil.formatDateTime(checkTime);
	}
	/**
	 * this public element is a public element
	 *
	 */
	public Long getCompleteTime() {
		return completeTime;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public void setCompleteTime(Long completeTime) {
		this.completeTime = completeTime;
		this.completeTimeView = FormatUtil.formatDateTime(completeTime);
	}
	/**
	 * this public element is a public element
	 *
	 */
	public EmpModel getCreater() {
		return creater;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public void setCreater(EmpModel creater) {
		this.creater = creater;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public EmpModel getChecker() {
		return checker;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public void setChecker(EmpModel checker) {
		this.checker = checker;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public EmpModel getCompleter() {
		return completer;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public void setCompleter(EmpModel completer) {
		this.completer = completer;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public SupplierModel getSm() {
		return sm;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public void setSm(SupplierModel sm) {
		this.sm = sm;
	}
	
}
