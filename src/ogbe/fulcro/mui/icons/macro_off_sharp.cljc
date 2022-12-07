(ns ogbe.fulcro.mui.icons.macro-off-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MacroOffSharp" :default MacroOffSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-macro-off-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MacroOffSharp)))