(ns ogbe.fulcro.mui.icons.macro-off
  #?(:cljs (:require
            ["@mui/icons-material/MacroOff" :default MacroOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-macro-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MacroOff)))