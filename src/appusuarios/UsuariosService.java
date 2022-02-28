package appusuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class UsuariosService implements IUsuariosService{

  @Autowired
  private UsuarioBaneadoService usuarioBaneadoService;

  private Map<String, Usuario> usuarios = Map.ofEntries(
      Map.entry("Juan", new Usuario("Juan", "juan89")),
      Map.entry("Soledad", new Usuario("Soledad", "sole2000")),
      Map.entry("Lorena", new Usuario("Lorena", "lalore")));

  @Override
  public Usuario findUsuario(String nombre) {

    if (!usuarioBaneadoService.isBaneado(nombre)) {
      return usuarios.get(nombre);
    } else {
      return null;
    }
  }
}