package mr.gov.mesrstic.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.transaction.annotation.Transactional;

import mr.gov.mesrstic.model.Etudiant;

@Transactional
@WebService
public interface GesScolarWS{
	
	@WebMethod String getHelloWorldAsString();
	
	@WebMethod List<Etudiant> getEtudiants();
	
}