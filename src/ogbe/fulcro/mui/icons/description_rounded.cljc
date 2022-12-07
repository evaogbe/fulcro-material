(ns ogbe.fulcro.mui.icons.description-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DescriptionRounded" :default DescriptionRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-description-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DescriptionRounded)))