(ns ogbe.fulcro.mui.icons.visibility-off-rounded
  #?(:cljs (:require
            ["@mui/icons-material/VisibilityOffRounded" :default VisibilityOffRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-visibility-off-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VisibilityOffRounded)))