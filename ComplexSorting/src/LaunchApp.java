import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LaunchApp {

	public static void main(String[] args) {
		List list = new ArrayList();
		List list2= Arrays.asList(10,20,30,40);
		System.out.println(list2);
        list.add(20);
        list.add(10);
        list.add(70);
        list.add(50);
        list.add(2);
        System.out.println("before sorting..."+list);
        Collections.sort(list);
        System.out.println("after sorting..."+list);
        Collections.rotate(list, 2);
        System.out.println("after rortation"+list);
        Collections.shuffle(list);
        System.out.println("after shuffling"+list);
        
        
        
	}

}
