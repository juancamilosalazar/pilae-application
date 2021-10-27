package main.com.example.multimodule.transversal.mensajes.implementacion;



import main.com.example.multimodule.transversal.mensajes.MensajesEstrategia;
import main.com.example.multimodule.transversal.mensajes.dto.MensajeDTO;
import main.com.example.multimodule.transversal.mensajes.utilitario.CatalogoMensajes;


public class CacheMensajes implements MensajesEstrategia {

	private static CacheMensajes cacheMensajes = new CacheMensajes();

	private CacheMensajes() {
		// Se debe poder consultar en el cat�logo de par�metros
		String endPoint = "http://localhost:8090/api/mensaje/{1}/{2}";
		String nombreAplicacion = "pilae";
		CatalogoMensajes.inicializar(endPoint, nombreAplicacion);
	}

	public static CacheMensajes obtenerCacheMensajes() {
		return cacheMensajes;
	}

	@Override
	public void sincronizar(MensajeDTO mensaje) {
		CatalogoMensajes.sincronizarMensajeBase(mensaje);

	}

	@Override
	public MensajeDTO obtenerMensaje(String codigo) {
		return CatalogoMensajes.obtenerMensaje(codigo);
	}
}
