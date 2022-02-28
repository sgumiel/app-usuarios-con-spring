public class ComprarDineroService {

  private UsuariosService usuariosService;

  private UsuarioBaneadoService usuarioBaneadoService;

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

  public void setUsuariosService(UsuariosService usuariosService) {
    this.usuariosService = usuariosService;
  }

  public void setUsuarioBaneadoService(UsuarioBaneadoService usuarioBaneadoService) {
    this.usuarioBaneadoService = usuarioBaneadoService;
  }
}
