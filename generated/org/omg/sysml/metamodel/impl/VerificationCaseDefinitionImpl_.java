package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.AllocationUsage;
import org.omg.sysml.metamodel.AnalysisCaseUsage;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.ConcernUsage;
import org.omg.sysml.metamodel.ConnectionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EnumerationUsage;
import org.omg.sysml.metamodel.Expression;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.OccurrenceUsage;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StakeholderUsage;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Step;
import org.omg.sysml.metamodel.Superclassing;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(VerificationCaseDefinitionImpl.class)
public abstract class VerificationCaseDefinitionImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, CalculationUsage> calculation;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, PortUsage> ownedPort;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, EnumerationUsage> ownedEnumeration;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, VerificationCaseUsage> ownedVerificationCase;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, Usage> usage;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, ViewpointUsage> ownedViewpoint;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, AnalysisCaseUsage> ownedAnalysisCase;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, RenderingUsage> ownedRendering;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, ConstraintUsage> ownedConstraint;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Feature> output;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, Usage> variant;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, ActionUsage> action;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, ItemUsage> ownedItem;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, Boolean> isSufficient;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Comment> documentationComment;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, UUID> identifier;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, ViewUsage> ownedView;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, Usage> flowFeature;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, String> qualifiedName;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Documentation> documentation;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Feature> endFeature;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, AllocationUsage> ownedAllocation;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, InterfaceUsage> ownedInterface;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Feature> input;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, ActionUsage> ownedAction;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, CaseUsage> ownedCase;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, CalculationUsage> ownedCalculation;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, OccurrenceUsage> ownedOccurrence;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, String> name;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, ReferenceUsage> ownedReference;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, Usage> ownedUsage;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Element> ownedMember;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, StateUsage> ownedState;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, RequirementUsage> verifiedRequirement;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, Boolean> isIndividual;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Membership> membership;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, Superclassing> ownedSuperclassing;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, Boolean> isVariation;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Feature> feature;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Feature> parameter;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Element> member;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, TransitionUsage> ownedTransition;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, String> effectiveName;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Membership> importedMembership;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Element> ownedElement;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, Expression> expression;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, Boolean> isModelLevelEvaluable;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, ConnectionUsage> ownedConnection;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Import> ownedImport;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, RequirementUsage> ownedRequirement;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, String> humanId;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, StakeholderUsage> ownedStakeholder;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, String> aliasId;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, ConcernUsage> ownedConcern;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, Step> step;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, AttributeUsage> ownedAttribute;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, PartUsage> ownedPart;

	public static final String CALCULATION = "calculation";
	public static final String OWNED_PORT = "ownedPort";
	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String OWNED_ENUMERATION = "ownedEnumeration";
	public static final String OWNED_VERIFICATION_CASE = "ownedVerificationCase";
	public static final String USAGE = "usage";
	public static final String OWNED_VIEWPOINT = "ownedViewpoint";
	public static final String OWNED_ANALYSIS_CASE = "ownedAnalysisCase";
	public static final String OWNED_RENDERING = "ownedRendering";
	public static final String OWNED_CONSTRAINT = "ownedConstraint";
	public static final String OUTPUT = "output";
	public static final String VARIANT = "variant";
	public static final String ACTION = "action";
	public static final String OWNED_ITEM = "ownedItem";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_VIEW = "ownedView";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String FLOW_FEATURE = "flowFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String END_FEATURE = "endFeature";
	public static final String OWNED_ALLOCATION = "ownedAllocation";
	public static final String OWNED_INTERFACE = "ownedInterface";
	public static final String INPUT = "input";
	public static final String OWNED_ACTION = "ownedAction";
	public static final String OWNED_CASE = "ownedCase";
	public static final String OWNED_CALCULATION = "ownedCalculation";
	public static final String OWNED_OCCURRENCE = "ownedOccurrence";
	public static final String NAME = "name";
	public static final String OWNED_REFERENCE = "ownedReference";
	public static final String OWNED_USAGE = "ownedUsage";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String OWNED_STATE = "ownedState";
	public static final String VERIFIED_REQUIREMENT = "verifiedRequirement";
	public static final String IS_INDIVIDUAL = "isIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_SUPERCLASSING = "ownedSuperclassing";
	public static final String IS_VARIATION = "isVariation";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String OWNED_TRANSITION = "ownedTransition";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String EXPRESSION = "expression";
	public static final String IS_MODEL_LEVEL_EVALUABLE = "isModelLevelEvaluable";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String OWNED_CONNECTION = "ownedConnection";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String OWNED_REQUIREMENT = "ownedRequirement";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String HUMAN_ID = "humanId";
	public static final String OWNED_STAKEHOLDER = "ownedStakeholder";
	public static final String ALIAS_ID = "aliasId";
	public static final String OWNED_CONCERN = "ownedConcern";
	public static final String STEP = "step";
	public static final String OWNED_ATTRIBUTE = "ownedAttribute";
	public static final String OWNED_PART = "ownedPart";

}

