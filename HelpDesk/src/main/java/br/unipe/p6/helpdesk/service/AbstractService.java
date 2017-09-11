package br.unipe.p6.helpdesk.service;

import java.util.List;

import br.unipe.p6.helpdesk.dao.IAbstractDao;

public class AbstractService<DAO extends IAbstractDao<Entity>, Entity> {
	
	private DAO dao;
	
	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
        this.dao = dao;
    }
   
	public List<Entity> listar(){
		return dao.findAll();
	}

	public Entity salvar(Entity entity){
		return dao.save(entity);
	}

	public boolean deletar(Entity entity){
		try {
			return dao.delete(entity);
		} catch (Exception e) {
			return false;
		}
	}
	
	public Entity procurarPorId(Long id) {
		return dao.procurarPorId(id);
	}

}
