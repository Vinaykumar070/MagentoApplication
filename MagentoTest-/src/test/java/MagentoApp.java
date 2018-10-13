

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MagentoApp {

	public void pos() {

		String url = "https://magento.com/";
		WebDriver  d = new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		d.get(url);

		Main m = new Main(d);
		m.clickOnMyacc();

		Login l1 = new Login(d);
		l1.typeEmail("subramanyaraj87@gmail.com");
		l1.typePwd("welcome123");

		l1.clickLogin();

		Logout l2 = new Logout(d);
		l2.clikLogout();

		d.quit();
	}

}
