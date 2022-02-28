import java.util.List;

public class UsuarioBaneadoService {

    private List<String> usuariosBaneados = List.of("Juan");

    public Boolean isBaneado(String usuario){
        return usuariosBaneados.contains(usuario);
    }
}
