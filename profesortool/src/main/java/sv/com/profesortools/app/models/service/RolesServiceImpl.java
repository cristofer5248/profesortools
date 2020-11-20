package sv.com.profesortools.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.com.profesortools.app.models.dao.IRolesDao;
import sv.com.profesortools.app.models.entity.Role;

@Service
public class RolesServiceImpl implements IRolesService {

	@Autowired
	private IRolesDao rolesDao;

	@Override
	public void update(Role role) {
		rolesDao.save(role);

	}

	@Override
	public void save(Role role) {
		rolesDao.save(role);

	}

	@Override
	public Role findByOne(Long id) {
		return rolesDao.findById(id).orElse(null);
	}

	@Override
	public Role findByUser_idByAuthority(Long id, String rol) {
		return rolesDao.findByUser_idByAuthority(id, rol);
	}

	@Override
	public void delete(Role id) {
		rolesDao.delete(id);

	}

	@Override
	public Role findByUser_id(Long id) {
		return rolesDao.findByUser_idUnique(id);
	}

	@Override
	public List<Role> findByUser_idList(Long id) {
		// TODO Auto-generated method stub
		return rolesDao.findByUser_idList(id);
	}

}
