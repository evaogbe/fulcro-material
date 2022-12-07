(ns ogbe.fulcro.mui.icons.add-task-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AddTaskSharp" :default AddTaskSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-task-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddTaskSharp)))