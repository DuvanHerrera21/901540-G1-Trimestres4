/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.ejemplodao.dto;

import edu.co.sena.ejemplodao.dao.*;
import edu.co.sena.ejemplodao.factory.*;
import edu.co.sena.ejemplodao.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Proveedor implements Serializable
{
	/** 
	 * This attribute maps to the column TIPO_DOCUMENTO_TIPO_DOCUMENTO in the proveedor table.
	 */
	protected String tipoDocumentoTipoDocumento;

	/** 
	 * This attribute maps to the column NUM_DOCUMENTO in the proveedor table.
	 */
	protected String numDocumento;

	/** 
	 * This attribute maps to the column NOMBRE_PROVEEDOR in the proveedor table.
	 */
	protected String nombreProveedor;

	/** 
	 * This attribute maps to the column CORREO in the proveedor table.
	 */
	protected String correo;

	/**
	 * Method 'Proveedor'
	 * 
	 */
	public Proveedor()
	{
	}

	/**
	 * Method 'getTipoDocumentoTipoDocumento'
	 * 
	 * @return String
	 */
	public String getTipoDocumentoTipoDocumento()
	{
		return tipoDocumentoTipoDocumento;
	}

	/**
	 * Method 'setTipoDocumentoTipoDocumento'
	 * 
	 * @param tipoDocumentoTipoDocumento
	 */
	public void setTipoDocumentoTipoDocumento(String tipoDocumentoTipoDocumento)
	{
		this.tipoDocumentoTipoDocumento = tipoDocumentoTipoDocumento;
	}

	/**
	 * Method 'getNumDocumento'
	 * 
	 * @return String
	 */
	public String getNumDocumento()
	{
		return numDocumento;
	}

	/**
	 * Method 'setNumDocumento'
	 * 
	 * @param numDocumento
	 */
	public void setNumDocumento(String numDocumento)
	{
		this.numDocumento = numDocumento;
	}

	/**
	 * Method 'getNombreProveedor'
	 * 
	 * @return String
	 */
	public String getNombreProveedor()
	{
		return nombreProveedor;
	}

	/**
	 * Method 'setNombreProveedor'
	 * 
	 * @param nombreProveedor
	 */
	public void setNombreProveedor(String nombreProveedor)
	{
		this.nombreProveedor = nombreProveedor;
	}

	/**
	 * Method 'getCorreo'
	 * 
	 * @return String
	 */
	public String getCorreo()
	{
		return correo;
	}

	/**
	 * Method 'setCorreo'
	 * 
	 * @param correo
	 */
	public void setCorreo(String correo)
	{
		this.correo = correo;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof Proveedor)) {
			return false;
		}
		
		final Proveedor _cast = (Proveedor) _other;
		if (tipoDocumentoTipoDocumento == null ? _cast.tipoDocumentoTipoDocumento != tipoDocumentoTipoDocumento : !tipoDocumentoTipoDocumento.equals( _cast.tipoDocumentoTipoDocumento )) {
			return false;
		}
		
		if (numDocumento == null ? _cast.numDocumento != numDocumento : !numDocumento.equals( _cast.numDocumento )) {
			return false;
		}
		
		if (nombreProveedor == null ? _cast.nombreProveedor != nombreProveedor : !nombreProveedor.equals( _cast.nombreProveedor )) {
			return false;
		}
		
		if (correo == null ? _cast.correo != correo : !correo.equals( _cast.correo )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (tipoDocumentoTipoDocumento != null) {
			_hashCode = 29 * _hashCode + tipoDocumentoTipoDocumento.hashCode();
		}
		
		if (numDocumento != null) {
			_hashCode = 29 * _hashCode + numDocumento.hashCode();
		}
		
		if (nombreProveedor != null) {
			_hashCode = 29 * _hashCode + nombreProveedor.hashCode();
		}
		
		if (correo != null) {
			_hashCode = 29 * _hashCode + correo.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ProveedorPk
	 */
	public ProveedorPk createPk()
	{
		return new ProveedorPk(tipoDocumentoTipoDocumento, numDocumento);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.ejemplodao.dto.Proveedor: " );
		ret.append( "tipoDocumentoTipoDocumento=" + tipoDocumentoTipoDocumento );
		ret.append( ", numDocumento=" + numDocumento );
		ret.append( ", nombreProveedor=" + nombreProveedor );
		ret.append( ", correo=" + correo );
		return ret.toString();
	}

}