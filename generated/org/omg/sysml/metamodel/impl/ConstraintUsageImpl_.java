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
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Class;
import org.omg.sysml.metamodel.Classifier;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.ConcernUsage;
import org.omg.sysml.metamodel.ConnectionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EnumerationUsage;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.OccurrenceUsage;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.PortionKind;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StakeholderUsage;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.TypeFeaturing;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ConstraintUsageImpl.class)
public abstract class ConstraintUsageImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<ConstraintUsageImpl, Generalization> ownedGeneralization;
	public static volatile CollectionAttribute<ConstraintUsageImpl, PartUsage> nestedPart;
	public static volatile ListAttribute<ConstraintUsageImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<ConstraintUsageImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<ConstraintUsageImpl, Usage> usage;
	public static volatile SingularAttribute<ConstraintUsageImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<ConstraintUsageImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<ConstraintUsageImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<ConstraintUsageImpl, Type> type;
	public static volatile CollectionAttribute<ConstraintUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile ListAttribute<ConstraintUsageImpl, Feature> output;
	public static volatile CollectionAttribute<ConstraintUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<ConstraintUsageImpl, TransitionUsage> nestedTransition;
	public static volatile CollectionAttribute<ConstraintUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile CollectionAttribute<ConstraintUsageImpl, Usage> variant;
	public static volatile SingularAttribute<ConstraintUsageImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<ConstraintUsageImpl, StateUsage> nestedState;
	public static volatile ListAttribute<ConstraintUsageImpl, Comment> documentationComment;
	public static volatile SingularAttribute<ConstraintUsageImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<ConstraintUsageImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<ConstraintUsageImpl, UUID> identifier;
	public static volatile CollectionAttribute<ConstraintUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile ListAttribute<ConstraintUsageImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<ConstraintUsageImpl, EnumerationUsage> nestedEnumeration;
	public static volatile ListAttribute<ConstraintUsageImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<ConstraintUsageImpl, Usage> flowFeature;
	public static volatile SingularAttribute<ConstraintUsageImpl, String> qualifiedName;
	public static volatile ListAttribute<ConstraintUsageImpl, Documentation> documentation;
	public static volatile CollectionAttribute<ConstraintUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile CollectionAttribute<ConstraintUsageImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile ListAttribute<ConstraintUsageImpl, Feature> endFeature;
	public static volatile SingularAttribute<ConstraintUsageImpl, Boolean> isEnd;
	public static volatile CollectionAttribute<ConstraintUsageImpl, ItemUsage> nestedItem;
	public static volatile ListAttribute<ConstraintUsageImpl, Type> featuringType;
	public static volatile ListAttribute<ConstraintUsageImpl, Feature> input;
	public static volatile CollectionAttribute<ConstraintUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile SingularAttribute<ConstraintUsageImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<ConstraintUsageImpl, ViewUsage> nestedView;
	public static volatile SingularAttribute<ConstraintUsageImpl, String> name;
	public static volatile ListAttribute<ConstraintUsageImpl, Element> ownedMember;
	public static volatile CollectionAttribute<ConstraintUsageImpl, OccurrenceUsage> nestedOccurrence;
	public static volatile ListAttribute<ConstraintUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<ConstraintUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<ConstraintUsageImpl, AllocationUsage> nestedAllocation;
	public static volatile SingularAttribute<ConstraintUsageImpl, Boolean> isIndividual;
	public static volatile ListAttribute<ConstraintUsageImpl, Membership> membership;
	public static volatile SingularAttribute<ConstraintUsageImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<ConstraintUsageImpl, ReferenceUsage> nestedReference;
	public static volatile SingularAttribute<ConstraintUsageImpl, Boolean> isVariation;
	public static volatile ListAttribute<ConstraintUsageImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<ConstraintUsageImpl, Feature> feature;
	public static volatile ListAttribute<ConstraintUsageImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<ConstraintUsageImpl, Feature> parameter;
	public static volatile ListAttribute<ConstraintUsageImpl, Element> member;
	public static volatile ListAttribute<ConstraintUsageImpl, Class> occurrenceDefinition;
	public static volatile ListAttribute<ConstraintUsageImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<ConstraintUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<ConstraintUsageImpl, Classifier> definition;
	public static volatile ListAttribute<ConstraintUsageImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<ConstraintUsageImpl, Behavior> behavior;
	public static volatile SingularAttribute<ConstraintUsageImpl, String> effectiveName;
	public static volatile ListAttribute<ConstraintUsageImpl, Membership> importedMembership;
	public static volatile ListAttribute<ConstraintUsageImpl, Element> ownedElement;
	public static volatile SingularAttribute<ConstraintUsageImpl, Boolean> isModelLevelEvaluable;
	public static volatile CollectionAttribute<ConstraintUsageImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<ConstraintUsageImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<ConstraintUsageImpl, FeatureMembership> featureMembership;
	public static volatile SingularAttribute<ConstraintUsageImpl, PortionKind> portionKind;
	public static volatile CollectionAttribute<ConstraintUsageImpl, ConcernUsage> nestedConcern;
	public static volatile CollectionAttribute<ConstraintUsageImpl, StakeholderUsage> nestedStakeholder;
	public static volatile ListAttribute<ConstraintUsageImpl, Import> ownedImport;
	public static volatile SingularAttribute<ConstraintUsageImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<ConstraintUsageImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<ConstraintUsageImpl, VariantMembership> variantMembership;
	public static volatile CollectionAttribute<ConstraintUsageImpl, RenderingUsage> nestedRendering;
	public static volatile SingularAttribute<ConstraintUsageImpl, String> humanId;
	public static volatile CollectionAttribute<ConstraintUsageImpl, ConnectionUsage> nestedConnection;
	public static volatile ListAttribute<ConstraintUsageImpl, String> aliasId;
	public static volatile CollectionAttribute<ConstraintUsageImpl, InterfaceUsage> nestedInterface;
	public static volatile CollectionAttribute<ConstraintUsageImpl, ViewpointUsage> nestedViewpoint;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String NESTED_PART = "nestedPart";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String USAGE = "usage";
	public static final String IS_UNIQUE = "isUnique";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String NESTED_REQUIREMENT = "nestedRequirement";
	public static final String OUTPUT = "output";
	public static final String NESTED_PORT = "nestedPort";
	public static final String NESTED_TRANSITION = "nestedTransition";
	public static final String NESTED_CONSTRAINT = "nestedConstraint";
	public static final String VARIANT = "variant";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String NESTED_STATE = "nestedState";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IDENTIFIER = "identifier";
	public static final String NESTED_ATTRIBUTE = "nestedAttribute";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String NESTED_ENUMERATION = "nestedEnumeration";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String FLOW_FEATURE = "flowFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String NESTED_ANALYSIS_CASE = "nestedAnalysisCase";
	public static final String NESTED_VERIFICATION_CASE = "nestedVerificationCase";
	public static final String END_FEATURE = "endFeature";
	public static final String IS_END = "isEnd";
	public static final String NESTED_ITEM = "nestedItem";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String INPUT = "input";
	public static final String NESTED_CALCULATION = "nestedCalculation";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String NESTED_VIEW = "nestedView";
	public static final String NAME = "name";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String NESTED_OCCURRENCE = "nestedOccurrence";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String NESTED_CASE = "nestedCase";
	public static final String NESTED_ALLOCATION = "nestedAllocation";
	public static final String IS_INDIVIDUAL = "isIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String NESTED_REFERENCE = "nestedReference";
	public static final String IS_VARIATION = "isVariation";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OCCURRENCE_DEFINITION = "occurrenceDefinition";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String DEFINITION = "definition";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String BEHAVIOR = "behavior";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String IS_MODEL_LEVEL_EVALUABLE = "isModelLevelEvaluable";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String PORTION_KIND = "portionKind";
	public static final String NESTED_CONCERN = "nestedConcern";
	public static final String NESTED_STAKEHOLDER = "nestedStakeholder";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String NESTED_RENDERING = "nestedRendering";
	public static final String HUMAN_ID = "humanId";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String ALIAS_ID = "aliasId";
	public static final String NESTED_INTERFACE = "nestedInterface";
	public static final String NESTED_VIEWPOINT = "nestedViewpoint";

}

