package appusuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComentariosService implements IComentarios{

  @Autowired
  private IUsuariosService usuariosService;

  @Override
  public void comentar(String usuario, String comentario) {

    Usuario usu = this.usuariosService.findUsuario(usuario);

    if(usu != null) {
      System.out.println("El usuario: "+usuario+" comenta lo siguiente: " + comentario);
    }

  }

}
