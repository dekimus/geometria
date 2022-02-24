 
/**
 * 
 * @author Israel P�rez Valero
 * @version 1.2
 * 
 */
public class Rectangulo_IPV extends FiguraGeometrica_IPV {
	private double l1;
	private double l2;
	
	/**
	 * Constructor de la clase
	 * @param recibe dos dobles
	 * 
	 */
	public Rectangulo_IPV(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * Calcula el �rea del rect�ngulo
	 * @return devuelve un doble
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	
	/**
	 * Calcula el per�metro del ret�ngulo
	 * @return devuelve un doble
	 * 
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
