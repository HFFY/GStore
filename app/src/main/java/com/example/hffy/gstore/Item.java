package com.example.hffy.gstore;


public class Item {
	protected int id;
	protected String titulo;
	protected String descripcion;
	protected int imagen;
	protected String linkVideo;
	protected int imageng;
	protected int precio;
	protected String descripciong;

	public Item(int id,int precio, String titulo, String descripcion, int imagen, String linkVideo,int imageng,String descripciong)
	{
		this.id=id;
		this.precio=precio;
		this.titulo=titulo;
		this.descripcion=descripcion;
		this.imagen=imagen;
		this.linkVideo=linkVideo;
		this.imageng=imageng;
		this.descripciong=descripciong;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getImagen() {
		return imagen;
	}

	public void setImagen(int imagen) {
		this.imagen = imagen;
	}

	public String getLinkVideo() {
		return linkVideo;
	}

	public void setLinkVideo(String linkVideo) {
		this.linkVideo = linkVideo;
	}

	public int getImageng(){return imageng;}

	public void setImageng(int imageng){this.imageng=imageng;}

	public String getDescripciong(){return descripciong;}

	public void setDescripciong(String descripciong) {
		this.descripciong = descripciong;
	}
}
