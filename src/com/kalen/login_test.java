package com.kalen;

import static com.kalen.UtilTools.*; 
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class login_test {

	private WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "http://localhost:8080/KalenPage/index.jsp";
		driver.manage().window().maximize();//将浏览器最大化
		driver.get(url);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

//	/* 	登录测试
//		测试用例设计: 登录页面跳转后,用户信息是否正确显示
//		设置检查点: assertTrue(contains("用户名:"+name));
//	 */
//	@Test 
//	public void testLogin() {
//
//		String name = "kalen";
//		String pwd = "111111";
//
//		sleep(3000);
//		driver.findElement(By.xpath("//*[@id='c1']/div/input")).sendKeys(name);
//		sleep(3000);
//		driver.findElement(By.xpath("//*[@id='c2']/div/input")).sendKeys(pwd);
//		sleep(3000);
//		driver.findElement(By.xpath("//*[@id='c3']/div/button")).click();
//		sleep(3000);
//		assertTrue(driver.findElement(By.xpath("//*/ul[last()]/li[1]")).getText().contains("用户名:"+name));
//		assertTrue(driver.findElement(By.xpath("//*/ul[last()]/li[2]")).getText().contains("密码:"+pwd));
//	}
//
//	/* 	窗口操作
//		测试用例设计: 由登录页打开新页面，再跳转回登录页面，最大化窗体、获取窗体的相对于屏幕的位置，调整屏幕的位置，调整屏幕的大小
//		设置检查点: 观察浏览器尺寸变化
//	 */
//	@Test
//	public void testMuitipleWindows() throws Exception {
//		String parentWindow="";
//		parentWindow=driver.getWindowHandle();
//		WebElement loginLink= driver.findElement(By.xpath(".//*[@id='c5']/div[2]/a"));
//		loginLink.click();
//		sleep(3000);
//		String[] windowsArray= new String[driver.getWindowHandles().size()];
//		driver.getWindowHandles().toArray(windowsArray);
//		for (int i =0;i < windowsArray.length; i++){
//			if(!windowsArray[i].equals(parentWindow)){   //排除法的方式来选择新弹出的窗口
//				driver.switchTo().window(windowsArray[i]);
//				System.out.println(driver.getTitle());
//			}
//		}
//		System.out.println(driver.getTitle());
//		assertEquals("百度一下，你就知道",driver.getTitle());
//		sleep(1000);
//		driver.close();
//		driver.switchTo().window(parentWindow);
//		assertTrue(driver.getTitle().equals("用户登录"));
//		sleep(1000);
//
//		Window window=driver.manage().window();
//		System.out.println("当前浏览器相对于屏幕的坐标"+window.getPosition());
//		sleep(2000);
//		window.maximize();  //最大化当前浏览器窗口
//		System.out.println("最大化浏览器相对于屏幕的坐标"+window.getPosition());
//		sleep(2000);
//		Point point=new Point(30,30);
//		window.setPosition(point);		//设定浏览器的相对位置
//		System.out.println("最大化浏览器相对于屏幕的坐标"+window.getPosition());
//		sleep(2000);
//		Dimension dimension=new Dimension(800,600);
//		window.setSize(dimension);	//设定窗体的大小
//		sleep(2000);
//		window.maximize();  //最大化当前浏览器窗口
//		sleep(2000);
//	}
//
//	/* 	导航
//		测试用例设计: 用户登录后使用导航对象 navigation 前进、后退
//		设置检查点: back后页面标题为‘用户登录’，forward后页面标题为‘登录信息’
//	 */
//	@Test
//	public void testNavigation() throws Exception {
//		String name = "kalen";
//		String pwd = "111111";
//
//		sleep(3000);
//		driver.findElement(By.xpath("//*[@id='c1']/div/input")).sendKeys(name);
//		sleep(3000);
//		driver.findElement(By.xpath("//*[@id='c2']/div/input")).sendKeys(pwd);
//		sleep(3000);
//		driver.findElement(By.xpath("//*[@id='c3']/div/button")).click();
//		sleep(3000);
//
//		Navigation navigation=driver.navigate();
//		sleep(1000);
//		navigation.back(); 
//		assertTrue(driver.getTitle().equals("用户登录"));
//		sleep(3100);
//		navigation.forward();  
//		assertTrue(driver.getTitle().equals("登录信息"));
//		sleep(3100);
//	}
//
//	/* 	模拟拖拽操作
//		测试用例设计: 拖拽方块页面中的元素
//		设置检查点: 网页中图形位置发生变化
//	 */
//	@Test  
//	public void testDrag() throws Exception {
//		driver.get("http://jqueryui.com/resources/demos/draggable/scroll.html");
//		WebElement draggable = driver.findElement(By.id("draggable"));
//		for (int i = 0; i < 5; i++) {
//			new Actions(driver).dragAndDropBy(draggable, 0, 100).build()
//			.perform(); // 向下拖动10个像素，共拖动5次
//		}
//		for (int i = 0; i < 5; i++) {
//			new Actions(driver).dragAndDropBy(draggable, 100, 0).build()
//			.perform(); // 向右拖动10个像素，共拖动5次
//		}
//		sleep(1000);
//		WebElement draggable2 = driver.findElement(By.id("draggable2"));
//		for (int i = 0; i < 5; i++) {
//			new Actions(driver).dragAndDropBy(draggable2, 0, 50).build()
//			.perform(); // 向下拖动10个像素，共拖动5次
//		}
//		for (int i = 0; i < 5; i++) {
//			new Actions(driver).dragAndDropBy(draggable2, 50, 0).build()
//			.perform(); // 向右拖动10个像素，共拖动5次
//		}
//		sleep(1000);
//		WebElement draggable3 = driver.findElement(By.id("draggable3"));
//		for (int i = 0; i < 5; i++) {
//			new Actions(driver).dragAndDropBy(draggable3, 0, 25).build()
//			.perform(); // 向下拖动10个像素，共拖动5次
//		}
//		for (int i = 0; i < 5; i++) {
//			new Actions(driver).dragAndDropBy(draggable3, 25, 0).build()
//			.perform(); // 向右拖动10个像素，共拖动5次
//		}
//		sleep(2000);
//	}

	/* 	快捷键操作文字
		测试用例设计: 向用户名输入框中输入 ‘ZXLink’，并复制，再粘贴两次
		设置检查点: 用户名输入框中的文字为 ‘ZXLinkZXLink’
	 */
//	@Test
//	public void testCopyPaste() throws Exception {
//		driver.findElement(By.xpath(".//*[@id='c1']/div/input")).sendKeys("ZXLink");  // 找到搜索框，输入一些字母
//		sleep(1000);
//		driver.findElement(By.xpath(".//*[@id='c1']/div/input")).sendKeys(Keys.chord(Keys.COMMAND + "a")); //使用键盘方式 CTRL+a,全选元素中的字符
//		sleep(1000);
//		driver.findElement(By.xpath(".//*[@id='c1']/div/input")).sendKeys(Keys.chord(Keys.COMMAND + "x")); // 使用键盘方式 CTRL+x,剪切元素中的字符
//		sleep(1000);
//		for (int i=0;i<2;i++)
//			driver.findElement(By.xpath(".//*[@id='c1']/div/input")).sendKeys(Keys.chord(Keys.COMMAND + "v"));   // 键盘方式 CTRL+v,粘贴三次选中的字符
//		//driver.findElement(By.xpath(".//*[@id='kalen']/div/form/div[2]/div/input")).sendKeys(Keys.chord(Keys.SHIFT + "A"));//使用键盘方式输入三个字母A
//		sleep(2000);
////		WebElement cc = driver.findElement(By.xpath(".//*[@id='c1']/div/input"));
////		System.out.println(">>>>>>>>>>>>>>>>>"+cc.getText());
////		assertEquals("ZXLinkZXLink",cc.getText());
//		sleep(3000);
//	}

//	/* 	处理弹出 js 对话框
//		测试用例设计: 弹出对话框并将其关闭
//		设置检查点: 不报错
//	 */
//
//	@Test
//	public void testJsBox() throws Exception {
//
//		WebElement showButton = driver.findElement(By.xpath(".//*[@id='cc']/div/input"));
//		showButton.click();
//		System.out.println(driver.switchTo().alert().getText());						//输出js 弹出窗口的显示文字
//		sleep(1000);
//		driver.switchTo().alert().accept();						//接受 alert 的弹出框
//		WebElement promptBoxButton=driver.findElement(By.xpath(".//*[@id='cc1']/div/input"));
//		promptBoxButton.click();
//		System.out.println(driver.switchTo().alert().getText());						//输出js 弹出窗口的显示文字
//		sleep(1000);
//		driver.switchTo().alert().dismiss();						//取消 prompt 的弹出框
//		WebElement alertBoxLink=driver.findElement(By.xpath(".//*[@id='cc2']/div/input"));
//		alertBoxLink.click();
//		System.out.println(driver.switchTo().alert().getText());						//输出js 弹出窗口的显示文字
//		sleep(1000);
//		driver.switchTo().alert().accept();						//接受 confiramiton 的弹出框
//	}
//
//	/* 	获取页面链接
//		测试用例设计: 获取连接的 title、位置、大小、css属性、html标签等
//		设置检查点: title、位置、大小、css属性、html标签等
//	 */		
//	@Test
//	public void testPageValue() throws Exception {
//		WebElement wenkuLink=driver.findElement(By.xpath(".//*[@id='c5']/div[2]/a"));
//		System.out.println("链接URL地址是"+wenkuLink.getAttribute("href"));
//		System.out.println("链接的颜色是"+wenkuLink.getCssValue("color"));
//		System.out.println("链接的 html 标签是"+wenkuLink.getTagName());
//		System.out.println("链接的位置是"+wenkuLink.getLocation());
//		sleep(3000);
//	}
//
//
//	/* 	拉列表操作
//		测试用例设计:验证下拉列表的所有选项符合期望值
//		设置检查点: assertEquals(exp_options, act_options);
//	 */	
//	@Test
//	public void testSearchBoxe() throws Exception {
//
//		sleep(1000);
//		WebElement select = driver.findElement(By.xpath(".//*[@id='list1']"));
//		List<WebElement> allOptions = select.findElements(By.tagName("option")); // 找到一个元素后，获取它的子元素对象：通过
//		List<String> exp_options = Arrays.asList(new String[] { "行政部",
//				"市场部", "销售部", "技术部","人力资源部"});	
//		List<String> act_options = new ArrayList<String>();
//		for (WebElement option : allOptions)
//			act_options.add(option.getText());
//		assertEquals(exp_options, act_options);
//	}
//
//
//
//	/* 	复选框操作
//		测试用例设计:验证复选框是否可见、可用、是否被选中
//		设置检查点: 是否可见、可用、是否被选中
//	 */	
//			
//    @Test  //选择复选框，并且确定选中的状态
//    public void testCheckBox() throws Exception {
//
//    	sleep(2000);
//
//        WebElement checkBox1 = driver.findElement(By.xpath(".//*[@id='c5']/div[1]/input"));
//        assertTrue(checkBox1.isDisplayed());
//        assertTrue(checkBox1.isEnabled());
//
//        assertFalse(checkBox1.isSelected());
//        if(!checkBox1.isSelected()){
//            checkBox1.click();    //没有被选中，则才进行点击操作
//        }
//        assertTrue(checkBox1.isSelected());
//        sleep(2000);
//
//        if(checkBox1.isSelected()){
//            checkBox1.click();    //没有被选中，则才进行点击操作
//        }
//
//        assertTrue(!checkBox1.isSelected());
//        sleep(2000);
//    }
//	
//	/* 	单选框操作
//		测试用例设计:验证复选框是否可见、可用、是否被选中
//		设置检查点: 是否可见、可用、是否被选中
//	 */	
//    @Test 
//    public void textRadioBox() throws Exception {
//
//    	sleep(2000);
//    	WebElement radioBox1 = driver.findElement(By.xpath(".//*[@id='c6']/div[1]/input"));
//    	WebElement radioBox2 = driver.findElement(By.xpath(".//*[@id='c6']/div[2]/input"));
//    	if(!radioBox1.isSelected()){
//    		radioBox1.click();
//    	}
//    	assertTrue(radioBox1.isSelected());;
//    	sleep(3000);
//    	radioBox2.click();
//    	sleep(3000);
//    	List<WebElement> genres=driver.findElements(By.xpath("//input[@type='radio']"));
//    	for (WebElement genre:genres){
//    		System.out.println(genre.getAttribute("value"));
//    		if (genre.getAttribute("value").equals("male")){
//    			if(!genre.isSelected()){
//    				genre.click();
//    				assertTrue(genre.isSelected());
//    			}
//    		}
//    	}
//    	sleep(3000);
//    }


	/* 
		测试用例设计: 表格中行数5行、列数4列  
		设置检查点:  assertEquals(5,rows.size());  assertEquals(4,cols.size());
	 */
	@Test  
	public void testTable1() throws Exception {
		WebElement simpleTable=driver.findElement(By.xpath(".//*[@id='c7']/table"));
		List<WebElement> rows=simpleTable.findElements(By.tagName("tr"));
		assertEquals(5,rows.size());
		for(WebElement row:rows){
			List<WebElement> cols=row.findElements(By.tagName("td"));
			if( cols.size() == 0) {
				List<WebElement> cth = row.findElements(By.tagName("th"));
				assertEquals(4,cth.size());
			}else {
				assertEquals(4,cols.size());
			}
		}
	}


//	/* 
//		测试用例设计: 表格中李娜是否在存在，她的职位状态是否为兼职，工号是否为002  
//		设置检查点:  assertEquals("李娜",td.getText());  assertEquals("兼职",td1.getText());  assertEquals("002",td2.getText());
//	 */
//	@Test   
//	public void testTable() throws Exception {
//		WebElement simpleTable=driver.findElement(By.xpath(".//*[@id='c7']/table"));
//		WebElement td=simpleTable.findElement(By.xpath("//td[contains(text(),'李娜')]")); 
//		assertEquals("李娜",td.getText());
//		System.out.println("预期姓名：李娜，实际姓名："+td.getText());
//		WebElement td1=simpleTable.findElement(By.xpath("//td[contains(text(),'李娜')]/following-sibling::td"));   //通过模糊的方式找到表格中包含某个关键字的表格内容
//		assertEquals("兼职",td1.getText());
//		System.out.println("预期职位状态：兼职，实际职位状态:"+td1.getText());
//		WebElement td2=simpleTable.findElement(By.xpath("//td[contains(text(),'李娜')]/preceding-sibling::td"));   //通过模糊的方式找到表格中包含某个关键字的表格内容
//		System.out.println("预期工号：002，实际工号："+td2.getText());
//		assertEquals("002",td2.getText());
//	}
}
