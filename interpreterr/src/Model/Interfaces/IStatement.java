package Model.Interfaces;

import Model.Exceptions.*;
import Model.Utils.Interfaces.IProgramState;
import Model.Utils.ProgramState;

import java.io.IOException;

public interface IStatement {

    public IProgramState execute(ProgramState state)
            throws InvalidSignException, DuplicateSymbolException, InvalidFileException, IOException,
            DuplicateFileException, InvalidSymbolException, InvalidAddressException, NullAdressException;
}