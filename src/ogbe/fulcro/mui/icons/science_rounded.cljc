(ns ogbe.fulcro.mui.icons.science-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ScienceRounded" :default ScienceRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-science-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScienceRounded)))