package day07;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test2 {

	public static void main(String[] args) {
		//크롤링 대상 url 지정
		String url = "https://comic.naver.com/index";
		
		try {
			Document doc = Jsoup.connect(url).get();
			
			Elements ele = doc.select("h6.title");
			
			Iterator<Element> itr = ele.select("a > span").iterator();
			
			while(itr.hasNext()) System.out.println(itr.next().text());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
