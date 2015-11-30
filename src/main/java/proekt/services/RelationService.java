package proekt.services;

import proekt.models.Relation;

public interface RelationService extends BaseEntityCrudService<Relation> {
	
	public Relation saveEntity(Relation relation);
}
