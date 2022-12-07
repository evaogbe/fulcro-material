(ns ogbe.fulcro.mui.icons.visibility-rounded
  #?(:cljs (:require
            ["@mui/icons-material/VisibilityRounded" :default VisibilityRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-visibility-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VisibilityRounded)))