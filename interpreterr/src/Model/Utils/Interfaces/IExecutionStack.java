package Model.Utils.Interfaces;

import Model.Interfaces.IStatement;

import java.util.Stack;

public interface IExecutionStack {
    IStatement pop();
    void push(IStatement s);
    boolean isEmpty();
    Stack<IStatement> getIterator();
    String toString();
}