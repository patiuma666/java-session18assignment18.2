package collections;
//creating package named as collections
import java.util.Comparator;

public class HDTV {
	//creating class name as HDTV
	//creating hdtv properties using getters and setters
	String brand;
	int size;
	//Created getters and setters
 public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
//Created a  parameterized constructor and initializing the parameters in it 
public HDTV(String brand,int size){
	 this.brand=brand;
	 this.size=size;
}
//Here we have toString method it will returns the string representation of the object.
public  String toString(){
return "shorted as per size of TV "+size;



}

}
class Inches implements Comparator<HDTV> {
	//as we are sorting based on integer we only need Compare method 
public int compare(HDTV TV, HDTV TV1){
	//logic for sorting
 if(TV.getSize()<TV1.getSize()){
	 return -1;
 } else{
	return 1;
 }
}
}

