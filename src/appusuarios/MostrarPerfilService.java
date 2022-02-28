package appusuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MostrarPerfilService implements IMostrarPerfil{

  @Autowired
  private IUsuariosService usuariosService;

  @Override
  public void mostrarPerfil(String usuario) {

    Usuario usu = this.usuariosService.findUsuario(usuario);

    if(usu !=null) {
      System.out.println("El usuario: "+usu.nombre+" tiene el nickname: " + usu.nickname);
    }
  }
}