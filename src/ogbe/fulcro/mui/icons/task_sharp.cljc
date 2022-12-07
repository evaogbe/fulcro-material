(ns ogbe.fulcro.mui.icons.task-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TaskSharp" :default TaskSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-task-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TaskSharp)))