public class MostrarPerfilService implements IMostrarPerfil{

  private IUsuariosService usuariosService;

  @Override
  public void mostrarPerfil(String usuario) {

    Usuario usu = this.usuariosService.findUsuario(usuario);

    if(usu !=null) {
      System.out.println("El usuario: "+usu.nombre+" tiene el nickname: " + usu.nickname);
    }

  }

  public void setUsuariosService(UsuariosService usuariosService){
    this.usuariosService = usuariosService;
  }

}
