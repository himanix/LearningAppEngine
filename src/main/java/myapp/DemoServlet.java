package myapp;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws IOException {
          HtmlUnitDriver driver=new HtmlUnitDriver(true);
          driver.get("http://www.google.com");
          String title=driver.getTitle();
          System.out.println(title);
          driver.quit();
          resp.setContentType("text/plain");
          resp.getWriter().println("{ \"name\": \"World\" }");
  }
}
