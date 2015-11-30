package proekt.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proekt.models.Relation;
import proekt.repositories.RelationRepository;
import proekt.services.RelationService;

@Service
public class RelationServiceImpl extends BaseEntityCrudServiceImpl<Relation, RelationRepository>
		implements RelationService {

	@Autowired
	RelationRepository repository;

	@Override
	protected RelationRepository getRepository() {
		return repository;
	}

	@Override
	public Relation saveEntity(Relation relation) {
		Relation startEnd = repository.findBystartDestinationAndEndDestination(relation.getStartDestination(),
				relation.getEndDestination());
		if(startEnd != null){
			return startEnd;
		}
		else{
			return getRepository().save(relation);
		}
	}

}
