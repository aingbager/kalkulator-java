class Perhitungan{
  int a;
  int b;

  Perhitungan(int a,int b){
    this.a = a;
    this.b = b;
  }

  void showKali(){
    System.out.println("hasil: "+ (a*b));
  }

  void showBagi(){
    System.out.println("hasil: "+ (a/b));
  }

  void showTambah(){
    System.out.println("hasil: "+ (a+b));
  }

  void showKurang(){
    System.out.println("hasil: "+ (a-b));
  }
}
