package com.tricon.product.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Tax {

		private double SGST;
		private double CGST;
		public double getSGST() {
			return SGST;
		}
		public void setSGST(double sGST) {
			SGST = sGST;
		}
		public double getCGST() {
			return CGST;
		}
		public void setCGST(double cGST) {
			CGST = cGST;
		}
		public Tax(double sGST, double cGST) {
			super();
			SGST = sGST;
			CGST = cGST;
		}
		@Override
		public String toString() {
			return "Tax [SGST=" + SGST + ", CGST=" + CGST + "]";
		}
		public Tax() {
			super();
		}
		
}
