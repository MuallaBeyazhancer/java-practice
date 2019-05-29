package day49_inheritance02;

public class BarnesAndNobles {

	public static void main(String[] args) {
		EBook ebook = new EBook();
		ebook.setTitle("Introduction to Java");
		ebook.setAuthor("Savitch");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setType("Tech Book");
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		
		ebook.readEBook(621);
        AudioBook abook = new AudioBook();
        abook.setTitle("OCA");
        abook.setAuthor("Jeanne");
        abook.setNarrator("MarufJon");
        abook.listen();
        
        PaperBack paper= new PaperBack ();
        
        paper.setTitle("Outliers");
        paper.setAuthor("Malcom Gladwell");
        paper.setPrice(20);
        paper.setType("Biography");
        paper.setPages(304);
        
        System.out.println(paper.toString());
        
        
	}

}
