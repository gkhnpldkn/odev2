package odev2.dataAccess.abstracts;
import java.util.List;
import odev2.entities.concretes.Kullanici;

public interface KullaniciDao {
void add(Kullanici kullanici);
void delete(Kullanici kullanici);
List<Kullanici> getAll();

}
