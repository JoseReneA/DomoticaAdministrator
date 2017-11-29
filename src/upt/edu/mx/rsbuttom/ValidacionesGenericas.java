package upt.edu.mx.rsbuttom;


import java.awt.Color;
import java.awt.Event;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author JoSeR
 */
public class ValidacionesGenericas
{
    /**Metodo que restringe el uso de letras
     * 
     * @param _ke
     * @param _tk
     * @param _mensaje
     * @return 
     */
    public String ValidaLetras(KeyEvent _ke, Toolkit _tk, String _mensaje) 
    {
        try 
        {
            char c = _ke.getKeyChar();
            if (Character.isDigit(c)) 
            {
                _tk.beep();
                _ke.consume();
                return _mensaje;
            } else 
              {
                return _mensaje = "";
              }
        } catch (Exception _ex)
        {
            throw _ex;
        }
    }
    /**Metodo que valida solo numeros
     * 
     * @param _ke
     * @param _tk
     * @param _mensaje
     * @return 
     */
    public String ValidaSoloNumeros(KeyEvent _ke, Toolkit _tk, String _mensaje) {
        try 
        {
            char c = _ke.getKeyChar();
            if (Character.isLetter(c)) {
                _tk.beep();
                _ke.consume();
                return _mensaje;
            }else
            {
                return _mensaje = "";
            }
        } catch (Exception _ex) 
        {
            throw  _ex;
        }
    }
    /**Metodo que valida la cantidad de numeros
     * 
     * @param _ke
     * @param _tk
     * @param _campo
     * @param _cantidad
     * @param _mensaje
     * @return 
     */
    public String ValidaCantidadNumerosTextField(KeyEvent _ke, Toolkit _tk, String _campo, int _cantidad, String _mensaje) 
    {
        try 
        {
            if (_campo.length() >= _cantidad)
            {
                _tk.beep();
                _ke.consume();
                return _mensaje ;
//                        "\n"+" Tienes actualmente "+_campo.length();
            }else 
            {
                return _mensaje ;
            }
        } catch (Exception _ex)
        {
            throw _ex;
        }
    }
    /**Constante que nos indica la forma de validar un correo electronico
     * 
     */
    private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    /**Metodo para validar el correo electronico usando la constante anterior
     * 
     * @param email
     * @return 
     */
    public static boolean validateEmail(String email)
    {
        try
        {
            Pattern pattern = Pattern.compile(PATTERN_EMAIL);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }catch(Exception _ex)
        {
            throw _ex;
        }
    }
    /**METODO VALIDA CORREO ELECTRONICO
     * 
     * @param _correo
     * @return 
     */
    public int validaCorreoElectronico(String _correo) 
    {
        try
        {
            boolean valida = true;
            valida = validateEmail(_correo);
            if (valida == true)
            {
                return 1;
            }else if (!valida == true)
            {
                return 0;
            }else 
            {
                return 0;
            }
        } catch (Exception _ex)
        {
            throw  _ex;
        }
    }
    /**METODO PARA LIMPIAR CAMPOS DE TEXTO
     * 
     * @param Panel 
     */
    public void limpiarCamposDeTexto(JPanel Panel) 
    {
        try
        {
            for (int x = 0; x < Panel.getComponentCount(); x++) 
            {
                if (Panel.getComponent(x) instanceof JTextField) 
                {
                    JTextField textField = (JTextField) Panel.getComponent(x);
                    textField.setText("");
                }
            }
        } catch (Exception _ex) 
        {
            throw _ex;
        }
    }
    /**Metodo para limpiar un label
     * 
     * @param Panel 
     */
     public void limpiarLabel(JPanel Panel) 
    {
        try
        {
            for (int x = 0; x < Panel.getComponentCount(); x++) 
            {
                if (Panel.getComponent(x) instanceof Label) 
                {
                    Label Label = (Label) Panel.getComponent(x);
                    Label.setText("");
                }
            }
        } catch (Exception _ex) 
        {
            throw _ex;
        }
    }
    /**METODO PARA VACIAR COMBOS
     * 
     * @param Panel 
     */
    public void limpiarCombos(JPanel Panel) 
    {
        try 
        {
            for (int x = 0; x < Panel.getComponentCount(); x++) 
            {
                if (Panel.getComponent(x) instanceof JComboBox) 
                {
                    JComboBox jcombo = (JComboBox) Panel.getComponent(x);
                    jcombo.setSelectedItem("-Seleccionar-");
                }
            }
        } catch (Exception _ex) 
        {
            throw _ex;
        }
    }
    /**METODO QUE PREGUNTA LA ACCION A REALIZAR
     * 
     * @param _mensaje
     * @return 
     */
    public int PreguntarAccion(String _mensaje) 
    {
        try
        {
            int valor = JOptionPane.showConfirmDialog(null, _mensaje);
            if (valor == JOptionPane.YES_OPTION) 
            {
                return 1;
            } else if (valor == JOptionPane.NO_OPTION) 
            {
                return 0;
            } else if (valor == JOptionPane.CANCEL_OPTION) 
            {
                return 0;
            } else 
            {
                return 0;
            }
        } catch (Exception _ex) 
        {
            throw _ex;
        }
    }
    /**METODO QUE VERIFICA EL ESTATUS ACTUAL DE LOS TEXTFIELD
     * 
     * @param _panel 
     */
    public void verificarEstatusJtextfield(JPanel _panel)
    {
        try 
        {
            for (int x = 0; x < _panel.getComponentCount(); x++)
            {
                if (_panel.getComponent(x) instanceof JTextField ) 
                {
                    JTextField textField = (JTextField) _panel.getComponent(x);
                    if (textField.getText().isEmpty()) 
                    {
                        textField.setBackground(Color.RED);

                    } 
                    else if (!textField.getText().isEmpty()) 
                    {
                        textField.setBackground(Color.white);

                    }
                }
            }
        } catch (Exception _ex) {
            throw _ex;
        }
    }
    /**METODO PARA VERIFICAR JADATEcHOOSER
     * 
     * @param _panel
     * @return 
     */
//     public void verificarEstatusDATEcHOOSERd(JPanel _panel)
//    {
//        try 
//        {
//            for (int x = 0; x < _panel.getComponentCount(); x++)
//            {
//                if (_panel.getComponent(x) instanceof JDateChooser ) 
//                {
//                    JDateChooser jdc = (JDateChooser) _panel.getComponent(x);
//                    if (jdc.getDate()==null) 
//                    {
//                        jdc.setBackground(Color.RED);
//                    } 
//                    else if (jdc.getDate()!=null) 
//                    {
//                        jdc.setBackground(Color.white);
//
//                    }
//                }
//            }
//        } catch (Exception _ex) {
//            throw _ex;
//        }
//    }
    /**METODO QUE VERIFICA EL ESTATUS ACTUAL DE LOS TEXTFIELD
     * 
     * @param _panel
     * @return 
     */
    public int verificarEstatusJtextfieldReturn(JPanel _panel)
    {
        try 
        {
            for (int x = 0; x < _panel.getComponentCount(); x++)
            {
                if (_panel.getComponent(x) instanceof JTextField ) 
                {
                    JTextField textField = (JTextField) _panel.getComponent(x);
                    if (textField.getText().isEmpty()) 
                    {
//                        textField.setBackground(Color.RED);
                        return 0;
                    } 
                    else if (!textField.getText().isEmpty()) 
                    {
//                        textField.setBackground(Color.white);
                        return 1;
                    }
                }
            }
        } catch (Exception _ex) {
            throw _ex;
        }
        return 0;
    }
    /**Metodo que verifica el estatus del textArea
     * 
     * @param _panel
     * @return 
     */
      public int verificarEstatusJtextarea(JPanel _panel)
    {
        try 
        {
            for (int x = 0; x < _panel.getComponentCount(); x++)
            {
                if (_panel.getComponent(x) instanceof JTextArea ) 
                {
                    JTextArea textarea = (JTextArea) _panel.getComponent(x);
                    if (textarea.getText().isEmpty()) 
                    {
//                        textField.setBackground(Color.RED);
                        return 0;
                    } 
                    else if (!textarea.getText().isEmpty()) 
                    {
//                        textField.setBackground(Color.white);
                        return 1;
                    }
                }
            }
        } catch (Exception _ex) {
            throw _ex;
        }
        return 0;
    }
    /**METODO QUE VERIFICA EL VALOR ACTUAL DE LOS COMBOS
     * 
     * @param _panel 
     */
      public void verificarEstatusCombo(JPanel _panel)
      {
        try 
        {
            for (int x = 0; x < _panel.getComponentCount(); x++)
            {
                if (_panel.getComponent(x) instanceof JComboBox ) 
                {
                    JComboBox jcombo = (JComboBox) _panel.getComponent(x);
                    if (jcombo.getSelectedItem()=="-Seleccionar-") 
                    {
                        jcombo.setBackground(Color.RED);
                    } else if (jcombo.getSelectedItem()!="-Seleccionar-") 
                    {
                        jcombo.setBackground(Color.white);
                    }
                }
            }
        } catch (Exception _ex) 
        {
            throw  _ex;
        }
    }
      /**METODO VALIDA TEXTAREA Y LE COLOCA UN COLOR 
       * 
       * @param _panel 
       */
       public void validarTextArea(JPanel _panel)
    {
        try 
        {
            for (int x = 0; x < _panel.getComponentCount(); x++)
            {
                if (_panel.getComponent(x) instanceof JTextArea ) 
                {
                    JTextArea jta = (JTextArea) _panel.getComponent(x);
                    if (jta.getText().equals(""))
                    {
                        jta.setBackground(Color.white);
                    } 
                    else if (!jta.getText().equals("")) 
                    {
                       jta.setBackground(Color.red);
                    }
                }
            }
        } catch (Exception _ex) {
            throw _ex;
        }
    }
      //METODO QUE VERIFICA EL ESTADO ACTUAL DE MIS COMBOS
      public int verificarEstatusComboreturn(JPanel _panel)
      {
        try 
        {
            for (int x = 0; x < _panel.getComponentCount(); x++)
            {
                if (_panel.getComponent(x) instanceof JComboBox ) 
                {
                    JComboBox jcombo = (JComboBox) _panel.getComponent(x);
                    if (jcombo.getSelectedItem()=="-Seleccionar-") 
                    {
//                        jcombo.setBackground(Color.RED);
                        return 0;
                    } else if (jcombo.getSelectedItem()!="-Seleccionar-") 
                    {
//                        jcombo.setBackground(Color.white);
                        return 1;
                    }
                }
            }
        } catch (Exception _ex) 
        {
            throw  _ex;
        }
        return 0;
    }
    /**METODO PARA PINTAR DE BLANCO LOS COMBOS CUANDO SEAN DIFERENTES DE SELECCIONAR
     * 
     * @param _panel 
     */ 
    public void verificarComboEsDiferenteDeSeleccionar(JPanel _panel)
    {
        try 
        {
            for (int x = 0; x < _panel.getComponentCount(); x++)
            {
                if (_panel.getComponent(x) instanceof JComboBox ) 
                {
                    JComboBox jcombo = (JComboBox) _panel.getComponent(x);
                     if (jcombo.getSelectedItem()!="-Seleccionar-") 
                     {
                        jcombo.setBackground(Color.white);
                     }
                }
            }
        } catch (Exception _ex) {
            throw _ex;
        }
    }
    /**METODO PARA PINTAR DE BLANCO LAS CAJAS DE TEXTO SI ESTAS ESTAN LLENAS 
     * 
     * @param _panel 
     */
    public void verificarCajasTextoSiEstanLlenas(JPanel _panel)
    {
        try {
            for (int x = 0; x < _panel.getComponentCount(); x++) 
            {
                if (_panel.getComponent(x) instanceof JTextField )
                {
                    JTextField jtextField = (JTextField) _panel.getComponent(x);
                    if (!jtextField.getText().isEmpty()) 
                    {
                       jtextField.setBackground(Color.white);
                    }
                }
            }
        } catch (Exception _ex)
        {
            throw  _ex;
        }
    }
    //VALIDAMOS CUANDO SE ACTUALICE 
    public String ValidaActualizando(String _id, String[] _combo, String _mensajeError)
    {
        try 
        {
            String Mensaje;
            if (_id.isEmpty() && _combo[0].equals("-Seleccionar-"))
            {
                return Mensaje = _mensajeError;
            } else
            {
                return Mensaje = "";
            }
        } catch (Exception _ex) 
        {
            return _ex.toString();
        }
    }
    /**VALIDAMOS EL CAMPO DE NUMERO TELEFONICO
     * 
     * @param _valor 
     */
    public void CampoNumeroTelefonico(JTextField _valor)
    {
        try
        {
            String valor=_valor.getText();
            if(valor.length()==3)
            {
                _valor.setText(valor+"-");
            }
            if(valor.length()==7)
            {
                _valor.setText(valor+"-");  
            }
            if(valor.length()==10)
            {
                _valor.setText(valor+"-");  
            }
        }catch(Exception _ex)
        {
            throw _ex;
        }
    }  
    /**VERIFICAMOS SI EXISTEN CAMPOS VACIOS
     * 
     * @param _panel
     * @return 
     */
    public boolean verificarCajasTexto(JPanel _panel) 
    {
        try 
        {          
            for (int x = 0; x < _panel.getComponentCount(); x++) 
            {
                if (_panel.getComponent(x) instanceof JTextField )
                {
                    JTextField jtextField= (JTextField) _panel.getComponent(x);
                    if (jtextField.getText().isEmpty()) 
                    {
                        return true;
                    }else if(!jtextField.getText().isEmpty())
                    {
                        return false;
                    }
                }
            }
        } catch (Exception _ex)
        {
          throw _ex;
        }
        return false;
    } 
    /**Validamos la accion del JoptionPane
     * 
     * @param _mensaje
     * @param _accion1
     * @param _accion2 
     */
    public void ValidarAccionJoptionPaneJinternalFrame(String _mensaje,JInternalFrame _accion1,JInternalFrame _accion2)
    {
        try 
        {
         int valor=JOptionPane.showConfirmDialog(null, _mensaje);
        if(valor==JOptionPane.YES_OPTION)
        {
            _accion1.setVisible(false);
        }  else if(valor==JOptionPane.NO_OPTION)
        {
           //NO HACEMOS NADA
        }else
        {   
            _accion2.setVisible(false);
        }    
        } catch (Exception e) 
        {
          
        }        
       
    }
    /**METODO PARA MOSTRAR NUMERO DE CARACTERES INGRESADOS EN UN CAMPO DE TEXTO
     * 
     * @param _textArea
     * @param _numeroCaracteres
     * @param _evt
     * @param _mensaje
     * @return 
     */
    public String mostrarNumeroCaracteres(JTextArea _textArea,int _numeroCaracteres,KeyEvent _evt,String _mensaje)
    {
           if (_textArea.getText().length() >= _numeroCaracteres)
        {
            _evt.consume();
            return _mensaje=("Se han cubierto el numero maximo de caracteres");
        }else
          {
            return  _mensaje=("");
          }
    }
    public String FechaActual() 
    {
        try
        {
            Calendar fecha = Calendar.getInstance();
            int anio = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH) + 1;
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
            String fechaFinal = anio + "-" + mes + "-" + dia;
            return fechaFinal;
        }catch(Exception _ex)
        {
            throw _ex;
        }
    }
    public int obtenerAnio() 
    {
        try
        {
            Calendar fecha = Calendar.getInstance();
            int anio = fecha.get(Calendar.YEAR);
            return anio;
        }catch(Exception _ex)
        {
            throw _ex;
        }
    }
    public int obtenerDia() 
    {
        try
        {
            Calendar fecha = Calendar.getInstance();
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
            return dia;
        }catch(Exception _ex)
        {
            throw _ex;
        }
    }
    public int obtenerMes() 
    {
        try
        {
            Calendar fecha = Calendar.getInstance();
            int mes = fecha.get(Calendar.MONTH) + 1;
            return mes;
        }catch(Exception _ex)
        {
            throw _ex;
        }
    }
}
