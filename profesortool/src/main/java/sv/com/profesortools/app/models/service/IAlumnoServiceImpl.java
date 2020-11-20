package sv.com.profesortools.app.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.com.profesortools.app.models.dao.IAlumnoDao;
import sv.com.profesortools.app.models.entity.Alumno;

@Service
public class IAlumnoServiceImpl implements IAlumnoService {

	@Autowired
	IAlumnoDao alumnoDao;

	@Override
	public void save(Alumno alumno) {
		alumnoDao.save(alumno);

	}

}
