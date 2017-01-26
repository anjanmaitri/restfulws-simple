package org.restsimple.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.restsimple.common.Asset;

@Path("/services")
public class AssetService {
	
	@GET
	@Path("/assets")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Asset> getAssetsAsObjList() {
		return retriveAssetsAsList();
	}
	
	@GET
	@Path("/assetsobj")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Asset> getAssetsAsList() {
		return retriveAssetsAsList();
	}
	
	private List<Asset> retriveAssetsAsList() {
		List<Asset> assetList = new ArrayList<>();
		Asset asset1 = new Asset();
		asset1.setName("Company1");
		asset1.setDescription("Description of Company1");
		assetList.add(asset1);
		Asset asset2 = new Asset();
		asset2.setName("Company2");
		asset2.setDescription("Description of Company2");
		assetList.add(asset2);
		return assetList;
	}

	@GET
	@Path("/assetsstr")
	@Produces(MediaType.APPLICATION_XML)
	public String getAssets() {
		return retriveAssets();
	}
	
	private String retriveAssets() {
		
		return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
				"<resourceList xmlns=\"http://domain.company.org/cms/services\">" +
				"<asset href=\"https://{serverurl}:8080/services/assets/{id1}\">" +
				"<name>Company1</name>" +
				"<description>Description for Company1 asset</description>" +
				"</asset>" +
				"<asset href=\"https://{serverurl}:8080/services/assets/{id2}\">" +
				"<name>Company2</name>" +
				"<description>Description for Company2 asset</description>" +
				"</asset>" +
				"<asset href=\"https://{serverurl}:8080/services/assets/{id3}\">" +
				"<name>Company3</name>" +
				"<description>Description for Company3 asset</description>" +
				"</asset>" +
				"<asset href=\"https://{serverurl}:8080/services/assets/{id4}\">" +
				"<name>Company4</name>" +
				"<description>Description for Company4 asset</description>" +
				"</asset>" +
				"</resourceList>";
	}

}
