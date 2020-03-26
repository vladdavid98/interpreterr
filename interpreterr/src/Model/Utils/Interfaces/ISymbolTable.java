package Model.Utils.Interfaces;

import Model.Exceptions.DuplicateSymbolException;
import Model.Exceptions.InvalidSymbolException;

import java.util.HashMap;
import java.util.Set;

;

public interface ISymbolTable {
    int getValueOf(String s) throws InvalidSymbolException;
    void addSymbol (String s, int val) throws DuplicateSymbolException;
    void setValue(String s , int val) throws InvalidSymbolException;
    Set<String> getKeyset();
    String toString();
    HashMap<String, Integer> getContent();
}