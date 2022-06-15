package TaosBackend.Taos.dao;
import TaosBackend.Taos.Modelo.Vehiculo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class VehiculoDaoImplement implements  VehiculoDAO {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void registrar(Vehiculo vehiculo) {
        entityManager.merge(vehiculo);
    }

    @Override
    @Transactional
    public Vehiculo buscarVehiculoPlaca(String placa) {
        return entityManager.find(Vehiculo.class, placa);
    }


}
