package proekt.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import proekt.models.Relation;
import proekt.services.RelationService;

@RestController
@RequestMapping("rest/relations")
public class RelationController extends CrudResource<Relation, RelationService> {

	@Autowired
	RelationService relationService;

	@Override
	public RelationService getService() {
		return relationService;
	}
	
	@Override
	public Relation create(@RequestBody Relation entity, HttpServletRequest request, HttpServletResponse response) {
		return relationService.saveEntity(entity);
	}
}
