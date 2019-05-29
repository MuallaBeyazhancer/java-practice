package day52_inheritance05;

public class Computer {
     private String mpdel;
     private String color;
     
     @Override
	public boolean equals(Object other) {
    	 Computer that = (Computer) other;
    	 
		if(this.mpdel.equals(that.mpdel)&&
				this.color.equals(that.color)) {
			return true;
		}
		return false;
		
	}
	public Computer() {
		super();
		
	}
	public Computer(String mpdel, String color) {
		super();
		this.mpdel = mpdel;
		this.color = color;
		
	}
	public String getMpdel() {
		return mpdel;
	}
	public void setMpdel(String mpdel) {
		this.mpdel = mpdel;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
     
}
