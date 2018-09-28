package serialization;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.LinkedList;

public class Deserializer {

	public static Collection<Object> deserialize(String file) throws IOException{		
		FileInputStream fileTestUnit = new FileInputStream(new File(file));
		ObjectInputStream ois= new ObjectInputStream(fileTestUnit);
		Collection<Object> res = new LinkedList<Object>();
		try {
			Object obj = nextObject(ois); 
			while(obj != null){
				res.add(obj); 
				obj = nextObject(ois);
			}
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	private static Object nextObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		try {
			return ois.readObject();
		} catch (EOFException eof) {
			return null;
		} catch (ClassNotFoundException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		}
	}
	
}
