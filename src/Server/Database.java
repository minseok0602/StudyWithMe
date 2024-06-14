package Server;

import java.io.*;
import java.util.*;
import javax.annotation.processing.Filer;
import javax.swing.JOptionPane;

import Actor.*;
import Gui.MainForAd;
import Gui.MainForStd;
import LogReg.*;
public class Database {
FileReader fileReader;
BufferedWriter requestWriter;
BufferedWriter loginWriter;
BufferedWriter studentWriter;
BufferedWriter adminWriter;
File loginInfoFile;
File registerInfoFile;
public static String currentId;
public static String path = "";
public Database() throws IOException {
	registerInfoFile = new File(path+"register.txt");
	loginInfoFile = new File(path+"login.txt");
	try {
		if(!loginInfoFile.exists())
			loginInfoFile.createNewFile();
		if(!registerInfoFile.exists()){
			registerInfoFile.createNewFile();
		}
	}catch(IOException e) {
		e.printStackTrace();
	}
}
public boolean existId(String id) throws IOException {
	try (BufferedReader reader = new BufferedReader (new FileReader(path+"login.txt"))) {
		String str=null;
		while((str = reader.readLine())!=null){
			if(str.equals(""))
				return false;
			StringTokenizer st = new StringTokenizer(str,",");
			if(st.nextToken().equals(id))
				return true;
		}
	}
	return false;
}
public boolean checkPassword(Login login) throws IOException {
	try (BufferedReader reader = new BufferedReader (new FileReader(path+"login.txt"))) {
		String str;
		if(login.getId().equals("0000")&&login.getPassword().equals("1111")) {
			new MainForAd();
			return true;
		}
		while((str = reader.readLine())!=null){
			StringTokenizer st = new StringTokenizer(str,",");
			String id = st.nextToken();
			String password = st.nextToken();
			String isAd = st.nextToken();
			if(id.equals(login.getId())) {
				if(password.equals(login.getPassword())) {
					if(isAd.equals("true"))
						new MainForAd();
					else
						new MainForStd();
					currentId = id;
					return true;
				}
			}
		}
	}
	return false;
}
public void addRequest(Registration registration) throws IOException {
	requestWriter = new BufferedWriter(new FileWriter(registerInfoFile,true));
	requestWriter.write(registration.getId()+","+registration.getPassword()+","+registration.getName()+","+registration.getDepart()+","+registration.getIsAdmin()+"\n");
	requestWriter.close();
}
public void addAdmin(Registration registration) throws IOException {
	File paths = new File(path+"Administrators\\"+registration.getId());
	File file = new File(path+"Administrators\\"+registration.getId()+"\\info.txt");
	if(!paths.mkdirs()) {
		try {
			if(!file.exists())
				file.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	loginWriter = new BufferedWriter(new FileWriter(file,true));
	loginWriter.write(registration.getId()+","+registration.getPassword()+","+registration.getName()+","+registration.getDepart()+","+registration.getIsAdmin()+"\n");
	loginWriter.close();
}
public void addStudent(Registration registration) throws IOException {
	File paths = new File(path+"Students\\"+registration.getId());
	File file = new File(path+"Students\\"+registration.getId()+"\\info.txt");
	if(!paths.mkdirs()) {
		try {
			if(!file.exists())
				file.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	studentWriter = new BufferedWriter(new FileWriter(file,true));
	studentWriter.write(registration.getId()+","+registration.getName()+","+registration.getPassword()+","+registration.getDepart()+","+registration.getIsAdmin()+"\n");
	studentWriter.close();
}
public void addLoginInfo(Registration registration) throws IOException {
	adminWriter = new BufferedWriter(new FileWriter(loginInfoFile,true));
	adminWriter.write(registration.getId()+","+registration.getPassword()+','+registration.getIsAdmin()+'\n');
	adminWriter.close();
}
public ArrayList<Registration> getRegister() throws IOException {
	ArrayList<Registration> regList = new ArrayList<>();
	try (BufferedReader reader = new BufferedReader(new FileReader(registerInfoFile))) {
		String line;
		while((line=reader.readLine())!=null) {
			StringTokenizer st = new StringTokenizer(line,",");
			String id= ""; 
			String	name= "";
			String password = "";
			String depart= "";
			String isAd = "";
			
			while(st.hasMoreTokens()){
				id = st.nextToken();
				password = st.nextToken();
				name = st.nextToken();
				depart = st.nextToken();
				isAd = st.nextToken();
			}
			boolean ad = isAd.equals("true");
			Registration reg = new Registration(id,name,password,depart,ad);
			regList.add(reg);
		}
	}
	return regList;
}
public String getPlan(String id, int year ,int month, int date, int idx) {
	return "";
	//파일 입출력으로 해당 파일을 찾아가서 거기의 인덱스를 가져옴.
}
public static void setDatabase(String pat) {
	path = pat;
}
public void clearReg() throws IOException {
	requestWriter = new BufferedWriter(new FileWriter(registerInfoFile,false));
	requestWriter.write("");
	requestWriter.close();
}
}
