public class SimularRedMayorista {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Central c = new Central();
		Sucursal s = new Sucursal();
		Sucursal d = new Sucursal();
		Sucursal e = new Sucursal();
		c.agregarSucursal(s);
		c.agregarSucursal(d);
		c.agregarSucursal(e);
		//c.imprimirArreglo();
		//c.setMaximo(3, 70);
		//c.setMinimo(3, 50);
		//c.setCantidad(3, 99);
//		s.inicializarSucursal();
//		c.inicializarCentral();
		c.imprimirEstado();
		//c.completarProductos();
		//c.imprimirEstado(); //esto no anda bien, no se le pasa bien la cantidad de sucursales 
		//s.venderProducto(4, 50);
		c.productosFaltantes(s);
		//c.adquirirProductos();
		//c.imprimirEstado();
	}

}
