
public class Central {
	final int MAXSUC = 10;
	final int MAXFIL = 3;
	final int MAXCOL = 5;
	private int cantidadSucursales = 0;
	private Sucursal[] sucursales = new Sucursal[MAXSUC];
	private Sucursal s = new Sucursal(); //cambiar esto, hacerlo dinamico
	private int productos[][] = { 
					 {10, 5, 20 , 60, 80},
					 {50, 20, 0, 20, 110},
					 {100, 80, 40, 60, 120}
	};
	public void imprimirEstado(){
		this.getProductos();
		for(int i = 0; i< sucursales.length; i++){
			if(sucursales[i] != null){
				sucursales[i].getProductos();
			}
		}
	}
	public void imprimirArreglo(){
		for(int i = 0; i < sucursales.length; i++){
			System.out.println(sucursales[i]);
		}
	}
	public void getProductos() {
		System.out.println("Central");
		for(int i = 0; i< MAXFIL; i++){
			for(int j = 0; j<MAXCOL; j++){
				System.out.println("Id producto " +j + " min " +productos[1][j] + " cantidad " +productos[0][j] +" max " +productos[2][j]);
			}
		}
	}
	public void setProductos(int productos[][]) {
		this.productos = productos;
	}
	public void agregarSucursal(Sucursal s){
		boolean insertado = false;
		while(cantidadSucursales < MAXSUC -1 && !insertado){
			if(sucursales[cantidadSucursales] == null){
				sucursales[cantidadSucursales] = s;
				insertado = true;	
			}
			cantidadSucursales++;
		}
		}
	public void setMaximo(int producto, int maximo){
		productos[2][producto]= maximo;
		System.out.println(productos[2][producto]);
	}
	public void setMinimo(int producto, int minimo){
		productos[1][producto]= minimo;
		System.out.println(productos[1][producto]);
	}
	public void setCantidad(int producto, int cantidad){
		productos[0][producto]= cantidad;
		System.out.println(productos[0][producto]);
	}
	public void completarProductos(Sucursal s){
		for(int i = 0; i<cantidadSucursales; i++){
				for(int j = 0; j< MAXCOL; j++){
					if(sucursales[i].getMinimo(j)> sucursales[i].getCantidad(j)){
						int cantidad =((sucursales[i].getMaximo(j)+sucursales[i].getMinimo(j))/2) - sucursales[i].getCantidad(j);
						System.out.println("en la sucursal " +i + " se necesitan " +cantidad+ " del producto " + j);

			}	
			}
		}
	}
}