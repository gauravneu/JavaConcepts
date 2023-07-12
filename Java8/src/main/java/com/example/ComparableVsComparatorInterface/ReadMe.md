Non-final methods in Object class :
1) equals, 2) hashCode, 3) toString, 4) clone, and 5)  finalize

Equals method implements equivalence relation, 
i.e. Reflexive, symmetric, transitive and consistent

public interface Comparable<T> {
    int compareTo(T t);
}
returns -1, 0, or 1
In a compareTo method, fields are compared for order rather than equality. 

Use of the relational operators < and > in compareTo 
methods is verbose and error-prone and no longer recommended.

When comparing field values in the implementations 
of the compareTo methods, avoid the use of the < and > operators.
Instead, use the static compare methods in the boxed primitive classes or the 
comparator construction methods in the Comparator interface.


a)
// Single-field Comparable with object reference field
public final class CaseInsensitiveString implements Comparable<CaseInsensitiveString> {
    public int compareTo(CaseInsensitiveString cis) {
        return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s);
}
... // Remainder omitted
}

implements => CaseInsensitiveString reference can be compared only to another CaseInsensitiveString reference



b) 
// Multiple-field Comparable with primitive fields
public int compareTo(PhoneNumber pn) {
    int result = Short.compare(areaCode, pn.areaCode);
    if (result == 0)  {
        result = Short.compare(prefix, pn.prefix);
    if (result == 0)
        result = Short.compare(lineNum, pn.lineNum);
    }
    return result;
}


c)
// Comparable with comparator construction methods
private static final Comparator<PhoneNumber> COMPARATOR =
        comparingInt((PhoneNumber pn) -> pn.areaCode)
        .thenComparingInt(pn -> pn.prefix)
        .thenComparingInt(pn -> pn.lineNum);

public int compareTo(PhoneNumber pn) {
    return COMPARATOR.compare(this, pn);
}