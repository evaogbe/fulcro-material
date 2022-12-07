(ns ogbe.fulcro.mui.icons.grading
  #?(:cljs (:require
            ["@mui/icons-material/Grading" :default Grading]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grading
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Grading)))