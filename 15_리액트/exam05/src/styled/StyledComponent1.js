import { SmallButton, MediumButton } from '../CSSModule/global/Buttons';

const StyledComponent1 = () => {
  return (
    <div>
      <SmallButton color="red" bg="orange" border={false}>
        YAP
      </SmallButton>
      <MediumButton color="white" bg="blue">
        YAPYAP
      </MediumButton>
    </div>
  );
};

export default StyledComponent1;
