package org.restsimple.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/services")
public class AssetService {
	@GET
	@Path("/assets")
	@Produces(MediaType.APPLICATION_XML)
	public String getAssets() {
		return retriveAssets();
	}
	
	private String retriveAssets() {
		
		return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
				"<resourceList xmlns=\"http://domain.company.org/cms/services\">" +
				"<asset href=\"https://{serverurl}:8443/services/assets/{id1}\">" +
				"<name>Company1</name>" +
				"<description>Description for Company1 asset</description>" +
				"</asset>" +
				"<asset href=\"https://{serverurl}:8443/services/assets/{id2}\">" +
				"<name>Company2</name>" +
				"<description>Description for Company2 asset</description>" +
				"</asset>" +
				"<asset href=\"https://{serverurl}:8443/services/assets/{id3}\">" +
				"<name>Company3</name>" +
				"<description>Description for Company3 asset</description>" +
				"</asset>" +
				"<asset href=\"https://{serverurl}:8443/services/assets/{id4}\">" +
				"<name>Company4</name>" +
				"<description>Description for Company4 asset</description>" +
				"</asset>" +
				"</resourceList>";
	}

}
