(ns ogbe.fulcro.mui.icons.add-task-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AddTaskOutlined" :default AddTaskOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-task-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddTaskOutlined)))