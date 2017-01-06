package concepts.src.miscellaneous;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class AddAddons {
	 public static WebDriver fd;

	public static void main(String[] args) throws IOException {
		final String firebugPath = "/home/mukesh/Software/firebug-1.12.0.xpi";
		final String firepathPath = "/home/mukesh/Software/firepath-0.9.7-fx.xpi";
		FirefoxProfile profile = new FirefoxProfile();
		profile.addExtension(new File(firebugPath));
		profile.addExtension(new File(firepathPath));
		String ext = "extensions.firebug.";
		String ext1 = "extensions.firepath.";
		//you need to Set default Firebug preferences and FirePath preferences
		profile.setPreference(ext + "currentVersion", "2.0.9");
		profile.setPreference(ext1 + "currentVersion", "0.9.7");
		profile.setPreference(ext + "allPagesActivation", "on");
		profile.setPreference(ext + "defaultPanelName", "net");
		// profile.setPreference(ext + “defaultPanelName”, “cookies”);
		profile.setPreference(ext + "net.enableSites", true);
		//profile.setPreference(ext + “cookies.enableSites”, true);
		fd = new FirefoxDriver(profile);
		fd.manage().window().maximize();
		fd.get("https://www.google.co.in/");
		}
	}

