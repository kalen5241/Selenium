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

//	@Test  //登录测试
//	public void testLogin() {
//
//		sleep(3000);
//		driver.findElement(By.xpath(".//*[@id='c1']/div/input")).sendKeys("kalen");
//		sleep(3000);
//		driver.findElement(By.xpath(".//*[@id='c2']/div/input")).sendKeys("111111");
//		sleep(3000);
//		driver.findElement(By.xpath(".//*[@id='c3']/div/button")).click();
//		sleep(3000);
//		assertTrue(driver.findElement(By.xpath(".//*/ul[last()]/li[1]")).getText().contains("用户名:kalen"));
//		assertTrue(driver.findElement(By.xpath(".//*/ul[last()]/li[2]")).getText().contains("密码:111111"));
//	
//	}
	
//  @Test   //多个窗口时候，找到要操作的窗口，在进行操作。
//  public void testMuitipleWindows() throws Exception {
//      String parentWindow="";
//      parentWindow=driver.getWindowHandle();
//      WebElement loginLink= driver.findElement(By.xpath(".//*[@id='c5']/div[2]/a"));
//      loginLink.click();
//      sleep(3000);
//      String[] windowsArray= new String[driver.getWindowHandles().size()];
//      driver.getWindowHandles().toArray(windowsArray);
//      for (int i =0;i < windowsArray.length; i++){
//          if(!windowsArray[i].equals(parentWindow)){   //排除法的方式来选择新弹出的窗口
//              driver.switchTo().window(windowsArray[i]);
//              System.out.println(driver.getTitle());
//          }
//      }
//          System.out.println(driver.getTitle());
//          assertEquals("百度一下，你就知道",driver.getTitle());
//          sleep(1000);
//          driver.close();
//          driver.switchTo().window(parentWindow);
//          assertTrue(driver.getTitle().equals("用户登录"));
//          sleep(1000);
//      }

//  @Test   //窗体的操作：最大化窗体、获取窗体的相对于屏幕的位置，调整屏幕的位置，调整屏幕的大小
//  public void testWindows() throws Exception {
//
//      Window window=driver.manage().window();
//      System.out.println("当前浏览器相对于屏幕的坐标"+window.getPosition());
//      sleep(2000);
//      window.maximize();  //最大化当前浏览器窗口
//      System.out.println("最大化浏览器相对于屏幕的坐标"+window.getPosition());
//      sleep(2000);
//      Point point=new Point(30,30);
//      window.setPosition(point);		//设定浏览器的相对位置
//      System.out.println("最大化浏览器相对于屏幕的坐标"+window.getPosition());
//      sleep(2000);
//      Dimension dimension=new Dimension(800,600);
//      window.setSize(dimension);	//设定窗体的大小
//      sleep(2000);
//  window.maximize();  //最大化当前浏览器窗口
//  	sleep(2000);
//  }
	
//	@Test  //使用导航对象 navigation 前进、后退和刷新
//    public void testSearchWord() throws Exception {
//        System.out.println("测试用例开始执行");
//        Navigation navigation=driver.navigate();//创建导航对象
//        navigation.to("localhost:8080/KalenPage/loginfo.jsp"); //访问信息页面
//        sleep(5000);
//        navigation.back();  
//        sleep(3100);
//        navigation.forward(); 
//        sleep(3100);
//        navigation.refresh();
//        sleep(1100);
//    }
	
//    @Test  //模拟拖拽操作
//    public void testdrag() throws Exception {
//        driver.get("http://jqueryui.com/resources/demos/draggable/scroll.html");
//        WebElement draggable = driver.findElement(By.id("draggable"));
//        for (int i = 0; i < 5; i++) {
//            new Actions(driver).dragAndDropBy(draggable, 0, 100).build()
//            .perform(); // 向下拖动10个像素，共拖动5次
//        }
//        for (int i = 0; i < 5; i++) {
//            new Actions(driver).dragAndDropBy(draggable, 100, 0).build()
//            .perform(); // 向右拖动10个像素，共拖动5次
//        }
//        sleep(1000);
//        WebElement draggable2 = driver.findElement(By.id("draggable2"));
//        for (int i = 0; i < 5; i++) {
//            new Actions(driver).dragAndDropBy(draggable2, 0, 50).build()
//            .perform(); // 向下拖动10个像素，共拖动5次
//        }
//        for (int i = 0; i < 5; i++) {
//            new Actions(driver).dragAndDropBy(draggable2, 50, 0).build()
//            .perform(); // 向右拖动10个像素，共拖动5次
//        }
//        sleep(1000);
//        WebElement draggable3 = driver.findElement(By.id("draggable3"));
//        for (int i = 0; i < 5; i++) {
//            new Actions(driver).dragAndDropBy(draggable3, 0, 25).build()
//            .perform(); // 向下拖动10个像素，共拖动5次
//        }
//        for (int i = 0; i < 5; i++) {
//            new Actions(driver).dragAndDropBy(draggable3, 25, 0).build()
//            .perform(); // 向右拖动10个像素，共拖动5次
//        }
//        sleep(2000);
//    }
	
//  @Test   //使用快捷键操作文字
//  public void testSearchWord() throws Exception {
//  	
//      driver.findElement(By.xpath(".//*[@id='c1']/div/input")).sendKeys("coderinfo");  // 找到搜索框，输入一些字母
//      sleep(1000);
//      driver.findElement(By.xpath(".//*[@id='c1']/div/input")).sendKeys(Keys.chord(Keys.COMMAND + "a")); //使用键盘方式 CTRL+a,全选元素中的字符
//      sleep(1000);
//      driver.findElement(By.xpath(".//*[@id='c1']/div/input")).sendKeys(Keys.chord(Keys.COMMAND + "x")); // 使用键盘方式 CTRL+x,剪切元素中的字符
//      sleep(1000);
//      for (int i=0;i<3;i++)
//        driver.findElement(By.xpath(".//*[@id='c1']/div/input")).sendKeys(Keys.chord(Keys.COMMAND + "v"));   // 键盘方式 CTRL+v,粘贴三次选中的字符
////      driver.findElement(By.xpath(".//*[@id='kalen']/div/form/div[2]/div/input")).sendKeys(Keys.chord(Keys.SHIFT + "A"));//使用键盘方式输入三个字母A
//      sleep(3000);
//  }
	
	
//  @Test   //弹出 js 对话框的处理，接受 Alert 对话框，选择 prompt 弹出框的取消，选择 confirmation 的确定
//  public void testJsBox() throws Exception {
//  	
////     List<WebElement> array = driver.findElements(By.xpath(".//input[@type='button']"));
////     array.indexOf(0).click();
//
//  	WebElement showButton = driver.findElement(By.xpath(".//*[@id='cc']/div/input"));
//  	showButton.click();
//      System.out.println(driver.switchTo().alert().getText());						//输出js 弹出窗口的显示文字
//      sleep(1000);
//      driver.switchTo().alert().accept();						//接受 alert 的弹出框
//      WebElement promptBoxButton=driver.findElement(By.xpath(".//*[@id='cc1']/div/input"));
//      promptBoxButton.click();
//      System.out.println(driver.switchTo().alert().getText());						//输出js 弹出窗口的显示文字
//      sleep(1000);
//      driver.switchTo().alert().dismiss();						//取消 prompt 的弹出框
//      WebElement alertBoxLink=driver.findElement(By.xpath(".//*[@id='cc2']/div/input"));
//      alertBoxLink.click();
//      System.out.println(driver.switchTo().alert().getText());						//输出js 弹出窗口的显示文字
//      sleep(1000);
//      driver.switchTo().alert().accept();						//接受 confiramiton 的弹出框
//  }
//	
	
//	   @Test  //获取页面链接的各类属性：title、位置、大小、css属性、html标签等
//	    public void nature() throws Exception {
//	        driver.manage().window().maximize();//将浏览器最大化
//	        String title=driver.getTitle();  //获取当前浏览器页面的title
//	        String sourcePage=driver.getPageSource(); //获取当前浏览器页面的源代码
//	        String url=driver.getCurrentUrl();  //获取当前页面的url地址
//	        System.out.println("title 是："+title);
//	        System.out.println("当前页面的源代码是："+sourcePage);
//	        System.out.println("当前页面的URL 是："+url);
//	        sleep(3000);
//	        WebElement wenkuLink=driver.findElement(By.xpath(".//*[@id='c5']/div[2]/a"));
//	        System.out.println("链接URL地址是"+wenkuLink.getAttribute("href"));
//	        System.out.println("链接的大小是"+wenkuLink.getSize());
//	        System.out.println("链接的颜色是"+wenkuLink.getCssValue("color"));
//	        System.out.println("链接的 html 标签是"+wenkuLink.getTagName());
//	        System.out.println("链接的位置是"+wenkuLink.getLocation());
//	        sleep(3000);
//	    }
	   
//    @Test   //assertTure函数中，使用字符串的contains,startWith和endswith 方法来判断字符串。
//    public void testTable() throws Exception {
//		driver.findElement(By.xpath(".//*[@id='c1']/div/input")).sendKeys("kalen");
//		sleep(1000);
//		driver.findElement(By.xpath(".//*[@id='c2']/div/input")).sendKeys("111111");
//		sleep(100);
//		driver.findElement(By.xpath(".//*[@id='c3']/div/button")).click();
//		sleep(100);
//		assertTrue(driver.findElement(By.xpath(".//*/ul[last()]/li[1]")).getText().contains("kalen"));
//		assertTrue(driver.findElement(By.xpath(".//*/ul[last()]/li[1]")).getText().startsWith("用户名:"));
//		assertTrue(driver.findElement(By.xpath(".//*/ul[last()]/li[1]")).getText().endsWith("en"));
//		assertTrue(driver.findElement(By.xpath(".//*/ul[last()]/li[2]")).getText().contains("111111"));
//		assertTrue(driver.findElement(By.xpath(".//*/ul[last()]/li[2]")).getText().startsWith("密码:"));
//		assertTrue(driver.findElement(By.xpath(".//*/ul[last()]/li[2]")).getText().endsWith("1"));
//		sleep(1000);
//    }

/*
  @Test   //验证下拉列表的所有选项符合期望值
  public void testSearchBoxe() throws Exception {
	  
  	sleep(1000);
      WebElement select = driver.findElement(By.xpath(".//*[@id='list1']"));
      List<WebElement> allOptions = select.findElements(By.tagName("option")); // 找到一个元素后，获取它的子元素对象：通过
      // tagName
      // 获取下拉列表的所有选项，存储到一个
      // list
      // 中
      List<String> exp_options = Arrays.asList(new String[] { "行政部",
          "市场部", "销售部", "技术部","人力资源部"});	
      List<String> act_options = new ArrayList<String>();
      for (WebElement option : allOptions)
          act_options.add(option.getText());
      assertEquals(exp_options, act_options);
  }
*/	
	
/*
	@Test   //遍历一个下拉列表中的所有选项，选中一个自己想要选中的选项
    public void testSearchBoxe() throws Exception {
        WebElement select = driver.findElement(By.xpath(".//*[@id='list1']"));
        List<WebElement> allOptions =  select.findElements(By.tagName("option"));  //找到一个元素后，获取它的子元素对象：通过 tagName 获取下拉列表的所有选项，存储到一个 list 中
        for (WebElement option : allOptions) {
            System.out.println(String.format("下拉列表显示的文字是: %s", option.getText()));   //遍历 List 中所有的下拉选项的显示文字
            System.out.println(String.format("显示文字对应的值是: %s", option.getAttribute("value"))); //遍历 List 中所有的下拉选项显示文字的值
            sleep(3000);
            option.click();
            System.out.println("click "+option.getText());
        }
        
        for (WebElement option : allOptions) {
            //System.out.println(String.format("Value is: %s", option.getText()));
            if (option.getText().equals("技术部")){		//通过使用下拉框的文本值选中 Saab 的下拉选项
                option.click();
                System.out.println("-----------------------");
                System.out.println("click 技术部");
                sleep(6000);
            }
            if (option.getAttribute("value").equals("1")){      //通过使用 value 选中 Audi的下拉选项
                option.click();
                System.out.println("-----------------------");
                System.out.println("行政部");
                sleep(2000);
            }
        }
    }
*/	
	
	
//    @Test  //选择复选框和单选框，并且确定选中的状态
//    public void testCheckBox() throws Exception {
//
//    	sleep(2000);
//    	
//        WebElement checkBox1 = driver.findElement(By.xpath(".//*[@id='c5']/div[1]/input"));
//        assertTrue(checkBox1.isDisplayed());
//        
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
    
//    @Test  //选择单选框，并且确定选中的状态
//    public void textRadioBox() throws Exception {
//
//        sleep(2000);
//        
//        WebElement radioBox1 = driver.findElement(By.xpath(".//*[@id='c6']/div[1]/input"));
//        WebElement radioBox2 = driver.findElement(By.xpath(".//*[@id='c6']/div[2]/input"));
//        if(!radioBox1.isSelected()){
//            radioBox1.click();
//        }
//        assertTrue(radioBox1.isSelected());;
//        sleep(3000);
//        radioBox2.click();
//        sleep(3000);
//        List<WebElement> genres=driver.findElements(By.xpath("//input[@type='radio']"));
//        for (WebElement genre:genres){
//            System.out.println(genre.getAttribute("value"));
//            if (genre.getAttribute("value").equals("male")){
//                if(!genre.isSelected()){
//                    genre.click();
//                    assertTrue(genre.isSelected());
//                }
//            }
//        }
//        sleep(3000);
//    }
//	
//
//    @Test  //判断表格的行数是否符合期望值，输出每个表格的内容。原理：找到所有行的对象，然后再每个行对象中，搜索每行中所有的列
//    public void testTable() throws Exception {
//        WebElement simpleTable=driver.findElement(By.xpath(".//*[@id='kalen']/table"));
//        List<WebElement> rows=simpleTable.findElements(By.tagName("tr"));
//        assertEquals(4,rows.size());
//        for(WebElement row:rows){
//            List<WebElement> cols=row.findElements(By.tagName("td"));
//            for (WebElement col:cols){
//                System.out.println(col.getText()+"\t");
//            }
//        }
//        System.out.println();
//    }

/*
    @Test   //找到包含某个关键字的表格td，找到这个td前一个表格和后一个表格
    public void testTable() throws Exception {
    	WebElement simpleTable=driver.findElement(By.xpath(".//*[@id='kalen']/table"));
        WebElement td=simpleTable.findElement(By.xpath("//td[contains(text(),'李娜')]"));   //通过模糊的方式找到表格中包含某个关键字的表格内容
        System.out.println("找到表格的内容是："+td.getText());
        WebElement td1=simpleTable.findElement(By.xpath("//td[contains(text(),'李娜')]/following-sibling::td"));   //通过模糊的方式找到表格中包含某个关键字的表格内容
        System.out.println("找到下一个表格的内容是-学号："+td1.getText());
        WebElement td2=simpleTable.findElement(By.xpath("//td[contains(text(),'李娜')]/preceding-sibling::td"));   //通过模糊的方式找到表格中包含某个关键字的表格内容
        System.out.println("找到上一个表格的内容是-班级："+td2.getText());
    }
  */
  
  
  
  
  
  
  
  
  
  
  
  
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	 @Test   //cookie的操作：查看 cookie 内容、增加 cookie 内容、删除cookie内容
//    public void testCookie() throws Exception {
//	 Set<Cookie> cookies1=driver.manage().getCookies();
//        Cookie[] allCookies1=new Cookie[cookies1.size()];
//        cookies1.toArray(allCookies1);
//        System.out.println("当前的Cookie 集合的数量为："+cookies1.size());
//        System.out.println();
//        for (int i = 0;i <allCookies1.length;i++){
//            System.out.println("第 "+ i +" 个 cookie 的各项属性为");
//            System.out.println("cookie 名称   - "+allCookies1[i].getName());
//            System.out.println("cookie 值     - "+allCookies1[i].getValue());
//            System.out.println("cookie 所在域     - "+allCookies1[i].getDomain());
//            System.out.println("cookie 路径     - "+allCookies1[i].getPath());
//            System.out.println("cookie 过期时间     - "+allCookies1[i].getExpiry());
//            System.out.println("");
//        }
//	 driver.findElement(By.xpath(".//*[@id='kalen']/div/form/div[1]/div/input")).sendKeys("kalen");
//		sleep(100);
//		driver.findElement(By.xpath(".//*[@id='kalen']/div/form/div[2]/div/input")).sendKeys("111111");
//		sleep(100);
//		driver.findElement(By.xpath(".//*[@id='c3']/div/button")).click();
//		sleep(100);
//		assertTrue(driver.findElement(By.xpath(".//*/ul[last()]/li[1]")).getText().contains("用户名:kalen"));
//		assertTrue(driver.findElement(By.xpath(".//*/ul[last()]/li[2]")).getText().contains("密码:111111"));
//		System.out.println("登录成功");
//	 
//	 Navigation navigation=driver.navigate();//创建导航对象
//	 navigation.to("localhost:8080/KalenPage/index.jsp"); //访问登录页面
//        Set<Cookie> cookies=driver.manage().getCookies();
//        Cookie[] allCookies=new Cookie[cookies.size()];
//        cookies.toArray(allCookies);
//        System.out.println("当前的Cookie 集合的数量为："+cookies.size());
//        System.out.println();
//        for (int i = 0;i <allCookies.length;i++){
//            System.out.println("第 "+ i +" 个 cookie 的各项属性为");
//            System.out.println("cookie 名称   - "+allCookies[i].getName());
//            System.out.println("cookie 值     - "+allCookies[i].getValue());
//            System.out.println("cookie 所在域     - "+allCookies[i].getDomain());
//            System.out.println("cookie 路径     - "+allCookies[i].getPath());
//            System.out.println("cookie 过期时间     - "+allCookies[i].getExpiry());
//            System.out.println("");
//        }
//        Calendar calendar=Calendar.getInstance();
//        calendar.add(Calendar.DATE,+1);//获取前一天的日期
//        Date date=calendar.getTime();
//        
//        //添加 cookie
//        Cookie newCookie =new Cookie("newcookie","新 cookie 值","baidu.com","",date);
//        cookies.add(newCookie);
//        System.out.println("新增的 cookie 的各项属性为：");
//        System.out.println("cookie 名称   - "+newCookie.getName());
//        System.out.println("cookie 值     - "+newCookie.getValue());
//        System.out.println("cookie 所在域     - "+newCookie.getDomain());
//        System.out.println("cookie 路径     - "+newCookie.getPath());
//        System.out.println("cookie 过期时间     - "+newCookie.getExpiry());
//        System.out.println("");
//        
//        System.out.println("添加 cookie 后， cookie 的集合数量为："+ cookies.size());
//        
//        //删除 cookie
//        allCookies=new Cookie[cookies.size()];
//        cookies.toArray(allCookies);
//        cookies.remove(allCookies[1]);
//        System.out.println("删除后，Cookie 集合的数量为："+cookies.size());
//    }
	
//  @Test  //操作复选框，点选复选框，并且判断复选框是否被选中成功。
//  public void testDemo() throws Exception {
//      WebElement checkBox=driver.findElement(By.xpath("//*[@ type='checkbox'][1]"));
//      assertFalse(checkBox.isSelected());
//      if (!checkBox.isSelected()){
//          checkBox.click();
//      }
//      assertTrue(checkBox.isSelected());
//      sleep(3000);
//  }

//	 @Test   //使用select 对象来操作列表，使用文字、值和序号来操作列表项
//    public void testSearchBoxe() throws Exception {
//
//        Select select =new Select(driver.findElement(By.xpath(".//*[@id='list1']")));
//        System.out.println("此下拉列表是否支持多选："+select.isMultiple());  //判断下拉列表是否是多选的
//        assertFalse(select.isMultiple());
//        select.selectByVisibleText("星期一");  //通过文字选中列表中的指定项
//        System.out.println(select.getFirstSelectedOption().getText());  //输出被选中选项的文字内容
//        assertEquals("星期一",select.getFirstSelectedOption().getText());
//        sleep(2000);
//        select.selectByValue("3");   //通过选项的对应值来选中指定项
//        System.out.println(select.getFirstSelectedOption().getText());  //输出被选中选项的文字内容
//        assertEquals("星期三",select.getFirstSelectedOption().getText());
//        sleep(2000);
//        select.selectByIndex(4);   //通过选项的序号选中指定项
//        System.out.println(select.getFirstSelectedOption().getText());  //输出被选中选项的文字内容
//        assertEquals("星期五",select.getFirstSelectedOption().getText());
//        sleep(2000);
//    }

//  @Test  //使用select 对象来验证操作列表的选项是否符合期望，多选列表项，并验证选中的选项是否所期望的，并取消选择之前所选的选项
//    public void testSearchBoxe() throws Exception {
//	  
//        Select make =new Select(driver.findElement(By.xpath(".//*[@id='list2']")));
//        System.out.println("此下拉列表是否支持多选："+make.isMultiple());  //判断下拉列表是否是多选的
//        assertEquals(5,make.getOptions().size());   //验证下拉框的选项数量是否符合期望
//        assertTrue(make.isMultiple());
//        make.selectByVisibleText("RedFlag");  //通过文字选中列表中的指定项
//        make.selectByVisibleText("BENS");
//        make.selectByVisibleText("TOYOTA");
//        
////        List<String> exp_options=Arrays.asList(new String[]{"RedFlag","Ford","BENS","PEUGEOT","TOYOTA"});//验证下拉列表的元素是否满足期望值
////        List<String> act_options=new ArrayList<String>();
////        
////        for(WebElement option:make.getOptions()){
////            act_options.add(option.getText());
////        }
////        assertArrayEquals(exp_options.toArray(),act_options.toArray());
//        sleep(3000);
////        act_options.clear();
////        List<WebElement> selectedOptions= make.getAllSelectedOptions();
////        
////        for(WebElement option:selectedOptions){
////            System.out.println(option.getText());  // 输出选中选项对应的文字
////            act_options.add(option.getText());
////        }
////        exp_options=Arrays.asList(new String[]{"RedFlag","BENS","TOYOTA"});
////        assertArrayEquals(exp_options.toArray(),act_options.toArray());
////        
////        sleep(2000);
////        make.deselectByVisibleText("RedFlag");
////        sleep(2000);
////        make.deselectByValue("Germany");   //通过选项的对应值来选中指定项
////        sleep(2000);
////        make.deselectByIndex(4);   //通过选项的序号选中指定项
////        sleep(2000);
////        assertEquals(0,make.getAllSelectedOptions().size());
//    }
  
//  @Test   //获取文本框的各种属性
//  public void testSearchBoxe() throws Exception {
//      driver.manage().window().maximize();//将浏览器最大化
//      Navigation navigation=driver.navigate();//创建导航对象
//      navigation.to("http://localhost:8080/KalenPage/index.jsp");
//      WebElement username_box=driver.findElement(By.xpath(".//*[@id='kalen']/div/form/div[1]/div/input"));
//      username_box.sendKeys("kalen");
//      System.out.println("输入框的文字内容是"+username_box.getAttribute("value"));
//      System.out.println("输入框的编辑状态是"+username_box.isEnabled());
//      System.out.println("输入框是否显示在页面上"+username_box.isDisplayed());
//      System.out.println("输入框是否被选中:"+username_box.isSelected());
//      sleep(5000);
//      WebElement pwd_box=driver.findElement(By.xpath(".//*[@id='kalen']/div/form/div[2]/div/input"));
//      pwd_box.sendKeys("1111");
//      System.out.println("输入框的文字内容是"+pwd_box.getAttribute("value"));
//      System.out.println("输入框的编辑状态是"+pwd_box.isEnabled());
//      System.out.println("输入框是否显示在页面上"+pwd_box.isDisplayed());
//      System.out.println("输入框是否被选中:"+pwd_box.isSelected());
//      sleep(5000);
//  }
}
