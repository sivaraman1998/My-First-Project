package com.stringprog;

public class String_Program3 {

	public static void main(String[] args) {
		String s1 = "my name is java";
		String[] split1 = s1.split(" ");
		int i, j, k, l;

		// java is name my
		for (i = split1.length - 1; i >= 0; i--) {
			// split1[]-java is name my
			if (i == 0) {
				System.out.print(split1[i].trim());
			} else {
				System.out.print(split1[i] + " ");
			}
		}

		System.out.println();

		// java*is*name*my
		for (j = split1.length - 1; j >= 0; j--) {
			// split1[]-java is name my
			if (j == 0) {
				System.out.print(split1[j].trim());
			} else {
				System.out.print(split1[j] + "*");
			}
		}

		System.out.println();

		// Java Is Name My
						// 3
		for (k = split1.length - 1; k >= 0; k--) {
			char upper = split1[k].toUpperCase().charAt(0);
			String substring1 = split1[k].substring(1, split1[k].length());

			System.out.print(upper + substring1 + " ");

		}

		System.out.println();

		// My Name Is Java

		for (l = 0; l <= split1.length - 1; l++) {
			char upper2 = split1[l].toUpperCase().charAt(0);
			String substring2 = split1[l].substring(1, split1[l].length());

			System.out.print(upper2 + substring2 + " ");

		}
	}
}
