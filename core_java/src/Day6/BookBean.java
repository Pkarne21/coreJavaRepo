package Day6;

public class BookBean {
	
		private int id;
	    private String name;
	    private String author;
	    private String price;
	    
	    
		public BookBean(int id, String name, String author, String price) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
			this.price = price;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesignation() {
			return author;
		}
		public void setDesignation(String designation) {
			this.author = designation;
		}
		@Override
		public String toString() {
			return "BookBean [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
		}

		public String getCompany() {
			return price;
		}
		public void setCompany(String company) {
			this.price = company;
		}
		
	    
	    
	}



