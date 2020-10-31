/**
 * 
 */
package uninsubria.utils.languages;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;

import org.junit.jupiter.api.Test;

/**
 * @author Giulia Pais
 *
 */
class LanguageManagerTest {
	private LanguageManager lman = new LanguageManager(Language.ITALIAN);

	@Test
	public void testGetDictionaryFile() throws URISyntaxException {
		File dict = lman.getDictionaryFile();
		assertNotNull(dict);
		assertTrue(dict.exists());
	}
	
	@Test
	public void testGetAbbreviations() {
		HashMap<String, String> ht = lman.getAbbreviations();
		assertNotNull(ht);
		List<String> l = Arrays.asList("agg.", "v.", "s.m.", "s.f.", "avv.", "cong.", "prep.", "inter.");
		Set<String> expected = new HashSet<>(l);
		assertEquals(ht.keySet(), expected);
		assertEquals(ht.get("agg."), "Aggettivo");
		assertEquals(ht.get("v."), "Verbo");
		assertEquals(ht.get("s.m."), "Sostantivo maschile");
		assertEquals(ht.get("s.f."), "Sostantivo femminile");
		assertEquals(ht.get("avv."), "Avverbio");
		assertEquals(ht.get("cong."), "Congiunzione");
		assertEquals(ht.get("prep."), "Preposizione");
		assertEquals(ht.get("inter."), "Interiezione");
	}
	
	@Test
	public void testGetTermTypes() {
		List<String> types = lman.getTermTypes();
		List<String> l = Arrays.asList("Aggettivo", "Verbo", "Sostantivo maschile", "Sostantivo femminile", "Avverbio", "Congiunzione", "Preposizione", 
				"Interiezione");
		assertEquals(types, l);
	}
	
	@Test
	public void testGetAlternativeTermType() {
		String alt = lman.getAlternativeTermType();
		assertEquals(alt, "Altro");
	}
	
	@Test
	public void testGetValidTypes() {
		List<String> types = lman.getValidTypes();
		List<String> l = Arrays.asList("Aggettivo", "Verbo", "Sostantivo maschile", "Sostantivo femminile");
		assertEquals(types, l);
	}
	
	@Test
	public void testGetResourceBundle() {
		ResourceBundle res = lman.getResourcesBundle();
		assertEquals(res.getString("exit_btn"), "Esci");
		assertEquals(res.getString("opt_btn"), "Opzioni");
		assertEquals(res.getString("register_btn"), "Nuovo giocatore");
		assertEquals(res.getString("login_btn"), "Login");
	}
}
