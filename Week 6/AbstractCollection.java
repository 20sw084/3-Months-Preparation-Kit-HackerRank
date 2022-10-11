package test;

//import java.rmi.UnexpectedException;

//import linkedcollection.queue;
//import queue.queue.node;

//import linkedcollection.iterator;


public abstract class AbstractCollection implements Collections {

	
public AbstractCollection() {}

public abstract int size();
public iterator it= Iterator();

public boolean add(Object obj) {
	throw new UnsupportedOperationException();
}
public boolean Isempty() {
	return (size()==0);
}

public String toString() {
	if(Isempty()) return "Empty collection";

iterator it=Iterator();
StringBuffer buf=new StringBuffer("["+it.next());
while(it.hasnext()) {
buf.append(","+it.next());
}
return buf+"]";

}

public void clear() {
	for(iterator it=Iterator(); it.hasnext();) {
		it.next();
		it.remove();
	}
}

public boolean remove(Object obj) {
	
	iterator it=Iterator();
	if(obj==null) {
		while(it.hasnext()) {
			if(it.next()==null) {
				it.remove();
				return true;
			}
		}
	}else {
		while(it.hasnext()) {
			if(obj.equals(it.next())) {
				it.remove();
				return true;
			}
		}
	}
	return false;
}

public boolean contains(Object obj) {
	iterator it=Iterator();
	if(obj==null) {
		while(it.hasnext()) {
			if(it.next()==null) {
//				it.remove();
				return true;
			}
		}
	}else {
		while(it.hasnext())
		{if(obj.equals(it.next())) {
			return true;
		}
	}
	
}return false;}


}
