(ns ogbe.fulcro.mui.icons.volcano-rounded
  #?(:cljs (:require
            ["@mui/icons-material/VolcanoRounded" :default VolcanoRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-volcano-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VolcanoRounded)))