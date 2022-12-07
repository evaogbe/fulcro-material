(ns ogbe.fulcro.mui.icons.visibility-sharp
  #?(:cljs (:require
            ["@mui/icons-material/VisibilitySharp" :default VisibilitySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-visibility-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VisibilitySharp)))