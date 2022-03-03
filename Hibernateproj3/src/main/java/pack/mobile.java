package pack;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="emobile")
public class mobile {

		private int ID;
		private String name;
		private String price;
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		
		
		
	}
		


