package core.java.Serialization;

import java.io.Serializable;

public class TransientDemo implements Serializable {
	static transient int i=10;
	 transient int j= 20;

}
