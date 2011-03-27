package br.org.mosaic.tags.text;

/**
 * @author andrew
 */
public enum RelationBetween {
	ALTERNATE, // An alternate version of the document (i.e. print page,
	// translated or mirror)
	STYLESHEET, // An external style sheet for the document
	START, // The first document in a selection
	NEXT, // The next document in a selection
	PREV, // The previous document in a selection
	CONTENTS, // A table of contents for the document
	INDEX, // An index for the document
	GLOSSARY, // A glossary (explanation) of words used in the document
	COPYRIGHT, // A document containing copyright information
	CHAPTER, // A chapter of the document
	SECTION, // A section of the document
	SUBSECTION, // A subsection of the document
	APPENDIX, // An appendix for the document
	HELP, // A help document
	BOOKMARK, // A related document
	NOFOLLOW, // "nofollow" is used by Google, to specify that the Google search
	// spider should not follow that link (mostly used for paid links)
	LICENCE, TAG, FRIEND
}