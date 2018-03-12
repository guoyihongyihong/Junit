package introspector;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

public class Demo3 {
	public static void main(String[] args) throws Exception {
		String id= "130";
		String name = "บวบว";
		String salary = "1000";
		String birthday = "2015-11-20";
		
		Converter converter = new Converter() {
			Date date = null;
			@Override
			public Object convert(Class type, Object value) {
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM--dd");
				try {
					date = dateFormat.parse((String)value);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return date;
			}
		};
		ConvertUtils.register(converter, Date.class);
		
		Emp e = new Emp();
		BeanUtils.setProperty(e, "id", id);
		BeanUtils.setProperty(e, "name", name);
		BeanUtils.setProperty(e, "salary", salary);
		BeanUtils.setProperty(e, "birthday", birthday);
		
		System.out.println(e);
	}
}
