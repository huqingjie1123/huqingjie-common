package com.huqingjie.text;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.huqingjie.common.utils.DateUtil;
import com.huqingjie.common.utils.FileUtil;
import com.huqingjie.common.utils.StreamUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-beans.xml")
public class UtilText {
	
	@Test
	public void dateUtilTest() {
		
		Date date = new Date();
		Date month = DateUtil.getDateByInitMonth(date);
		
		System.out.println(month);
	}
	
	@Test
	public void dateUtilTest2() {
		
		Date date = new Date();
		Date month = DateUtil.getDateByFullMonth(date);
		
		System.out.println(month);
	}
	
	@Test
	public void FileUtil2() {
		
		String name = FileUtil.getExtendName("0000.txt");
		
		System.out.println(name);
	}
	
	
	@Test
	public void StreamUtils() throws IOException {
		
		InputStream txtFile = null;
		String textFile = StreamUtil.readTextFile(txtFile);
		
		System.out.println(textFile);
	}
	
	@Test
	public void StreamUtils2() throws Exception {
		
		InputStream src = null;
		String readTextFile = StreamUtil.readTextFile(src);
		
		System.out.println(readTextFile);
	}
	
}
