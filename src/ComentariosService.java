public class ComentariosService {

  private UsuariosService usuariosService;

  public void comentar(String usuario, String comentario) {

    Usuario usu = this.usuariosService.findUsuario(usuario);

    if(usu != null) {
      System.out.println("El usuario: "+usuario+" comenta lo siguiente: " + comentario);
    }

  }

  public void setUsuariosService(UsuariosService usuariosService) {
    this.usuariosService = usuariosService;
  }
}
