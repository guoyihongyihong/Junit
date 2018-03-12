package introspector;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.junit.Test;


public class Demo2 {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		testProperty();
	}
	
	
	@Test
	public void getAllProperty() throws Exception{
		BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
		
		PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor p : descriptors) {
			System.out.println(p.getReadMethod());
		}
		
	}
	
	
	public static void testProperty() throws Exception{
		Person p = new Person();
		PropertyDescriptor descriptor = new PropertyDescriptor("id", Person.class);
		
		Method m = descriptor.getWriteMethod();
		m.invoke(p, 120);
		Method readMethod = descriptor.getReadMethod();
		
		System.out.println(readMethod.invoke(p, null));
	}

}
