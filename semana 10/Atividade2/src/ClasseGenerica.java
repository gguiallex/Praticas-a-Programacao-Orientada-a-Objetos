public class ClasseGenerica<T> {
    private T atributo1;
    private T atributo2;
    private T atributo3;

    public ClasseGenerica(T atributo1, T atributo2, T atributo3){
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    public T getAtributo1(){ return atributo1; }
    public T getAtributo2(){ return atributo2; }
    public T getAtributo3(){ return atributo3; }

    public void setAtributo1(T novoAtributo){ atributo1 = novoAtributo; }
    public void setAtributo2(T novoAtributo){ atributo2 = novoAtributo; }
    public void setAtributo3(T novoAtributo){ atributo3 = novoAtributo; }

}