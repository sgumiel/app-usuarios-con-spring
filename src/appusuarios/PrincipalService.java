package appusuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrincipalService implements IPrincipalService{

  @Autowired
  private IComentarios comentariosService;

  @Autowired
  private IMostrarPerfil mostrarPerfilService;

  @Autowired
  private IComprarDinero comprarDineroService;

  @Override
  public void execute(String[] args){
    switch(args[0]) {

      case "comentario" -> this.comentariosService.comentar(args[1],args[2]);
      case "comprar" -> this.comprarDineroService.comprarDinero(args[1], Integer.valueOf(args[2]));
      case "perfil" -> this.mostrarPerfilService.mostrarPerfil(args[1]);
      default -> System.out.println("Comando no reconocido");
    }
  }
}