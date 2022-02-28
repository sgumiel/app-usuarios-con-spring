package appusuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComprarDineroService implements IComprarDinero{

  @Autowired
  private IUsuariosService usuariosService;

  @Autowired
  private IUsuarioBaneado usuarioBaneadoService;

  @Override
  public void comprarDinero(String usuario, Integer cantidad) {

    Boolean isUsuarioBaneado = this.usuarioBaneadoService.isBaneado(usuario);

    if(isUsuarioBaneado) {
      System.out.println("El usuario: " + usuario + " está baneado y no puede comprar");
      return;
    }

    Usuario usu = this.usuariosService.findUsuario(usuario);

    if(usu !=null ){
      System.out.println("El usuario: "+usuario+" compra la siguiente cantidad: " + cantidad);
    }
  }
}