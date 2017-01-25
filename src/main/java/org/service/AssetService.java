package org.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/services")
public class AssetService {
	@GET
	@Path("/msos")
	@Produces(MediaType.TEXT_XML)
	public String getMSOs() {
		return retriveMSOs();
	}
	
	private String retriveMSOs() {
		
		return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
				"<resourceList xmlns=\"http://domain.company.org/cms/services\">" +
				"<mso href=\"https://{serverurl}:8443/services/msos/{id1}\">" +
				"<name>XYZCompany</name>" +
				"<description>Description for XYZCompany MSO</description>" +
				"</mso>" +
				"<mso href=\"https://{serverurl}:8443/services/msos/{id2}\">" +
				"<name>ABCCompany</name>" +
				"<description>Description for ABCCompany MSO</description>" +
				"</mso>" +
				"<mso href=\"https://{serverurl}:8443/services/msos/{id3}\">" +
				"<name>JKLCompany</name>" +
				"<description>Description for JKLCompany MSO</description>" +
				"</mso>" +
				"<mso href=\"https://{serverurl}:8443/services/msos/{id4}\">" +
				"<name>PQRCompany</name>" +
				"<description>Description for PQRCompany MSO</description>" +
				"</mso>" +
				"</resourceList>";
	}

}
