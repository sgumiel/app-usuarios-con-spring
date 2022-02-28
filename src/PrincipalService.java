public class PrincipalService {

  private ComentariosService comentariosService;
  private MostrarPerfilService mostrarPerfilService;
  private ComprarDineroService comprarDineroService;

  public void execute(String[] args){
    switch(args[0]) {

      case "comentario" -> this.comentariosService.comentar(args[1],args[2]);
      case "comprar" -> this.comprarDineroService.comprarDinero(args[1], Integer.valueOf(args[2]));
      case "perfil" -> this.mostrarPerfilService.mostrarPerfil(args[1]);
      default -> System.out.println("Comando no reconocido");
    }
  }

  public void setComentariosService(ComentariosService comentariosService){
    this.comentariosService=comentariosService;
  }

  public void setMostrarPerfilService(MostrarPerfilService mostrarPerfilService) {
    this.mostrarPerfilService = mostrarPerfilService;
  }

  public void setComprarDineroService(ComprarDineroService comprarDineroService) {
    this.comprarDineroService = comprarDineroService;
  }

}
