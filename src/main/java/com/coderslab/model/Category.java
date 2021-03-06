/**
 * 
 */
package com.coderslab.model;

import java.util.List;

import lombok.Data;

/**
 * @author Zubayer Ahamed
 *
 */
@Data
public class Category {

	private Integer categoryId;
	private String categoryName;
	private boolean status;
	private List<SubCategory> subCategories;
}
