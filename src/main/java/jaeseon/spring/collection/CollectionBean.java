package jaeseon.spring.collection;

import java.util.Set;

public class CollectionBean {
	/* @@@@@@@@@@@@@@@@@@ List 실습예제 @@@@@@@@@@@@@
	 * private List<String> addressList;//리스트(스트링타입) 객체 생성 addressList
	 * 
	 * public List<String> getAddressList() { return addressList; } //getter setter
	 * 설정
	 * 
	 * public void setAddressList(List<String> addressList) { this.addressList =
	 * addressList; } //getter setter 설정
	 */	
	
	/* @@@@@@@@ Map 실습예제 @@@@@@@@@@@@@@
	 * private Map<String, String> addressList;
	 * 
	 * public Map<String, String> getAddressList() { return addressList; }
	 * 
	 * public void setAddressList(Map<String, String> addressList) {
	 * this.addressList = addressList; }
	 */
	
	/* @@@@@ 프로퍼티 실습예제 @@@@@
	 * private Properties addressList;
	 * 
	 * public Properties getAddressList() { return addressList; }
	 * 
	 * public void setAddressList(Properties addressList) { this.addressList =
	 * addressList; }
	 */
	
	private Set<String> addressList;

	public Set<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(Set<String> addressList) {
		this.addressList = addressList;
	}
	
}
