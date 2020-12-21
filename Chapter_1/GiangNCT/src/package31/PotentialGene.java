/* Determines whether a a DNA string corresponds to a potential gene
 *      - length is a multiple of 3
 *      - starts with the start codon (ATG)
 *      - ends with a stop codon (TAA or TAG or TGA)
 *      - has no intervening stop codons
 */      
package package31;

public class PotentialGene {
  static final String[] STOP_CODONS = {"TAA", "TAG", "TGA"};
  static final String START_CODON = "ATG";
  public static void main(String[] args) {
    String s1 = "ATGCGCCTGCGTCTGTACTAG";
    String s2 = "ATGCGCTGCGTCTGTACTAG";
    System.out.println(isPotentialGene(s1));
    System.out.println(isPotentialGene(s2));

  }
  
  static boolean isPotentialGene(String gene) {
    if (!(gene.length() % 3 == 0)) return false;
    if (!gene.startsWith(START_CODON)) return false;
    boolean correctEnd = false;
    for (String s : STOP_CODONS) {
      if (gene.endsWith(s)) correctEnd = true;
      for (int i = 0; i < gene.length() - 3; i += 3) {
        if (i % 3 == 0) {
          if (gene.substring(i, i + 3).equals(s)) return false;
        }
      }
    }
    if (!correctEnd) return false;
    return true;
    
  }
}
