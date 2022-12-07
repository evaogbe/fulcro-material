(ns ogbe.fulcro.mui.icons.grading-sharp
  #?(:cljs (:require
            ["@mui/icons-material/GradingSharp" :default GradingSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grading-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GradingSharp)))