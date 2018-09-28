package cachelist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.experimental.theories.PotentialAssignment;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;

import serialization.Deserializer;

public class NodeCachingLinkedListSup extends ParameterSupplier {
	
	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig) throws Throwable{
		try {
			List<PotentialAssignment> values = new ArrayList<PotentialAssignment>();
			Collection<Object> koratLists = Deserializer.deserialize("/Users/lbuttignol/Documents/Universidad/2018/Testing/TP3/example.example");
			NodeCachingLinkedList l ;
			int aux = 0;
			for(Object o : koratLists) {
				l = (NodeCachingLinkedList) o;
				// See what happend
				values.add(PotentialAssignment.forValue(Integer.toString(aux),l));
				aux++;
			}		
			return values;
		}catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	

}
	