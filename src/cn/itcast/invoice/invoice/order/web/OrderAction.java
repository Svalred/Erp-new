package cn.itcast.invoice.invoice.order.web;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import cn.itcast.invoice.auth.emp.business.ebi.EmpEbi;
import cn.itcast.invoice.auth.emp.vo.EmpModel;
import cn.itcast.invoice.invoice.goods.business.ebi.GoodsEbi;
import cn.itcast.invoice.invoice.goods.vo.GoodsModel;
import cn.itcast.invoice.invoice.goodstype.business.ebi.GoodsTypeEbi;
import cn.itcast.invoice.invoice.goodstype.vo.GoodsTypeModel;
import cn.itcast.invoice.invoice.order.business.ebi.OrderDetailEbi;
import cn.itcast.invoice.invoice.order.business.ebi.OrderEbi;
import cn.itcast.invoice.invoice.order.vo.OrderDetailModel;
import cn.itcast.invoice.invoice.order.vo.OrderModel;
import cn.itcast.invoice.invoice.order.vo.OrderQueryModel;
import cn.itcast.invoice.invoice.store.business.ebi.StoreEbi;
import cn.itcast.invoice.invoice.store.vo.StoreModel;
import cn.itcast.invoice.invoice.supplier.business.ebi.SupplierEbi;
import cn.itcast.invoice.invoice.supplier.vo.SupplierModel;
import cn.itcast.invoice.util.base.BaseAction;
/**
 * this class extends BaseAction
 *
 */
public class OrderAction extends BaseAction{
	/**
	 * this public element is a public element
	 *
	 */
	public OrderModel om = new OrderModel();
	/**
	 * this public element is a public element
	 *
	 */
	public OrderQueryModel oqm = new OrderQueryModel();

	private OrderEbi orderEbi;
	private SupplierEbi supplierEbi;
	private GoodsTypeEbi goodsTypeEbi;
	private GoodsEbi goodsEbi;
	private EmpEbi empEbi;
	private StoreEbi storeEbi;
	private OrderDetailEbi orderDetailEbi;
	
	/**
	 * this public element is a public element
	 *
	 */
	public void setOrderDetailEbi(OrderDetailEbi orderDetailEbi) {
		this.orderDetailEbi = orderDetailEbi;
	}

	/**
	 * this public element is a public element
	 *
	 */
	public void setStoreEbi(StoreEbi storeEbi) {
		this.storeEbi = storeEbi;
	}

	/**
	 * this public element is a public element
	 *
	 */
	public void setEmpEbi(EmpEbi empEbi) {
		this.empEbi = empEbi;
	}

	/**
	 * this public element is a public element
	 *
	 */
	public void setGoodsEbi(GoodsEbi goodsEbi) {
		this.goodsEbi = goodsEbi;
	}

	/**
	 * this public element is a public element
	 *
	 */
	public void setGoodsTypeEbi(GoodsTypeEbi goodsTypeEbi) {
		this.goodsTypeEbi = goodsTypeEbi;
	}

	/**
	 * this public element is a public element
	 *
	 */
	public void setSupplierEbi(SupplierEbi supplierEbi) {
		this.supplierEbi = supplierEbi;
	}

	/**
	 * this public element is a public element
	 *
	 */
	public void setOrderEbi(OrderEbi orderEbi) {
		this.orderEbi = orderEbi;
	}

	//ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â·Ãƒâ€šÃ‚Â³ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬ï¿½ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¡Ãƒâ€šÃ‚Â¨ÃƒÆ’Ã‚Â©Ãƒâ€šÃ‚Â¡Ãƒâ€šÃ‚ÂµÃƒÆ’Ã‚Â©ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â¢
	/**
	 * this public element is a public element
	 *
	 */
	public String list(){
		setDataTotal(orderEbi.getCount(oqm));
		List<OrderModel> orderList = orderEbi.getAll(oqm,pageNum,pageCount);
		put("orderList",orderList);
		return LIST;
	}

	//ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¿ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â­Ãƒâ€¹Ã…â€œ/ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¿Ãƒâ€šÃ‚Â®ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½Ãƒâ€šÃ‚Â¹
	/**
	 * this public element is a public element
	 *
	 */
	public String save(){
		if(om.getUuid()== null){
			orderEbi.save(om);
		}else{
			orderEbi.update(om);
		}
		return TO_LIST;
	}

	//ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â·Ãƒâ€šÃ‚Â³ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â·Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¦Ã‚Â Ãƒâ€šÃ‚Â /ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¿Ãƒâ€šÃ‚Â®ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½Ãƒâ€šÃ‚Â¹ÃƒÆ’Ã‚Â©Ãƒâ€šÃ‚Â¡Ãƒâ€šÃ‚ÂµÃƒÆ’Ã‚Â©ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â¢
	/**
	 * this public element is a public element
	 *
	 */
	public String input(){
		if(om.getUuid()!=null){
			om = orderEbi.get(om.getUuid());
		}
		return INPUT;
	}
	//ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â·Ãƒâ€šÃ‚Â³ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â´Ãƒâ€šÃ‚Â­ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â®Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÆ’Ã‚Â©Ãƒâ€šÃ‚Â¡Ãƒâ€šÃ‚Âµ
	
	/**
	 * this public element is a public element
	 *
	 */
	public String buyInput(){
		List<SupplierModel> supplierList = supplierEbi.getAll();
		//ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€¹Ã…â€œÃƒÆ’Ã‚Â¦Ãƒâ€¹Ã¢â‚¬Â ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¿ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â»Ãƒâ€šÃ‚Â¤ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¯Ãƒâ€šÃ‚Â¥ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®
		//ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¦Ãƒâ€¹Ã…â€œÃƒâ€šÃ‚Â¯ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚Â­ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â²Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¿ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â»Ãƒâ€šÃ‚Â¤ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°
		//ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â²Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¾ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¿ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â»Ãƒâ€šÃ‚Â¤ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°
		//ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â¾Ãƒâ€šÃ‚ÂªÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â½Ãƒâ€šÃ‚Â¯ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¾ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¼Ãƒâ€¦Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â¤ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â®Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¯Ãƒâ€šÃ‚Â¥ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¾ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¦Ãƒâ€¹Ã…â€œÃƒâ€šÃ‚Â¯ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â¦ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¿ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¼Ãƒâ€¦Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã‚Â¾Ãƒâ€¦Ã¢â‚¬Å“ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¿ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢Ãƒâ€šÃ‚Â¤
		/*
		for(int i = supplierList.size()-1;i>=0;i--){
			SupplierModel sm = supplierList.get(i);
			List<GoodsTypeModel> gtms = new ArrayList(sm.getGtms());
			//ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â¾Ãƒâ€šÃ‚ÂªÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â½Ãƒâ€šÃ‚Â¯ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚Â­ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®
			for(int j = gtms.size()-1;j>=0;j--){
				GoodsTypeModel gtm = gtms.get(j);
				if(gtm.getGms().size() == 0){
					gtms.remove(j);
				}
			}
			if(gtms.size() == 0){
				supplierList.remove(i);
			}
		}
		*/
		int flag=0;
		for(int i = supplierList.size()-1;i>=0;i--){
			flag=0;
			SupplierModel sm = supplierList.get(i);
			//List<GoodsTypeModel> gtms = new ArrayList(sm.getGtms());
			//ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â§ÃƒÆ’Ã‚Â¨Ãƒâ€ Ã¢â‚¬â„¢Ãƒâ€šÃ‚Â½ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¼Ãƒâ€¹Ã…â€œÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚ÂºÃƒâ€¦Ã‚Â½ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€¦Ã‚Â ÃƒÆ’Ã‚Â©ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬Å“Ãƒâ€šÃ‚Â¹ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â¡Ãƒâ€¹Ã¢â‚¬Â 
			List<GoodsTypeModel> gtms = goodsTypeEbi.getAllBySupplier(sm.getUuid());
			//ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â¾Ãƒâ€šÃ‚ÂªÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â½Ãƒâ€šÃ‚Â¯ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚Â­ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®
			for(int j = gtms.size()-1;j>=0;j--){
				GoodsTypeModel gtm = gtms.get(j);
				if(gtm.getGms().size() > 0){
					flag=1;
					continue;
				}
			}
			if(flag==1) {
				continue;
		    }else supplierList.remove(i);
		}

		List<GoodsTypeModel> gtmList = goodsTypeEbi.getAllUnionBySupplier(supplierList.get(0).getUuid());
		List<GoodsModel> gmList = goodsEbi.getAllByGtmUuid(gtmList.get(0).getUuid());
		put("supplierList",supplierList);
		put("gtmList",gtmList);
		put("gmList",gmList);
		return "buyInput";
	}
	
	/*
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		
		al.add("aa1");
		al.add("bb1");
		al.add("cc1");
		al.add("dd");
		
		for(int i = al.size()-1;i>=0;i--){
			String s = al.get(i);
			if(s.contains("1")){
				al.remove(i);
			}
		}
		
		for(String s:al){
			System.out.println(s);
		}
	}
	*/
	
	
	/*
	public String buyInput(){
		//ÃƒÆ’Ã‚Â¥Ãƒâ€¦Ã‚Â Ãƒâ€šÃ‚Â ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â½ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¾ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®
		//ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬ï¿½Ãƒâ€šÃ‚Â®ÃƒÆ’Ã‚Â©Ãƒâ€šÃ‚Â¢Ãƒâ€¹Ã…â€œÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¼Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚ÂªÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â²Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¾ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¯Ãƒâ€šÃ‚Â¥ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¢Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¥Ãƒâ€¦Ã‚Â Ãƒâ€šÃ‚Â ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â½
		//ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â§Ãƒâ€šÃ‚Â£ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â Ãƒâ€šÃ‚Â³ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬Å“Ãƒâ€šÃ‚Â¹ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â¡Ãƒâ€¹Ã¢â‚¬Â ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¼Ãƒâ€¦Ã‚Â¡
		//ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¯Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬Å“ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€¦Ã‚Â½ÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¼Ãƒâ€¦Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¿ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¿Ãƒâ€šÃ‚Â­ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â»Ãƒâ€šÃ‚Â£ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€¹Ã¢â‚¬Â ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â°ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â²Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¾ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢Ãƒâ€šÃ‚Â¤ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°
		//ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â§Ãƒâ€šÃ‚Â£ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â Ãƒâ€šÃ‚Â³ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬Å“Ãƒâ€šÃ‚Â¹ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â¡Ãƒâ€¹Ã¢â‚¬Â ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚ÂºÃƒâ€¦Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¼Ãƒâ€¦Ã‚Â¡
		//ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã‚Â¸Ãƒâ€šÃ‚Â¥ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¯Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬ï¿½Ãƒâ€šÃ‚Â¶ÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¼Ãƒâ€¦Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒâ€šÃ‚Â´ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã‚Â½Ãƒâ€šÃ‚Â¥ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â°ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â²Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¾ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¿ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â»Ãƒâ€šÃ‚Â¤ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°
		//ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã‚Â¸Ãƒâ€šÃ‚Â¥ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¾ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â   ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¾ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦Ãƒâ€šÃ‚Â³ÃƒÆ’Ã‚Â¨ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«
		//ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬ï¿½Ãƒâ€šÃ‚Â®ÃƒÆ’Ã‚Â©Ãƒâ€šÃ‚Â¢Ãƒâ€¹Ã…â€œÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã‚Â¾ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¼Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã‚Â¸ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚ÂªÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¾ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦Ãƒâ€šÃ‚Â·ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â¤Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚ÂªÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¼Ãƒâ€¦Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¦Ãƒâ€¹Ã…â€œÃƒâ€šÃ‚Â¯ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚Â­ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â²Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¼Ãƒâ€¦Ã‚Â¸
		//ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã‚Â¸Ãƒâ€šÃ‚Â¥ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¾ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â   ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¾ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦Ãƒâ€šÃ‚Â³ÃƒÆ’Ã‚Â¨ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¼Ãƒâ€¦Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦Ãƒâ€šÃ‚Â³ÃƒÆ’Ã‚Â¨ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ distinct
		List<SupplierModel> supplierList = supplierEbi.getAllUnionTwo();
		//ÃƒÆ’Ã‚Â¥Ãƒâ€¦Ã‚Â Ãƒâ€šÃ‚Â ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â½ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â¬Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚ÂªÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¾ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®
		/*
		1ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â·		A	B	C
				a1	b1	
				a2	b2
				a3
		*/
	/*
		List<GoodsTypeModel> gtmList = goodsTypeEbi.getAllUnionBySupplier(supplierList.get(0).getUuid());
		//ÃƒÆ’Ã‚Â¥Ãƒâ€¦Ã‚Â Ãƒâ€šÃ‚Â ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â½ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â¬Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚ÂªÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®
		List<GoodsModel> gmList = goodsEbi.getAllByGtmUuid(gtmList.get(0).getUuid());
		//ÃƒÆ’Ã‚Â¥Ãƒâ€¦Ã‚Â Ãƒâ€šÃ‚Â ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â½ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â¬Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚ÂªÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â»Ãƒâ€šÃ‚Â·ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â Ãƒâ€šÃ‚Â¼ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®(ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â¥)
		//GoodsModel gm = gmList.get(0);
		//put("gm",gm);
		/*
		put("supplierList",supplierList);
		put("gtmList",gtmList);
		put("gmList",gmList);
		
		return "buyInput";
	}*/

	//ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢Ãƒâ€šÃ‚Â¤
	/**
	 * this public element is a public element
	 *
	 */
	public String delete(){
		orderEbi.delete(om);
		return TO_LIST;
	}
	
	//--ajax----------------------------
	/**
	 * this public element is a public element
	 *
	 */
	public Long supplierUuid;
	/**
	 * this public element is a public element
	 *
	 */
	public Long goodsTypeUuid;
	/**
	 * this public element is a public element
	 *
	 */
	public Long goodsUuid;
	/**
	 * this public element is a public element
	 *
	 */
	public String used;
	/**
	 * this public element is a public element
	 *
	 */
	
	private List<GoodsTypeModel> gtmList;
	private List<GoodsModel> gmList;
	private GoodsModel gm;
	
	/**
	 * this public element is a public element
	 *
	 */
	public GoodsModel getGm() {
		return gm;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public List<GoodsTypeModel> getGtmList() {
		return gtmList;
	}
	/**
	 * this public element is a public element
	 *
	 */
	public List<GoodsModel> getGmList() {
		return gmList;
	}

	/**
	 * this public element is a public element
	 *
	 */
	public String ajaxGetGtmAndGm(){
		//ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â Ãƒâ€šÃ‚Â¹ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¾ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾uuidÃƒÆ’Ã‚Â¨Ãƒâ€¦Ã‚Â½Ãƒâ€šÃ‚Â·ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬Å“ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€¦Ã‚Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®
		//ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚Â­ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â¿ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦ÃƒÆ’Ã‚Â©Ãƒâ€šÃ‚Â¡Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½
		gtmList = goodsTypeEbi.getAllUnionBySupplier(supplierUuid);
		//ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â Ãƒâ€šÃ‚Â¹ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â¬Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚ÂªÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¨Ãƒâ€¦Ã‚Â½Ãƒâ€šÃ‚Â·ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬Å“ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â¯Ãƒâ€šÃ‚Â¹ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½
		gmList = goodsEbi.getAllByGtmUuid(gtmList.get(0).getUuid());
		//ÃƒÆ’Ã‚Â¨Ãƒâ€¦Ã‚Â½Ãƒâ€šÃ‚Â·ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬Å“ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â¬Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚ÂªÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¿Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â¯
		gm = gmList.get(0);
		return "ajaxGetGtmAndGm";
	}
	
	//ÃƒÆ’Ã‚Â©Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¿ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â»Ãƒâ€šÃ‚Â¤ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â·Ãƒâ€šÃ‚Â²ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â»ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â¿ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½Ãƒâ€šÃ‚Â¨ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®
	/**
	 * this public element is a public element
	 *
	 */
	public String ajaxGetGtmAndGm2(){
		//ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â§Ãƒâ€šÃ‚Â£ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã‚Â¾ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡Ãƒâ€šÃ‚ÂºÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â·Ãƒâ€šÃ‚Â²ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â»ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â¿ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½Ãƒâ€šÃ‚Â¨ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â¯Ãƒâ€šÃ‚Â¹ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾uuid
		String[] uuidsArr = used.split(",");
		//ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â°ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â¿ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½Ãƒâ€šÃ‚Â¨ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¿ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ uuidÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚ÂºÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚ÂªÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â»ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾/ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€¹Ã¢â‚¬Â 
		Set<Long> uuids = new HashSet<Long>();
		for(String uuidStr:uuidsArr){
			uuids.add(new Long(uuidStr));
		}
		
		//ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â Ãƒâ€šÃ‚Â¹ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¾ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾uuidÃƒÆ’Ã‚Â¨Ãƒâ€¦Ã‚Â½Ãƒâ€šÃ‚Â·ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬Å“ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€¦Ã‚Â½ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®
		//ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚Â­ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â¿ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦ÃƒÆ’Ã‚Â©Ãƒâ€šÃ‚Â¡Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½
		gtmList = goodsTypeEbi.getAllUnionBySupplier(supplierUuid);
		//1.ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã‚Â¾Ãƒâ€¦Ã¢â‚¬Å“ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚Â­ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â©Ãƒâ€ Ã¢â‚¬â„¢Ãƒâ€šÃ‚Â½ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â¿ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½Ãƒâ€šÃ‚Â¨ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¿ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¼Ãƒâ€¦Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¯Ãƒâ€šÃ‚Â¥ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢Ãƒâ€šÃ‚Â¤
		//1.xÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã‚Â¾Ãƒâ€¦Ã¢â‚¬Å“ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚Â­ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã‚Â¸ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚ÂªÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â²Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â¿ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½Ãƒâ€šÃ‚Â¨ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¿ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÆ’Ã‚Â¯Ãƒâ€šÃ‚Â¼Ãƒâ€¦Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¯Ãƒâ€šÃ‚Â¥ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¿ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢
		int flag=0;
		for(int i = gtmList.size()-1;i>=0;i--){
			flag = 0;
			GoodsTypeModel gtm = gtmList.get(i);
			//ÃƒÂ¦Ã‚Â Ã‚Â¹ÃƒÂ¦Ã¯Â¿Â½Ã‚Â®ÃƒÂ¥Ã¢â‚¬Â¢Ã¢â‚¬Â ÃƒÂ¥Ã¢â‚¬Å“Ã¯Â¿Â½ÃƒÂ§Ã‚Â±Ã‚Â»ÃƒÂ¥Ã‹â€ Ã‚Â«ÃƒÂ¨Ã…Â½Ã‚Â·ÃƒÂ¥Ã¯Â¿Â½Ã¢â‚¬â€œÃƒÂ¥Ã¢â‚¬Â¢Ã¢â‚¬Â ÃƒÂ¥Ã¢â‚¬Å“Ã¯Â¿Â½
			gmList = goodsEbi.getAllByGtmUuid(gtm.getUuid());
			for(GoodsModel temp:gmList){
				if(!uuids.contains(temp.getUuid())){
					flag = 1;
					continue;
				}
			}
			//ÃƒÂ¨Ã‚Â¯Ã‚Â¥ÃƒÂ§Ã‚Â±Ã‚Â»ÃƒÂ¥Ã‹â€ Ã‚Â«ÃƒÂ¤Ã‚Â¸Ã‚Â­ÃƒÂ¦Ã¢â‚¬Â°Ã¢â€šÂ¬ÃƒÂ¦Ã…â€œÃ¢â‚¬Â°ÃƒÂ¥Ã¢â‚¬Â¢Ã¢â‚¬Â ÃƒÂ¥Ã¢â‚¬Å“Ã¯Â¿Â½ÃƒÂ¥Ã¢â‚¬Â¦Ã‚Â¨ÃƒÂ©Ã†â€™Ã‚Â¨ÃƒÂ¤Ã‚Â½Ã‚Â¿ÃƒÂ§Ã¢â‚¬ï¿½Ã‚Â¨ÃƒÂ¨Ã‚Â¿Ã¢â‚¬Â¡
			if(flag ==1){
				continue;
			} else gtmList.remove(i);
		}

		
		//ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â Ãƒâ€šÃ‚Â¹ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â¬Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚ÂªÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â±Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â«ÃƒÆ’Ã‚Â¨Ãƒâ€¦Ã‚Â½Ãƒâ€šÃ‚Â·ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬Å“ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â¯Ãƒâ€šÃ‚Â¹ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½
		gmList = goodsEbi.getAllByGtmUuid(gtmList.get(0).getUuid());
		//ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢Ãƒâ€šÃ‚Â¤ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â·Ãƒâ€šÃ‚Â²ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â»ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â¿ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½Ãƒâ€šÃ‚Â¨ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¿ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½
		for(int i = gmList.size()-1;i>=0;i--){
			GoodsModel gm = gmList.get(i);
			if(uuids.contains(gm.getUuid())){
				//ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¯Ãƒâ€šÃ‚Â¥ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â·Ãƒâ€šÃ‚Â²ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â»ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â¿ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½Ãƒâ€šÃ‚Â¨ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¿ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡
				gmList.remove(i);
			}
		}
		
		//ÃƒÆ’Ã‚Â¨Ãƒâ€¦Ã‚Â½Ãƒâ€šÃ‚Â·ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬Å“ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â¬Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¸Ãƒâ€šÃ‚ÂªÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¿Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â¯
		gm = gmList.get(0);
		return "ajaxGetGtmAndGm";
	}
	
	/**
	 * this public element is a public element
	 *
	 */
	public String ajaxGetGm(){
		gmList = goodsEbi.getAllByGtmUuid(goodsTypeUuid);
		gm = gmList.get(0);
		return "ajaxGetGm";
	}
	
	/**
	 * this public element is a public element
	 *
	 */
	public String ajaxGetOne(){
		gm = goodsEbi.get(goodsUuid);
		return "ajaxGetOne";
	}
	
	/**
	 * this public element is a public element
	 *
	 */
	public Long[] goodsUuids;
	/**
	 * this public element is a public element
	 *
	 */
	public Integer[] nums;
	/**
	 * this public element is a public element
	 *
	 */
	public Double[] prices;
	
	//ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½Ãƒâ€¦Ã‚Â¸ÃƒÆ’Ã‚Â¦Ãƒâ€¹Ã¢â‚¬Â ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â´Ãƒâ€šÃ‚Â­ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â®Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢
	/**
	 * this public element is a public element
	 *
	 */
	public String buyOrder(){
		//ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½Ãƒâ€šÃ‚Â¶ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â©Ãƒâ€šÃ‚Â¡Ãƒâ€šÃ‚ÂµÃƒÆ’Ã‚Â©ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€šÃ‚Â¼
		//om.sm.uuid->om
		/*
		System.out.println(om.getSm().getUuid());
		System.out.println("-----------------");
		for(Long temp:goodsUuids){
			System.out.println(temp);
		}
		System.out.println("-----------------");
		for(Integer temp:nums){
			System.out.println(temp);
		}
		System.out.println("-----------------");
		for(Double temp:prices){
			System.out.println(temp);
		}
		*/
		orderEbi.save(getLogin(),om,goodsUuids,nums,prices);
		return TO_LIST;
	}
	
	/**
	 * this public element is a public element
	 *
	 */
	public String buyDetailList(){
		om = orderEbi.get(om.getUuid());
		return "buyDetailList";
	}
	
	//--ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â®Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â Ãƒâ€šÃ‚Â¸ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒâ€šÃ‚Â¸ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦Ãƒâ€šÃ‚Â³----------------------
	
	/**
	 * 
	 * @param check insert 0 to get buyCheck, 1 to get toBuyCheckDetail, 2 to get buyCheckPass, 3 to get buyCheckNoPass
	 * @return a string with the desidered value
	 */
	public String Check(int check){
		String toReturn = null;
		if (check==0) {
		setDataTotal(orderEbi.getCountByTypes(oqm));
		List<OrderModel> orderList = orderEbi.getAllNoCheckOrder(oqm,pageNum,pageCount);
		put("orderList",orderList);
		toReturn= "buyCheck";
		}
		//ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â®Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â Ãƒâ€šÃ‚Â¸ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¯Ãƒâ€šÃ‚Â¦ÃƒÆ’Ã‚Â¦Ãƒâ€ Ã¢â‚¬â„¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦ÃƒÆ’Ã‚Â©Ãƒâ€šÃ‚Â¡Ãƒâ€šÃ‚Âµ
		else if (check==1) {
			//ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â Ãƒâ€šÃ‚Â¹ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â®Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾uuidÃƒÆ’Ã‚Â¨Ãƒâ€¦Ã‚Â½Ãƒâ€šÃ‚Â·ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬Å“ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â®Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®
			om = orderEbi.get(om.getUuid());
			toReturn = "toBuyCheckDetail";
		}
		//ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â´Ãƒâ€šÃ‚Â­ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â®Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â Ãƒâ€šÃ‚Â¸ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¡ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¿ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡
		else if (check==2) {
			orderEbi.buyCheckPass(om.getUuid(),getLogin());
			toReturn = "toBuyCheck";
		}
		//ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â´Ãƒâ€šÃ‚Â­ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â®Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â Ãƒâ€šÃ‚Â¸ÃƒÆ’Ã‚Â©Ãƒâ€šÃ‚Â©Ãƒâ€šÃ‚Â³ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒâ€¦Ã‚Â¾
		else if (check==3) {
			orderEbi.buyCheckNoPass(om.getUuid(),getLogin());
			toReturn = "toBuyCheck";
		}
		else {
			toReturn = "The Value is not correct, please read documentation!";
		}
		return toReturn;
	}

	/**
	 * 
	 * @param check insert 0 to get assignTask, 1 to get assignTaskList, 2 to get assignTaskDetail
	 * @return a string with the desidered value
	 */
	public String assignTask(int check){
		String toReturn = null;
		if (check==0) {
		//ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬â„¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â´Ãƒâ€šÃ‚Â¾ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â»Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¦Ã‚Â Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚ÂºÃƒâ€šÃ‚Âº  om.uuid   om.completer.uuid
		orderEbi.assignTask(om);
		toReturn = "toAssignTaskList";
		} else
		if (check ==1) {
			//ÃƒÆ’Ã‚Â¨Ãƒâ€¦Ã‚Â½Ãƒâ€šÃ‚Â·ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬Å“ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â¾ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â»Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¦Ã‚Â Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â€šÂ¬Ã‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€¹Ã¢â‚¬Â 
			List<OrderModel> orderList = orderEbi.getAllTasks(oqm,pageNum,pageCount);
			put("orderList",orderList);
			//ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â·Ãƒâ€šÃ‚Â³ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â¬ÃƒÆ’Ã‚Â©Ãƒâ€šÃ‚Â¡Ãƒâ€šÃ‚ÂµÃƒÆ’Ã‚Â©ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â¢
			return "assignTaskList";
		}
		else if (check ==2) {
			//ÃƒÆ’Ã‚Â¥Ãƒâ€¦Ã‚Â Ãƒâ€šÃ‚Â ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â½ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¿ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¾ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÆ’Ã‚Â©Ãƒâ€ Ã¢â‚¬â„¢Ãƒâ€šÃ‚Â¨ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬ï¿½Ãƒâ€šÃ‚Â¨ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‹Å“Ãƒâ€¹Ã…â€œÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â·Ãƒâ€šÃ‚Â¥
			Long depUuid = getLogin().getDm().getUuid();
			List<EmpModel> empList = empEbi.getAllByDep(depUuid);
			put("empList",empList);
			om = orderEbi.get(om.getUuid());
			return "assignTaskDetail";
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
	
	public String queryTask(){
		//ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â Ãƒâ€šÃ‚Â¹ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚ÂºÃƒâ€šÃ‚ÂºÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â¿Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â¯ÃƒÆ’Ã‚Â¨Ãƒâ€¦Ã‚Â½Ãƒâ€šÃ‚Â·ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬Å“ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â¯Ãƒâ€šÃ‚Â¹ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â»Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¦Ã‚Â Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬ï¿½ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â¡Ãƒâ€šÃ‚Â¨
		List<OrderModel> orderList = orderEbi.getAllByCompleter(oqm,pageNum,pageCount,getLogin());
		put("orderList",orderList);
		return "queryTask";
	}
	/**
	 * this public element is a public element
	 *
	 */
	
	public String toTaskDetail(){
		om = orderEbi.get(om.getUuid());
		return "toTaskDetail";
	}
	
	/**
	 * this public element is a public element
	 *
	 */
	public String completeTask(){
		orderEbi.endTask(om.getUuid());
		return "toQueryTask";
	}
	
	//--ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â»Ãƒâ€šÃ‚Â»ÃƒÆ’Ã‚Â¥Ãƒâ€¦Ã‚Â Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¥Ãƒâ€¹Ã¢â‚¬Â ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â»ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€¦Ã‚Â¸----------------------
	
	//ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â»ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦Ãƒâ€šÃ‚Â¥ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã…â€œ
	/**
	 * this public element is a public element
	 *
	 */
	public String inGoodsList(){
		//ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â±ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÆ’Ã‚Â§Ãƒâ€šÃ‚Â¤Ãƒâ€šÃ‚ÂºÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â²Ãƒâ€šÃ‚Â¡ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦Ãƒâ€šÃ‚Â¥ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â®Ãƒâ€¦Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â¯ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â®Ãƒâ€šÃ‚Â¢ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®
		List<OrderModel> orderList = orderEbi.getAllNotIn(oqm,pageNum,pageCount);
		put("orderList",orderList);
		return "inGoodsList";
	}
	/**
	 * this public element is a public element
	 *
	 */
	public String inGoodsDetail(){
		//ÃƒÆ’Ã‚Â¥Ãƒâ€¦Ã‚Â Ãƒâ€šÃ‚Â ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â½Ãƒâ€šÃ‚Â½ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÆ’Ã‚Â¦Ãƒâ€¦Ã¢â‚¬Å“ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â»ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®
		List<StoreModel> storeList = storeEbi.getAll();
		put("storeList",storeList);
		om = orderEbi.get(om.getUuid());
		return "inGoodsDetail";
	}
	
	//--ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¦Ãƒâ€šÃ‚Â¥ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã…â€œ--------------------------------
	/**
	 * this public element is a public element
	 *
	 */
	public Long odmUuid;
	private OrderDetailModel odm;
	
	/**
	 * this public element is a public element
	 *
	 */
	public OrderDetailModel getOdm() {
		return odm;
	}

	/**
	 * this public element is a public element
	 *
	 */
	public String ajaxGetSurplusByOdmUuid(){
		//ÃƒÆ’Ã‚Â¦Ãƒâ€šÃ‚Â Ãƒâ€šÃ‚Â¹ÃƒÆ’Ã‚Â¦ÃƒÂ¯Ã‚Â¿Ã‚Â½Ãƒâ€šÃ‚Â®odmUuidÃƒÆ’Ã‚Â¨Ãƒâ€¦Ã‚Â½Ãƒâ€šÃ‚Â·ÃƒÆ’Ã‚Â¥ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬Å“ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚Â¯Ãƒâ€šÃ‚Â¹ÃƒÆ’Ã‚Â¥Ãƒâ€šÃ‚ÂºÃƒÂ¢Ã¢â€šÂ¬Ã¯Â¿Â½ÃƒÆ’Ã‚Â§Ãƒâ€¦Ã‚Â¡ÃƒÂ¢Ã¢â€šÂ¬Ã…Â¾ÃƒÆ’Ã‚Â¨Ãƒâ€šÃ‚Â´Ãƒâ€šÃ‚Â§ÃƒÆ’Ã‚Â§ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°Ãƒâ€šÃ‚Â©ÃƒÆ’Ã‚Â¥ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â°Ãƒâ€šÃ‚Â©ÃƒÆ’Ã‚Â¤Ãƒâ€šÃ‚Â½ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢ÃƒÆ’Ã‚Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â©ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡ÃƒÂ¯Ã‚Â¿Ã‚Â½
		odm = orderDetailEbi.get(odmUuid);
		return "ajaxGetSurplusByOdmUuid";
	}
}
