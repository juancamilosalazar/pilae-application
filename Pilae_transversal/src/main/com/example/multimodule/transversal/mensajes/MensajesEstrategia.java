package main.com.example.multimodule.transversal.mensajes;


import main.com.example.multimodule.transversal.mensajes.dto.MensajeDTO;

public interface MensajesEstrategia {

	void sincronizar(MensajeDTO mensaje);

	MensajeDTO obtenerMensaje(String codigo);

}
