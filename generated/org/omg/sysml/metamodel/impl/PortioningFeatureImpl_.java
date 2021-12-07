package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureChaining;
import org.omg.sysml.metamodel.FeatureDirectionKind;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.PortionKind;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.TypeFeaturing;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PortioningFeatureImpl.class)
public abstract class PortioningFeatureImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile ListAttribute<PortioningFeatureImpl, Feature> chainingFeature;
	public static volatile ListAttribute<PortioningFeatureImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<PortioningFeatureImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<PortioningFeatureImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<PortioningFeatureImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<PortioningFeatureImpl, Type> type;
	public static volatile ListAttribute<PortioningFeatureImpl, Feature> output;
	public static volatile SingularAttribute<PortioningFeatureImpl, Boolean> isSufficient;
	public static volatile ListAttribute<PortioningFeatureImpl, Comment> documentationComment;
	public static volatile SingularAttribute<PortioningFeatureImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<PortioningFeatureImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<PortioningFeatureImpl, UUID> identifier;
	public static volatile SingularAttribute<PortioningFeatureImpl, Boolean> isDerived;
	public static volatile ListAttribute<PortioningFeatureImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<PortioningFeatureImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<PortioningFeatureImpl, String> qualifiedName;
	public static volatile ListAttribute<PortioningFeatureImpl, Documentation> documentation;
	public static volatile ListAttribute<PortioningFeatureImpl, Feature> endFeature;
	public static volatile ListAttribute<PortioningFeatureImpl, Feature> directedFeature;
	public static volatile SingularAttribute<PortioningFeatureImpl, Boolean> isEnd;
	public static volatile ListAttribute<PortioningFeatureImpl, Type> featuringType;
	public static volatile ListAttribute<PortioningFeatureImpl, Feature> input;
	public static volatile SingularAttribute<PortioningFeatureImpl, Boolean> isComposite;
	public static volatile SingularAttribute<PortioningFeatureImpl, String> name;
	public static volatile ListAttribute<PortioningFeatureImpl, Element> ownedMember;
	public static volatile ListAttribute<PortioningFeatureImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<PortioningFeatureImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<PortioningFeatureImpl, Membership> membership;
	public static volatile SingularAttribute<PortioningFeatureImpl, Boolean> isPortion;
	public static volatile SingularAttribute<PortioningFeatureImpl, Boolean> isNonunique;
	public static volatile ListAttribute<PortioningFeatureImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile SingularAttribute<PortioningFeatureImpl, Boolean> isReadOnly;
	public static volatile ListAttribute<PortioningFeatureImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<PortioningFeatureImpl, Feature> feature;
	public static volatile ListAttribute<PortioningFeatureImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<PortioningFeatureImpl, Element> member;
	public static volatile ListAttribute<PortioningFeatureImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<PortioningFeatureImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<PortioningFeatureImpl, Feature> inheritedFeature;
	public static volatile SingularAttribute<PortioningFeatureImpl, String> effectiveName;
	public static volatile SingularAttribute<PortioningFeatureImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<PortioningFeatureImpl, Membership> importedMembership;
	public static volatile ListAttribute<PortioningFeatureImpl, Element> ownedElement;
	public static volatile ListAttribute<PortioningFeatureImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<PortioningFeatureImpl, FeatureMembership> featureMembership;
	public static volatile SingularAttribute<PortioningFeatureImpl, PortionKind> portionKind;
	public static volatile ListAttribute<PortioningFeatureImpl, Import> ownedImport;
	public static volatile SingularAttribute<PortioningFeatureImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<PortioningFeatureImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile SingularAttribute<PortioningFeatureImpl, String> humanId;
	public static volatile ListAttribute<PortioningFeatureImpl, String> aliasId;
	public static volatile ListAttribute<PortioningFeatureImpl, Specialization> ownedSpecialization;

	public static final String CHAINING_FEATURE = "chainingFeature";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String OUTPUT = "output";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IDENTIFIER = "identifier";
	public static final String IS_DERIVED = "isDerived";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String END_FEATURE = "endFeature";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String IS_END = "isEnd";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String INPUT = "input";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String NAME = "name";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_PORTION = "isPortion";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String OWNED_FEATURE_CHAINING = "ownedFeatureChaining";
	public static final String IS_READ_ONLY = "isReadOnly";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String DIRECTION = "direction";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String PORTION_KIND = "portionKind";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String HUMAN_ID = "humanId";
	public static final String ALIAS_ID = "aliasId";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";

}

