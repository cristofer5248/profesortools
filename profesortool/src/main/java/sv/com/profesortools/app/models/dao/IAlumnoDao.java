package sv.com.profesortools.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import sv.com.profesortools.app.models.entity.Alumno;

public interface IAlumnoDao  extends PagingAndSortingRepository<Alumno, Long>{

}
