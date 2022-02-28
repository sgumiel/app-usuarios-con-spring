package appusuarios;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioBaneadoService implements IUsuarioBaneado{

    private List<String> usuariosBaneados = List.of("Juan");

    @Override
    public Boolean isBaneado(String usuario){
        return usuariosBaneados.contains(usuario);
    }
}
