
public class Basic {
	private int width;
	private int height;
	private String name;
	
	
	
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	public int getWidth() {
		return width;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	public int area(int height, int width) {
		return height * width;
	}

	public String toString()
	{
		return "�簢�� ����" +  height + "���̴� " + width;
	}
}
