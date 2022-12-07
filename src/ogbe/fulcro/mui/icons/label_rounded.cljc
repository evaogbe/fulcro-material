(ns ogbe.fulcro.mui.icons.label-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LabelRounded" :default LabelRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-label-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LabelRounded)))