package jaeseon.spring.collection;

import java.util.Set;

public class CollectionBean {
	/* @@@@@@@@@@@@@@@@@@ List �ǽ����� @@@@@@@@@@@@@
	 * private List<String> addressList;//����Ʈ(��Ʈ��Ÿ��) ��ü ���� addressList
	 * 
	 * public List<String> getAddressList() { return addressList; } //getter setter
	 * ����
	 * 
	 * public void setAddressList(List<String> addressList) { this.addressList =
	 * addressList; } //getter setter ����
	 */	
	
	/* @@@@@@@@ Map �ǽ����� @@@@@@@@@@@@@@
	 * private Map<String, String> addressList;
	 * 
	 * public Map<String, String> getAddressList() { return addressList; }
	 * 
	 * public void setAddressList(Map<String, String> addressList) {
	 * this.addressList = addressList; }
	 */
	
	/* @@@@@ ������Ƽ �ǽ����� @@@@@
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
