const TodoForm = ({ form, onSubmit, onChange }) => {
  return (
    <form onSubmit={onSubmit}>
      <div>
        <input
          type="text"
          onChange={onChange}
          name="title"
          placeholder="제목"
          value={form?.title ?? ''}
        />
      </div>
      <div>
        <textarea
          onChange={onChange}
          name="content"
          placeholder="내용"
          value={form?.content ?? ''}
        />
      </div>
      <button type="submit"></button>
    </form>
  );
};

export default TodoForm;
