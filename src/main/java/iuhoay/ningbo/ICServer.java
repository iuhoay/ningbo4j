package iuhoay.ningbo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * @author wuyaohui
 *
 */
public class ICServer {
	
	private final static String FORM_URL = "http://0574ic.com/card_xf.asp";
	private final static String FORM_PARAMS_KBH = "kbh";
	
	public final static String MESSAGE_NO_RESULT = "no result"; 
	public final static String MESSAGE_ERROR = "error";
	
	/**
	 * IC 卡当前余额查询
	 * @param kbh IC 号
	 * @return
	 */
	public String getCurrentMoney(String kbh) {
		String result = "";
		if (kbh != null && kbh.length() > 0) {
			try {
				Document doc = Jsoup.connect(FORM_URL).data(FORM_PARAMS_KBH, kbh).get();
				result = doc.select("#mid table table tr").get(3)
							.select("td").get(2)
							.select("p").get(0)
							.text();
			} catch (IndexOutOfBoundsException e) {
				result = MESSAGE_NO_RESULT;
			} catch (Exception e) {
				result = MESSAGE_ERROR;
			}
		}
		return result;
	}
	
}
