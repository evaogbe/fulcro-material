(ns ogbe.fulcro.mui.icons.attribution-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AttributionRounded" :default AttributionRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-attribution-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AttributionRounded)))