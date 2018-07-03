package com.optum.cs.training.patterns.adapter;

import com.optum.cs.training.patterns.model.CDM;
import com.optum.cs.training.patterns.model.Document;
import com.optum.cs.training.patterns.model.PDF;
import com.optum.cs.training.patterns.model.WebPage;

public class WebPageAdapterClient {

	public static void main(String[] args) {
		Document pdf = new PDF(1);
		Document cdm = new CDM(3);
		pdf.view();
		pdf.delete();
		
		cdm.open();
		cdm.view();
		
		Document page1 = new WebPageObjectAdapter(new WebPage("page1"));
		page1.view();
		page1.close();
		Document page2 = new WebPageClassAdapter("page2");
		page2.view();
		page2.update();
	}

}
