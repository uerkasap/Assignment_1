package JavaDeneme;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class list_arrange {
	
	private int pid;
	private String pname;
	private String desc;
	private double price;
	private double brand;
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * create a list of products
		 * add few items in the list
		 * arrange the items based on the price
		 * display all the items of a certain brand
		 */
		List myList = new ArrayList();
		myList.add(0,"Utku");
		myList.add(1,"Dilek");
		myList.add(2,"Masal");
		Collections.sort(myList);
		
		System.out.println(myList);

	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(brand);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + pid;
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		list_arrange other = (list_arrange) obj;
		if (Double.doubleToLongBits(brand) != Double.doubleToLongBits(other.brand))
			return false;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (pid != other.pid)
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

}
