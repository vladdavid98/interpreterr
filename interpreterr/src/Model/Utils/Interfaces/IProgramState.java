package Model.Utils.Interfaces;

import Model.Exceptions.*;
import Model.Interfaces.IStatement;

import java.io.IOException;
import java.util.ArrayList;

public interface IProgramState  {
    public void executeNextStep()
            throws InvalidStateException, InvalidSignException, DuplicateSymbolException, InvalidFileException,
            IOException, DuplicateFileException, InvalidSymbolException, InvalidAddressException, NullAdressException;
    public String toString();
    public ArrayList<Integer> getOutput();
    public boolean isDone();
    public IHeap getHeap();
    public ISymbolTable getSymTable();
    public IFileTable getFileTable();
    void addStatement(IStatement s);
}