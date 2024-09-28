package com.example.recours;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.recours.Entity.AidType;
import com.example.recours.Entity.Chef;
import com.example.recours.Entity.Customer;
import com.example.recours.Entity.Demande;
import com.example.recours.Entity.SituationType;
import com.example.recours.Repository.AidTypeRepo;
import com.example.recours.Repository.ChefRepo;
import com.example.recours.Repository.CustomerRepo;
import com.example.recours.Repository.DemandeRepo;
import com.example.recours.Repository.SituationTypeRepo;


@SpringBootApplication
public class RecoursApplication {

	public final AidTypeRepo aidRepo;
	public final ChefRepo chefRepo;
	public final CustomerRepo customerRepo;
	public final DemandeRepo demandeRepo;
	public final SituationTypeRepo situationTypeRepo;



	public RecoursApplication(AidTypeRepo aidRepo,ChefRepo chefRepo,CustomerRepo customerRepo,DemandeRepo demandeRepo,SituationTypeRepo situationTypeRepo)
	{
		this.aidRepo = aidRepo;
		this.chefRepo = chefRepo;
		this.customerRepo = customerRepo;
		this.demandeRepo = demandeRepo;
		this.situationTypeRepo = situationTypeRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(RecoursApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void onReady() {

		AidType aid1 = new AidType(1,"الإعانة الجزافية","Aide Forfaitaire");
		aidRepo.save(aid1);
		AidType aid2 = new AidType(2,"منحة شهرية","Allocation Mensuelle");
		aidRepo.save(aid2);
		AidType aid3 = new AidType(3,"منحة الولادة","Allocation Naissance");
		aidRepo.save(aid3);

		SituationType situation114 = new SituationType(114,"Demande rejetée","DEMD_REJ");
		situationTypeRepo.save(situation114);

		SituationType situation113 = new SituationType(113,"Demande acceptée","DEMD_ACC");
		situationTypeRepo.save(situation113);

		SituationType situation100 = new SituationType(100,"Demande créee","DEM_PERT_CREE");
		situationTypeRepo.save(situation100);

		SituationType situation = new SituationType(101,"Demande en cours de contrôle éligibilité","DEM_PERT_ENC");
		situationTypeRepo.save(situation);

		SituationType situation116 = new SituationType(116,"Demande annulée","DEMD_ANN");
		situationTypeRepo.save(situation116);

		situation = new SituationType(118,"Demande suspendue","DEM_SUSP");
		situationTypeRepo.save(situation);

		situation = new SituationType(122,"Demande de recours créée","REC_CREE");
		situationTypeRepo.save(situation);

		situation = new SituationType(123,"Demande de recours acceptée","REC_ACC");
		situationTypeRepo.save(situation);

		situation = new SituationType(124,"Demande de recours rejetée","REC_REJ");
		situationTypeRepo.save(situation);

		situation = new SituationType(125,"Demande de recours prêt pour envoi","REC_PRET");
		situationTypeRepo.save(situation);

		situation = new SituationType(128,"Demande de recours annulée","REC_ANN");
		situationTypeRepo.save(situation);

		situation = new SituationType(129,"Demande de recours clôturée","REC_CLOT");
		situationTypeRepo.save(situation);

		situation = new SituationType(130,"Demande objet de recours","DEM_OBJ_REC");
		situationTypeRepo.save(situation);

		situation = new SituationType(115,"Demande enregistrée","DEMD_ENR");
		situationTypeRepo.save(situation);

		situation = new SituationType(126,"Suspension acceptée");
		situationTypeRepo.save(situation); 

		situation = new SituationType(127,"Suspension rejetée");
		situationTypeRepo.save(situation);                          

		Customer cs = new Customer("25310976","Fathi123");
		customerRepo.save(cs);
		Chef chef = new Chef(568862,cs);
		chefRepo.save(chef);
		Demande dem = new Demande(568859,chef,aid1,situation113,LocalDateTime.of(2023, 12, 02, 19, 58));
		demandeRepo.save(dem);

		 cs = new Customer("48604012","Fathi123");
		customerRepo.save(cs);
		chef = new Chef(770496,cs);
		chefRepo.save(chef);
		dem = new Demande(770453,chef,aid2,situation114,LocalDateTime.of(2023, 12, 05, 19, 49));
		demandeRepo.save(dem);

		 cs = new Customer("42623050","Fathi123");
		customerRepo.save(cs);
		chef = new Chef(772985,cs);
		chefRepo.save(chef);
		dem = new Demande(772962,chef,aid2,situation114,LocalDateTime.of(2023, 12, 05, 20, 14));
		demandeRepo.save(dem);

		 cs = new Customer("55200158","Fathi123");
		customerRepo.save(cs);
		chef = new Chef(1530982,cs);
		chefRepo.save(chef);
		dem = new Demande(1531340,chef,aid2,situation114,LocalDateTime.of(2023, 12, 12, 10, 20));
		demandeRepo.save(dem);

		 cs = new Customer("53299410","Fathi123");
		customerRepo.save(cs);
		chef = new Chef(1570047,cs);
		chefRepo.save(chef);
		dem = new Demande(1570405,chef,aid2,situation116,LocalDateTime.of(2023, 12, 12, 13, 7));
		demandeRepo.save(dem);

		 cs = new Customer("33143013","Fathi123");
		customerRepo.save(cs);
		chef = new Chef(1579654,cs);
		chefRepo.save(chef);
		dem = new Demande(1580012,chef,aid2,situation114,LocalDateTime.of(2023, 12, 12, 13, 53));
		demandeRepo.save(dem);

		 cs = new Customer("80344307","Fathi123");
		customerRepo.save(cs);
		chef = new Chef(1593881,cs);
		chefRepo.save(chef);
		dem = new Demande(1594238,chef,aid2,situation116,LocalDateTime.of(2023, 12, 12, 15, 19));
		demandeRepo.save(dem);

		 cs = new Customer("23781620","Fathi123");
		customerRepo.save(cs);
		chef = new Chef(4673151,cs);
		chefRepo.save(chef);
		dem = new Demande(4689517,chef,aid3,situation113,LocalDateTime.of(2024, 2, 18, 21, 45));
		demandeRepo.save(dem);

		 cs = new Customer("60061090","Fathi123");
		customerRepo.save(cs);
		chef = new Chef(5307546,cs);
		chefRepo.save(chef);
		dem = new Demande(5439691,chef,aid2,situation100,LocalDateTime.of(2024, 6, 12, 10, 49));
		demandeRepo.save(dem);
		
		 cs = new Customer("36726024","Fathi123");
		customerRepo.save(cs);
		chef = new Chef(4111911,cs);
		chefRepo.save(chef);
		dem = new Demande(5439761,chef,aid3,situation113,LocalDateTime.of(2024, 1, 30, 12, 1));
		demandeRepo.save(dem);

		

	}

}
