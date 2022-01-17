package jaeseon.spring.collection;

import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		// AbstractApplicationContext�޼ҵ�?�� factory ��ü�� �����ϰ�
		// GenericXmlApplicationContext �޼ҵ�?�� xml���� �����Ѵ�
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

		// bean��ü�� �����Ѵ� bean�� xml�� bean���̴�?? ������
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");

		/*
		 * ����Ʈ �ǽ� @@@@@@@@@@ //�迭 addressList �ּҸ���Ʈ�� �����ϰ� //�� �迭���� bean��ü��?
		 * getaddressList���̴�? List<String> addressList = bean.getAddressList(); //���� ����
		 * addressList���� address�� ���� for (String address : addressList) {
		 * System.out.println(address.toString()); }
		 */

		/*
		 * @@@@@ Map �ǽ� @@@@@ Map<String, String> addressList = bean.getAddressList();
		 * for (String key : addressList.keySet()) {
		 * System.out.println(String.format("Ű : %s, �� : %s", key,
		 * addressList.get(key))); }
		 */

		/*
		 * @@@@@ ������Ƽ �ǽ� @@@@@ Properties addressList = bean.getAddressList(); for
		 * (String key : addressList.stringPropertyNames()) {
		 * System.out.println(String.format("Ű : %s, �� : %s", key,
		 * addressList.get(key))); }
		 */

		Set<String> addressList = bean.getAddressList();
		for (String key : addressList) {
			System.out.println(key);
		}

		factory.close();
	}
}
