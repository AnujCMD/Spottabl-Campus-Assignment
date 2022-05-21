package assign.Spottabl.Spottabl.Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import assign.Spottabl.Spottabl.Service.Service;

@SpringBootApplication
public class SpottablAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpottablAssignmentApplication.class, args);
		
	}
}
@RestController
 class SpottablController {
	@GetMapping("/download") 
	public ResponseEntity<Object> downloadFile() throws IOException  {
		FileWriter filewriter =  null;
		try {
		Service v1 = new Service();
		
		v1.setCode("Spottabl");
		v1.userOnSpottabl();
		v1.userInvitedFromSpottabl();
		v1.userAcceptedInvite();
		v1.userInvitedFromSpottablUser();
		
		Service v2 = new Service();
		v2.setCode("flexmoney");
//		v2.FlexUserOnSpottabl();
//		v2.FlexUserInvitedFromSpottabl();
//		v2.FlexUserAcceptedInvite();
//		v2.FlexUserInvitedFromSpottablUser();
		System.out.println(v1);
		List<Service> csvDataList = new ArrayList<>();
		csvDataList.add(v1);
		csvDataList.add(v2);
		
		StringBuilder filecontent = new StringBuilder("Client Code, Number of users on spottabl, Number of users invited from spottabl, Number of users who have accepted invite, Number of users invited from spottabl user\n");
	//	for(Service csv:csvDataList) {
			filecontent.append(v1.getCode()).append(",").append(v1.userOnSpottabl()).append(",").append(v1.userInvitedFromSpottabl()).append(",").append(v1.userAcceptedInvite()).append(",").append(v2.userInvitedFromSpottablUser()).append("\n");
			filecontent.append(v2.getCode()).append(",").append(v2.flexUserOnSpottabl()).append(",").append(v2.flexUserInvitedFromSpottabl()).append(",").append(v2.flexUserAcceptedInvite()).append(",").append(v2.flexUserInvitedFromSpottablUser()).append("\n");
		
		String filename = "D:\\Spottabl\\File\\spottabl.csv";
		
	 filewriter = new FileWriter(filename);
		filewriter.write(filecontent.toString());
		filewriter.flush();
		
		File file = new File(filename);
		
		InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));
		headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
		headers.add("Pragma", "no-cache");
		headers.add("Expires", "0");
		
		ResponseEntity<Object> responseEntity = ResponseEntity.ok().headers(headers).contentLength(file.length()).contentType(MediaType.parseMediaType("application/txt")).body(resource);
		return responseEntity;
		} catch (Exception e ) {
			return new ResponseEntity<>("error occurred", HttpStatus.INTERNAL_SERVER_ERROR);	
		} finally {
			if(filewriter!=null)
				filewriter.close();
		}
	}
}

