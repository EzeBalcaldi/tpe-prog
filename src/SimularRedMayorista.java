public class SimularRedMayorista {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Central c = new Central();
		Sucursal s = new Sucursal();
		c.agregarSucursal(s);
		//c.imprimirArreglo();
		//c.setMaximo(3, 70);
		//c.setMinimo(3, 50);
		//c.setCantidad(3, 99);
		c.imprimirEstado();
		//s.venderProducto(4, 81);
		c.completarProductos(s);
		
	}

}
