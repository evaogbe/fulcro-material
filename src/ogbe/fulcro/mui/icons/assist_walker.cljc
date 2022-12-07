(ns ogbe.fulcro.mui.icons.assist-walker
  #?(:cljs (:require
            ["@mui/icons-material/AssistWalker" :default AssistWalker]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-assist-walker
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AssistWalker)))