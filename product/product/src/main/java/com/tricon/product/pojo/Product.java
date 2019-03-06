package com.tricon.product.pojo;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="product")
public class Product {
		
		@Id
		@NotNull
		private int id;
		@NotNull
		private String name;
		@NotNull
		private String type;
		@NotNull
		private String url;
		@NotNull
		private Price price;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", type=" + type + ", url=" + url + ", price=" + price
					+ "]";
		}
		public Product(int id, String name, String type, String url, Price price) {
			super();
			this.id = id;
			this.name = name;
			this.type = type;
			this.url = url;
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public Price getPrice() {
			return price;
		}
		public void setPrice(Price price) {
			this.price = price;
		}
		public Product() {
			super();
		}

		
}
