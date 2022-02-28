public class ComprarDineroService {

  private UsuariosService usuariosService;

  public void comprarDinero(String usuario, Integer cantidad) {

    Usuario usu = this.usuariosService.findUsuario(usuario);

    if(usu !=null ){
      System.out.println("El usuario: "+usuario+" compra la siguiente cantidad: " + cantidad);
    }

  }

  public void setUsuariosService(UsuariosService usuariosService) {
    this.usuariosService = usuariosService;
  }
}
