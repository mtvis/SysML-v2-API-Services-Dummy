package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Expression;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.Type;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(QueryQualifierExpressionImpl.class)
public abstract class QueryQualifierExpressionImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<QueryQualifierExpressionImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<QueryQualifierExpressionImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<QueryQualifierExpressionImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<QueryQualifierExpressionImpl, Membership> membership;
	public static volatile CollectionAttribute<QueryQualifierExpressionImpl, Type> type;
	public static volatile SingularAttribute<QueryQualifierExpressionImpl, String> operator;
	public static volatile SingularAttribute<QueryQualifierExpressionImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<QueryQualifierExpressionImpl, Feature> output;
	public static volatile CollectionAttribute<QueryQualifierExpressionImpl, Feature> feature;
	public static volatile ListAttribute<QueryQualifierExpressionImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<QueryQualifierExpressionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<QueryQualifierExpressionImpl, Element> member;
	public static volatile ListAttribute<QueryQualifierExpressionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<QueryQualifierExpressionImpl, Behavior> behavior;
	public static volatile SingularAttribute<QueryQualifierExpressionImpl, Boolean> isSufficient;
	public static volatile SingularAttribute<QueryQualifierExpressionImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<QueryQualifierExpressionImpl, Redefinition> ownedRedefinition;
	public static volatile ListAttribute<QueryQualifierExpressionImpl, Membership> importedMembership;
	public static volatile SingularAttribute<QueryQualifierExpressionImpl, UUID> identifier;
	public static volatile CollectionAttribute<QueryQualifierExpressionImpl, Element> ownedElement;
	public static volatile CollectionAttribute<QueryQualifierExpressionImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<QueryQualifierExpressionImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<QueryQualifierExpressionImpl, Feature> endFeature;
	public static volatile CollectionAttribute<QueryQualifierExpressionImpl, Type> referencedType;
	public static volatile ListAttribute<QueryQualifierExpressionImpl, Import> ownedImport;
	public static volatile SingularAttribute<QueryQualifierExpressionImpl, Boolean> isEnd;
	public static volatile SingularAttribute<QueryQualifierExpressionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<QueryQualifierExpressionImpl, Feature> input;
	public static volatile SingularAttribute<QueryQualifierExpressionImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<QueryQualifierExpressionImpl, Type> ownedType;
	public static volatile CollectionAttribute<QueryQualifierExpressionImpl, FeatureTyping> typing;
	public static volatile SingularAttribute<QueryQualifierExpressionImpl, String> name;
	public static volatile ListAttribute<QueryQualifierExpressionImpl, Element> ownedMember;
	public static volatile ListAttribute<QueryQualifierExpressionImpl, Expression> operand;
	public static volatile ListAttribute<QueryQualifierExpressionImpl, Membership> ownedMembership;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String MEMBERSHIP = "membership";
	public static final String TYPE = "type";
	public static final String OPERATOR = "operator";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String OUTPUT = "output";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String MEMBER = "member";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String BEHAVIOR = "behavior";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String END_FEATURE = "endFeature";
	public static final String REFERENCED_TYPE = "referencedType";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_END = "isEnd";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String INPUT = "input";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String OWNED_TYPE = "ownedType";
	public static final String TYPING = "typing";
	public static final String NAME = "name";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OPERAND = "operand";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";

}

