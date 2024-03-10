import java.io.File;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class UsoJsoup {

	public static void main(String[] args) {
	
		File file= new File ("c:\\javat\\a.html");
		System.out.println("Existe " + file.exists());
		System.out.println("Se puede leer " + file.canRead());
		
		Document doc=Jsoup.parseBodyFragment("c:\\ok javat\\a.html");
		Elements lista = doc.getAllElements();
		
		if(lista.hasText()) {
			System.out.println("Resultado " + lista.outerHtml());
		}
		
	}

}
