package san.math;

class PolarComplex extends Complex {

  private final double modulus;

  private final double argument;

  PolarComplex(double modulus, double argument) {
    this.modulus = modulus;
    this.argument = argument;
  }

  @Override
  public double re() {
    return this.modulus() * Math.cos(this.argument());
  }

  @Override
  public double im() {
    return this.modulus() * Math.sin(this.argument());
  }

  @Override
  public double modulus() {
    return this.modulus;
  }

  @Override
  public double argument() {
    return this.argument;
  }

  @Override
  public String toString() {
    return this.modulus() + "∠" + this.argument();
  }

  @Override
  public Complex add(Complex other) {
    return this.asCarthesian().add(other).asPolar();
  }

  @Override
  public Complex asCarthesian() {
    return new StdComplex(this.re(), this.im());
  }

  @Override
  public Complex asPolar() {
    return this;
  }

@Override
public Complex substract(Complex other) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Complex multiply(Complex other) {
	return (new StdComplex(this.re()*other.re() -this.im()*other.im() , this.re()*other.im()+this.im()*other.re())).asPolar();
}

@Override
public Complex devide(Complex other) {
	return this.asCarthesian().devide(other.asCarthesian()).asPolar();
	}

@Override
public Complex conjugate() {
	// TODO Auto-generated method stub
	return new PolarComplex(this.modulus(), this.argument()*(-1));
}

  
}
