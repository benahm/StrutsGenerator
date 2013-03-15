package dsml.struts.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;

import dsml.struts.toolbox.XMI;
import dsml.web.BetweenValidator;
import dsml.web.Field;
import dsml.web.Form;
import dsml.web.FormElement;
import dsml.web.Link;
import dsml.web.Page;
import dsml.web.RegexValidator;
import dsml.web.StringLengthValidator;
import dsml.web.Website;

public class Validator {
	private Website website;
	private String filePath;
	private Errors errors = new Errors();

	public Validator(String filePath) {
		this.filePath = filePath;
	}

	public void validate() {
		try {
			website = XMI.loadWebsite(new File(filePath));
			EList<Page> pages = website.getPages();
			for (Page page : pages) {
				validate(page);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void validate(Page page) {
		if (!validate(page.getName()))
			errors.add(ProtoError.PAGE_NAME);
		EList<Link> links = page.getLinks();
		for (Link link : links) {
			validate(link);
		}
		Form form = page.getForm();
		if (form != null)
			validate(form);
	}

	private void validate(Link link) {
		String value = link.getValue();
		if (value == null)
			errors.add(ProtoError.LINK_VALUE);
		if (value == "")
			errors.add(ProtoError.LINK_VALUE);
	}

	private void validate(Form form) {
		if (!validate(form.getAction()))
			errors.add(ProtoError.FORM_ACTION);
		EList<FormElement> elements = form.getFormElements();
		for (FormElement formElement : elements) {
			validate(formElement);
		}
	}

	private void validate(FormElement formElement) {
		if (!validate(formElement.getName())) {
			errors.add(ProtoError.FORMELEMENT_NAME);
			System.out.println(formElement.getName());
		}
		try {
			Field field = (Field) formElement;

			EList<dsml.web.Validator> fieldValidators = field.getValidator();
			for (dsml.web.Validator validator : fieldValidators) {
				validate(validator);
			}
		} catch (ClassCastException e) {
		}
	}

	private void validate(dsml.web.Validator validator) {
		if (validator instanceof BetweenValidator) {
			BetweenValidator betweenV = (BetweenValidator) validator;
			if (betweenV.getValueL() > betweenV.getValueG())
				errors.add(ProtoError.VALIDATOR_BETWEEN);
		} else if (validator instanceof StringLengthValidator) {
			StringLengthValidator StringLengthV = (StringLengthValidator) validator;
			if (StringLengthV.getMin() > StringLengthV.getMax())
				errors.add(ProtoError.VALIDATOR_STRING_LENGTH);
		} else if (validator instanceof RegexValidator) {
			RegexValidator RegexV = (RegexValidator) validator;
			if (RegexV.getRegex() == null)
				errors.add(ProtoError.VALIDATOR_REGEX);
		}
	}

	private boolean validate(String name) {
		System.out.println(name);
		if (name == null)
			return false;
		String regex = "[a-zA-Z][a-zA-Z0-9_]*";
		return Pattern.matches(regex, name);

	}

	public ArrayList<String> getErrors() {
		return errors.getErrors();
	}

	public static void main(String[] args) {
		Validator validator = new Validator("model/My.dsml");
		validator.validate();
		System.out.println(validator.errors);
	}
}
