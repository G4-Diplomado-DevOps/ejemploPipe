package ejemplopipeline;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiezxcientoTest {

	@Test
	public void testDiezxciento() throws Exception {
		Diezxciento diezxciento = new Diezxciento(23000000,900000);
		assertEquals(2300000, diezxciento.diezxciento());
	}

        @Test
        public void testDiezxciento() throws Exception {
                Diezxciento diezxciento = new Diezxciento(14000000,500000);
                assertEquals(1400000, diezxciento.diezxciento());
        }

       @Test
        public void testDiezxciento() throws Exception {
                Diezxciento diezxciento = new Diezxciento(38000000,5000000);
                assertEquals(3800000, diezxciento.diezxciento());
        }


	@Test
	public void testImpuesto() throws Exception {
		assertEquals(3800000, testimpuesto();

	}

	@Test
	public void testSaldoAhorro() throws Exception {
		SaldoAhorro saldoahorro = new SaldoAhorro(1000000);
		asserEquals(9000000, testSaldoAhorro();

	}




}
