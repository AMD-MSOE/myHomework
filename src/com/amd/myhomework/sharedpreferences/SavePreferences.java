package com.amd.myhomework.sharedpreferences;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;

import com.amd.myhomework.models.Class;
import com.amd.myhomework.models.Homework;

public class SavePreferences {

	private static SavePreferences uniqueInstance;
	private Context context = null;

	private SavePreferences() {
	}

	public static SavePreferences getInstance() {
		if (uniqueInstance == null) {
			synchronized (SavePreferences.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new SavePreferences();
				}
			}
		}
		return uniqueInstance;
	}

	public void setContext(Context c) {
		this.context = c;
	}

	private boolean saveClass(Class c, ObjectOutputStream oos) {
		boolean retVal = false;
		try {
			oos.writeObject(c);
			retVal = true;

		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}

		return retVal;
	}

	public boolean saveClasses(List<Class> classes) {
		boolean retVal = true;
		FileOutputStream out;
		try {
			out = context.openFileOutput("myHomeworkClasses.txt",
					Context.MODE_PRIVATE);
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeInt(classes.size());
			for (Class c : classes) {
				if (saveClass(c, oos) == false) {
					retVal = false;
				}
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
		return retVal;

	}

	public List<Class> loadClasses() throws IOException {
		List<Class> classes = new ArrayList<Class>();
		FileInputStream in = context.openFileInput("myHomeworkClasses.txt");
		ObjectInputStream ois = new ObjectInputStream(in);

		int numClasses = ois.readInt();

		for (int i = 0; i < numClasses; i++) {
			try {
				classes.add((Class) ois.readObject());
			} catch (ClassNotFoundException e) {}
		}
		return classes;
	}

	public void saveHomework(Homework hw) {
		
	}
}
