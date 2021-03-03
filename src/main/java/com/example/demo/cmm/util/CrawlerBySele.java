package com.example.demo.cmm.util;

import com.example.demo.rev.domain.ReviewDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.jsoup.nodes.Document;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import java.time.Duration;

//@Component @RequiredArgsConstructor
public class CrawlerBySele extends Proxy {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	// final Vector<ReviewDto> revBag;
    
    public Vector<ReviewDto> crawling(String url2) {
    	String url = "https://tickets.interpark.com/goods/20009147";
        logger.info("URL : "+url);
        ArrayList<ReviewDto> revBag = new ArrayList<>();
        
        try{
            Document rawData = Jsoup.connect(url).timeout(10 * 1000).get();
            Elements titles = rawData.select("strong[class=bbsTitleText]");
            Elements contents = rawData.select("p[class=bbsText]");
            ReviewDto review = null;
            logger.info(" titles.size() " + titles.size());
            for(int i=0; i< titles.size(); i++){
            	logger.info(" for 내부 ");
                review = new ReviewDto();
                review.setReviewTitle(titles.get(i).text());
                review.setReviewContent(contents.get(i).text());
                logger.info("리뷰 번호"+ i+"번 : " +review.toString());
                revBag.add(review);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) throws InterruptedException {
    		WebDriver driver =null;
    	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\0305_\\HR\\SpringBoot\\workspace\\be\\demo\\src\\main\\resources\\static\\chromedriver.exe");

    	    driver = new ChromeDriver();
    	    driver.get("http://movie.naver.com/movie/point/af/list.nhn");
    	    
    	    
            System.out.println(driver.getPageSource());
    }
}
