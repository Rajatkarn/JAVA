class A{
	class B{
		class C{}
	}
	class D{}
	void m1(){
		class B{}
		class E{}
		B b = new B(){};
		D d = new D();
	}
		void m2(){
			class B{}
			class G{}
			G g = new G(){};
			G g2 = new G();
		}
	}
