import java.util.Map;

public class UsuariosService {

  private Map<String, Usuario> usuarios = Map.ofEntries(
      Map.entry("Juan", new Usuario("Juan", "juan89")),
      Map.entry("Soledad", new Usuario("Soledad", "sole2000")),
      Map.entry("Lorena", new Usuario("Lorena", "lalore")));

  public Usuario findUsuario(String nombre) {

    return usuarios.get(nombre);
  }

}
