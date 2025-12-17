package isep.switchdev;

import isep.switchdev.Enum.TypeOfBinding;

import java.util.List;
import java.util.concurrent.locks.Condition;

public class Item {
    // Attributes:
    private Condition _condition;
    private double weight;
    private List<Pictures> _pictures;
    private Dimensions _dimension;
    private TypeOfBinding _typeOfBinding;
    private String _edition;

    /*
     * Item é uma classe genérica que representa atributos físicos comuns
     * (condição, peso, dimensões, imagens, tipo de encadernação, edição).
     *
     * Book e Magazine NÃO estendem Item.
     * Cada Book/Magazine deve conter um Item (relação "tem um").
     *Acho que não deveria estar em item para evitar dependências entre classes.
     */


    //Construtor Book:
    public Item(String book, Condition condition, double weigth, List<Pictures> pictures, Dimensions dimension, TypeOfBinding typeOfBinding, String edition) {
        this._condition = condition;
        this.weight = weigth;
        this._pictures = pictures;
        this._dimension = dimension;
        this._typeOfBinding = typeOfBinding;
        this._edition = edition;
    }

    //Construtor Magazine:
    public Item(Double magazine, Condition condition, double weigth, List<Pictures> pictures, Dimensions dimension, TypeOfBinding typeOfBinding, String edition) {
        this._condition = condition;
        this.weight = weigth;
        this._pictures = pictures;
        this._dimension = dimension;
        this._typeOfBinding = typeOfBinding;
        this._edition = edition;
    }

}

