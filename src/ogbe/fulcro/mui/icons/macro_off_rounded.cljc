(ns ogbe.fulcro.mui.icons.macro-off-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MacroOffRounded" :default MacroOffRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-macro-off-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MacroOffRounded)))