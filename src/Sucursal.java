public class Sucursal {
	public final int MAXFIL = 3;
	public final int MAXCOL = 5;
	private int productos[][] = { 
			 {-1, 50, -1 , -1, 80},
			 {-1, 60, -1, -1, 110},
			 {-1, 80, -1, -1, 120}
};
	public void  getProductos() {
		System.out.println("Sucursal");
		for(int i = 0; i< MAXFIL; i++){
			for(int j = 0; j<MAXCOL; j++){
				System.out.println("Id producto " +j + " min " +productos[1][j] + " cantidad " +productos[0][j] +" max " +productos[2][j]);
			}
		}
	}
	public void setMaximo(int producto, int maximo){
		productos[2][producto]= maximo;
		System.out.println(productos[2][producto]);
	}
	public int getMaximo(int producto){
		return productos[2][producto];
	}
	public void setMinimo(int producto, int minimo){
		productos[1][producto]= minimo;
		System.out.println(productos[1][producto]);
	}
	public int getMinimo(int producto){
		return productos[1][producto];
	}
	public void setCantidad(int producto, int cantidad){
		productos[0][producto]= cantidad;
		System.out.println(productos[0][producto]);
	}
	public int getCantidad(int producto){
		return productos[0][producto];
	}
	public void venderProducto(int producto, int cantidad){
		if(productos[0][producto] != -1){
			if((productos[0][producto]- cantidad) >= 0){
				productos[0][producto]= productos[0][producto] - cantidad;
				System.out.println(productos[0][producto]);
			}else{
					System.out.println("No se puede vender esa cantidad, inserte un valor menor o igual a " +productos[0][producto]);
				}
		}else{
			System.out.println("Este producto no es operado en esta sucursal");

		}
		
		}
	}

