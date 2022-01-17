package jaeseon.spring.collection;

import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		// AbstractApplicationContext메소드?로 factory 객체를 생성하고
		// GenericXmlApplicationContext 메소드?로 xml값을 설정한다
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

		// bean객체를 생성한다 bean은 xml의 bean값이다?? ㅁ뭔말
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");

		/*
		 * 리스트 실습 @@@@@@@@@@ //배열 addressList 주소리스트를 생성하고 //이 배열값은 bean객체의?
		 * getaddressList값이다? List<String> addressList = bean.getAddressList(); //향상된 포문
		 * addressList값을 address로 찍어라 for (String address : addressList) {
		 * System.out.println(address.toString()); }
		 */

		/*
		 * @@@@@ Map 실습 @@@@@ Map<String, String> addressList = bean.getAddressList();
		 * for (String key : addressList.keySet()) {
		 * System.out.println(String.format("키 : %s, 값 : %s", key,
		 * addressList.get(key))); }
		 */

		/*
		 * @@@@@ 프로퍼티 실습 @@@@@ Properties addressList = bean.getAddressList(); for
		 * (String key : addressList.stringPropertyNames()) {
		 * System.out.println(String.format("키 : %s, 값 : %s", key,
		 * addressList.get(key))); }
		 */

		Set<String> addressList = bean.getAddressList();
		for (String key : addressList) {
			System.out.println(key);
		}

		factory.close();
	}
}
