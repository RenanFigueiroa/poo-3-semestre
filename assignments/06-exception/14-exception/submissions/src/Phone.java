public class Phone{

    private String name;
    private String serialNumber;

    public Phone(String name, String serialNumber) throws ValidationException{
        
        validacaoName(name);
        validacaoSerialNumber(serialNumber);
        
        this.name =name;
        this.serialNumber = serialNumber;
    }

    private void validacaoName(String text)throws ValidationException{

        if(text == null|| text.trim().isEmpty()){
            throw new ValidationException("O nome do telefone não pode estar vazio.");
        }
    }

    private void validacaoSerialNumber(String text)throws ValidationException{

        if(text == null|| text.trim().length()!=16){
            throw new ValidationException("O número de série deve conter exatamente 16 dígitos.");
        }
    }


}