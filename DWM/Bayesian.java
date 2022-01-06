import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Bayesian {
	static String filePath = System.getProperty("user.dir")+"\\DWM\\dataset.txt";
	static ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
	
	public ArrayList<ArrayList<String>> readTable(String filePath){
		ArrayList<String> d = null;
		ArrayList<ArrayList<String>> t = new ArrayList<ArrayList<String>>();
		File file = new File(filePath);
		try {
			InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
			BufferedReader bf = new BufferedReader(isr);
			String str = null;
			while((str = bf.readLine()) != null) {
				d = new ArrayList<String>();
				String[] str1 = str.split(",");
				for(int i = 1; i < str1.length ; i++) {
					d.add(str1[i]);
				}
				t.add(d);
				data = t;
			}
			bf.close();
			isr.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("File does not exist!");
		}
		return t;
	}
	
	public double denominator() {
		double result = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for(int i = 0; i < data.size() ;i++) {
			if(data.get(i).get(0).equals("High")) {
				count1++;
			}
			if(data.get(i).get(1).equals("True")) {
				count2++;
			}
			if(data.get(i).get(2).equals("False")) {
				count3++;
			}
			if(data.get(i).get(3).equals("True")) {
				count4++;
			}
		}
		result = (count1 / (data.size()*1.0))*(count2 / (data.size()*1.0))*(count3 / (data.size()*1.0))*(count4 / (data.size()*1.0));
		System.out.println(result);
		return result;
	}
	
	public double moleculeIsCold(String cold) {
		double result = 0;
		int countIsCold = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for(int i = 0; i < data.size() ;i++) {
			if(data.get(i).get(4).equals(cold)) {
				countIsCold++;
			}
			if(data.get(i).get(0).equals("High") && data.get(i).get(4).equals(cold)) {
				count1++;
			}
			if(data.get(i).get(1).equals("True") && data.get(i).get(4).equals(cold)) {
				count2++;
			}
			if(data.get(i).get(2).equals("False") && data.get(i).get(4).equals(cold)) {
				count3++;
			}
			if(data.get(i).get(3).equals("True") && data.get(i).get(4).equals(cold)) {
				count4++;
			}
		}
		result = (countIsCold / (data.size()*1.0))*(count1 / (countIsCold*1.0))*(count2 / (countIsCold*1.0))*(count3 / (countIsCold*1.0))*(count4 / (countIsCold*1.0));
		return result;
	}
	
	public String compared() {
		String str = "";
		double d1 = 0,d2 = 0;
		d1 = moleculeIsCold("P")*1.0 / denominator();
		d2 = moleculeIsCold("N")*1.0 / denominator();
		if(d1 > d2) {
			str = "Cold";
		}else {
			str = "No cold.";
		}
		System.out.println("Probability of cold:"+d1);
		System.out.println("No chance of cold:"+d2);
		System.out.println(str);
		return str;
	}

	public static void main(String[] args) {
		Bayesian ba = new Bayesian();
		ba.readTable(filePath);
		ba.denominator();
		ba.compared();
	}
}