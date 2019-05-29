package day50_inheritance03;

public class Google extends SearchEngine{
	@Override
	public int search(String item) {
		System.out.println("Searching for: " + item);
		int resultsCount = item.length();
		return resultsCount;
	}
	//return type must be same to override
					//signature must be same;
	public void search(String item, String item2) {
		System.out.println("Searching for 2 items: " + item+","+item2);
		int resultsCount = item.length()+item2.length();
		System.out.println("Total count: "+resultsCount);
	}
	//default , protected
	
	protected String clickResult() {
		System.out.println("Clicking result");
		return "Search result page";
	}
	}
